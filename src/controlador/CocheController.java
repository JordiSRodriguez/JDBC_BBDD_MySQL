package controlador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import modelo.Coche;
import modelo.CocheDAO;
import modelo.Conexion_JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CocheController implements CocheDAO {

    public final String SELECT_ALL = "SELECT * FROM coches";
    public final String SELECT_BY_MATRICULA = "SELECT * FROM coches WHERE IdCoche = ?";
    public final String INSERT = "INSERT INTO coches VALUES (?,?,?,?,?,?,?)";
    public final String UPDATE = "UPDATE coches SET Marca = ?, Modelo = ?, Anio = ?, Color = ?, Precio = ?, IdProveedor = ? WHERE IdCoche = ?";
    public final String DELETE = "DELETE FROM coches WHERE IdCoche = ?";

    private Connection con;

    public CocheController() {
        Conexion_JDBC conector = new Conexion_JDBC("root", "3306", "127.0.0.1", "jdbc:mysql", "concesionario", "", "jdbc:mysql://127.0.0.1:3306/concesionario");
        try {
            this.con = conector.abrirConexion();
        } catch (Exception e) {
            e.printStackTrace();
            this.con = null;
        }
    }

    @Override
    public ArrayList<Coche> SelectAll() {
        ArrayList<Coche> coches = new ArrayList<>();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SELECT_ALL);
            while (rs.next()) {
                Coche c = new Coche(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getDouble(6), rs.getInt(7));
                coches.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            coches = null;
        }
        return coches;
    }

    @Override
    public Coche SelectByIdCoche(String idCoche) {
        try {
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(SELECT_BY_MATRICULA);
            ps.setString(1, idCoche);
            ResultSet rs = ps.executeQuery();
            rs.next();
            Coche c = new Coche(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getDouble(6), rs.getInt(7));
            return c;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean InsertCoche(int idCoche, String marca, String modelo, int ano, String color, double precio, int idProveedor) {
        try {
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(INSERT);
            ps.setInt(1, idCoche);
            ps.setString(2, marca);
            ps.setString(3, modelo);
            ps.setInt(4, ano);
            ps.setString(5, color);
            ps.setDouble(6, precio);
            ps.setInt(7, idProveedor);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    @Override
    public boolean UpdateCoche(int idCoche, String marca, String modelo, int ano, String color, double precio, int idProveedor) {
        try {
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(UPDATE);
            ps.setInt(7, idCoche);
            ps.setString(1, marca);
            ps.setString(2, modelo);
            ps.setInt(3, ano);
            ps.setString(4, color);
            ps.setDouble(5, precio);
            ps.setInt(6, idProveedor);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean DeleteCoche(int idCoche) {
        try {
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(DELETE);
            ps.setInt(1, idCoche);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
