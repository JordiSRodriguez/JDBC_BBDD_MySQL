package modelo;

public class Coche {
    private int IdCoche;
    private String Marca;
    private String Modelo;
    private int Año;
    private String Color;
    private double Precio;
    private int IdProveedor;

    public Coche(int idCoche, String marca, String modelo, int año, String color, double precio, int idProveedor) {
        IdCoche = idCoche;
        Marca = marca;
        Modelo = modelo;
        Año = año;
        Color = color;
        Precio = precio;
        IdProveedor = idProveedor;
    }

    public int getIdCoche() {
        return IdCoche;
    }

    public void setIdCoche(int idCoche) {
        IdCoche = idCoche;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int año) {
        Año = año;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public int getIdProveedor() {
        return IdProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        IdProveedor = idProveedor;
    }

    @Override
    public String toString() {
        return "Marca: " + Marca + "\n" +
                "Modelo: " + Modelo + "\n" +
                "IdCoche: " + IdCoche + "\n" +
                "Año: " + Año + "\n" +
                "Color: " + Color + "\n" +
                "Precio: " + Precio + "\n" +
                "IdProveedor: " + IdProveedor + "\n";
    }
}
