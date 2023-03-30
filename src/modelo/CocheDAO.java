package modelo;

import java.util.ArrayList;

public interface CocheDAO {
    public ArrayList<Coche> SelectAll();
    public Coche SelectByIdCoche(String idCoche);
    public ArrayList<Coche> SelectByMarca(String marca);
    public boolean InsertCoche(int idCoche, String marca, String modelo, int ano, String color, double precio, int idProveedor);
    public boolean UpdateCoche(int idCoche, String marca, String modelo, int ano, String color, double precio, int idProveedor);
    public boolean DeleteCoche(int idCoche);

}
