package vista;

import controlador.CocheController;
import modelo.Coche;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static CocheController cc = new CocheController();
    public static void main(String[] args) {
        Scanner scL = new Scanner(System.in);
        Scanner scN = new Scanner(System.in);
        int eleccion = -1;
        do {
            System.out.println("Elige una opción:\n1. Seleccionar todos los coches\n2. Seleccionar coche por Id\n3. Seleccionar coche por marca\n4. Insertar coche\n5. Actualizar coche\n6. Borrar coche\n0. Salir");
            switch (eleccion = scN.nextInt()) {
                case 1 -> selectAll();
                case 2 -> selectByIdCoche();
                case 3 -> selectByMarca();
                case 4 -> insertCoche();
                case 5 -> updateCoche();
                case 6 -> deleteCoche();
            }
        } while (eleccion != 0);
    }

    public static void selectAll() {
        try {
        ArrayList<Coche> coches = cc.SelectAll();
        int contadorCoches = 0;
        if (coches == null) {
            System.out.println("No hay ningún coche en la base de datos");
            return;
        }
        clear();
        for (Coche c : coches) {
            contadorCoches++;
            System.out.println("Coche #" + contadorCoches + "\n" + c);
        }
        pulseTecla();
        } catch (Exception e) {
            System.out.println("No hay ningún coche en la base de datos");
        }
    }

    public static void selectByIdCoche() {
        try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el Id del coche");
        Coche c = cc.SelectByIdCoche(sc.next());
        if (c == null) {
            System.out.println("No existe ningún coche con ese Id");
            return;
        }
        clear();
        System.out.println(c);
        pulseTecla();
        } catch (Exception e) {
            System.out.println("No hay ningún coche en la base de datos");
        }
    }

    public static void selectByMarca() {
        try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la marca del coche");
        ArrayList<Coche> c = cc.SelectByMarca(sc.next());
        if (c == null) {
            System.out.println("No existe ningún coche con esa marca");
            return;
        }
        clear();
        System.out.println(c);
        pulseTecla();
        } catch (Exception e) {
            System.out.println("No hay ningún coche en la base de datos");
        }
    }

    public static void insertCoche() {
        try {
        Scanner sc = new Scanner(System.in);
        Scanner scN = new Scanner(System.in);
        System.out.println("Introduce el Id del coche");
        int idCoche = scN.nextInt();
        System.out.println("Introduce la marca del coche");
        String marca = sc.nextLine();
        System.out.println("Introduce el modelo del coche");
        String modelo = sc.nextLine();
        System.out.println("Introduce el año del coche");
        int ano = scN.nextInt();
        System.out.println("Introduce el color del coche");
        String color = sc.nextLine();
        System.out.println("Introduce el precio del coche");
        double precio = scN.nextDouble();
        System.out.println("Introduce el id del proveedor");
        int idProveedor = scN.nextInt();
        if (cc.SelectByIdCoche(String.valueOf(idProveedor)) == null) {
            System.out.println("No existe un proveedor con ese Id");
            return;
        }
        cc.InsertCoche(idCoche, marca, modelo, ano, color, precio, idProveedor);
        } catch (Exception e) {
            System.out.println("Revisa los datos introducidos");
        }
    }

    public static void updateCoche() {
        try {
        Scanner sc = new Scanner(System.in);
        Scanner scN = new Scanner(System.in);
        System.out.println("Introduce el Id del coche");
        int idCoche = scN.nextInt();
        if (cc.SelectByIdCoche(String.valueOf(idCoche)) == null) {
            System.out.println("No existe un coche con ese Id");
            return;
        }
        System.out.println("Introduce la marca del coche");
        String marca = sc.nextLine();
        System.out.println("Introduce el modelo del coche");
        String modelo = sc.nextLine();
        System.out.println("Introduce el año del coche");
        int ano = scN.nextInt();
        System.out.println("Introduce el color del coche");
        String color = sc.nextLine();
        System.out.println("Introduce el precio del coche");
        double precio = scN.nextDouble();
        System.out.println("Introduce el id del proveedor");
        int idProveedor = scN.nextInt();
        if (cc.SelectByIdCoche(String.valueOf(idProveedor)) == null) {
            System.out.println("No existe un proveedor con ese Id");
            return;
        }
        cc.UpdateCoche(idCoche, marca, modelo, ano, color, precio, idProveedor);
        } catch (Exception e) {
            System.out.println("Revisa los datos introducidos");
        }
    }

    public static void deleteCoche() {
        try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el Id del coche");
        int idCoche = sc.nextInt();
        if (cc.SelectByIdCoche(String.valueOf(idCoche)) == null) {
            System.out.println("No existe un coche con ese Id");
            return;
        }
        cc.DeleteCoche(idCoche);
        } catch (Exception e) {
            System.out.println("No existe un coche con ese Id");
        }
    }

    public static void clear() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    public static void pulseTecla() {
        System.out.println("Pulse cualquier tecla para continuar");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        clear();
    }
}
