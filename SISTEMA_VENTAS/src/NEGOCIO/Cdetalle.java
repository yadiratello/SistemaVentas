package NEGOCIO;

import DATOS.Cconexion;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Cdetalle {

    String totalDetalle;

    private String iddetalle_venta, idventa, idproducto;
    private double cantidad, precio_unitario;

    //TABLA PRODUCTO
    private ResultSet resultado;

    
    public String getIddetalle_venta() {
        return iddetalle_venta;
    }

    public void setIddetalle_venta(String iddetalle_venta) {
        this.iddetalle_venta = iddetalle_venta;
    }

    public String getIdventa() {
        return idventa;
    }

    public void setIdventa(String idventa) {
        this.idventa = idventa;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    
    
    
    
    

    public void InsertarDetalle() {
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call insertar_detalle_venta(?,?,?,?,?)}");

            pst.setString(1, this.getIddetalle_venta());
            pst.setString(2, this.getIdventa());
            pst.setString(3, this.getIdproducto());
            pst.setDouble(4, this.getCantidad());
            pst.setDouble(5, this.getPrecio_unitario());

            pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex + "Error al registrar el detalle de venta");
        }
    }

    public String ContarDetalle() {
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call contar_detalle_venta()}");

            resultado = pst.executeQuery();

            while (resultado.next()) {
                return totalDetalle = resultado.getString(1);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex +"error");
        }
        return null;
    }
    

    public void eliminar_detalle() {
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call eliminar_detalle(?)}");

            pst.setString(1, this.getIddetalle_venta());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Detalle eliminado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex+ "Detalle no eliminado");
        }
    }

    //ACTUALIZAR TABLA PRODUCTO
    public void DisminuirStock() {
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call disminuir_stock(?,?)}");

            pst.setString(1, this.getIdproducto());
            pst.setDouble(2, this.getCantidad());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Stock Actualizado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex+ "Stock no Actualizado");
        }
    }

    public void AumentarStock() {
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call aumentar_stock(?,?)}");

            pst.setString(1, this.getIdproducto());
            pst.setDouble(2, this.getCantidad());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cantidad Actualizado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex+"Cantidad no Actualizado");
        }
    }

}
