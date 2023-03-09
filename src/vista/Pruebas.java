package vista;

import controlador.CocheController;
import modelo.Coche;

import java.util.ArrayList;
import java.util.Scanner;

public class Pruebas {
    static CocheController cc = new CocheController();
    public static void main(String[] args) {
        Scanner scL = new Scanner(System.in);
        Scanner scN = new Scanner(System.in);
        int eleccion = -1;
        do {
            System.out.println("Elige una opción:\n1. Seleccionar todos los coches\n2. Seleccionar coche por Id\n3. Insertar coche\n4. Actualizar coche\n5. Borrar coche\n0. Salir");
            switch (eleccion = scN.nextInt()) {
                case 1 -> selectAll();
                case 2 -> selectByIdCoche();
                case 3 -> insertCoche();
                case 4 -> updateCoche();
                case 5 -> deleteCoche();
            }
        } while (eleccion != 0);
    }

    public static void selectAll() {
        ArrayList<Coche> coches = cc.SelectAll();
        int contadorCoches = 0;
        clear();
        for (Coche c : coches) {
            contadorCoches++;
            System.out.println("Coche #" + contadorCoches + "\n" + c);
        }
        pulseTecla();
    }

    public static void selectByIdCoche() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el Id del coche");
        Coche c = cc.SelectByIdCoche(sc.next());
        clear();
        System.out.println(c);
        pulseTecla();
    }

    public static void insertCoche() {
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
        cc.InsertCoche(idCoche, marca, modelo, ano, color, precio, idProveedor);
    }

    public static void updateCoche() {
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
        cc.UpdateCoche(idCoche, marca, modelo, ano, color, precio, idProveedor);
    }

    public static void deleteCoche() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el Id del coche");
        int idCoche = sc.nextInt();
        cc.DeleteCoche(idCoche);
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
