package NEGOCIO;

import DATOS.Cconexion;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Cventa {

    String totalVentas;

    private String idventa, idcliente, idempleado, fecha_venta, tipo_documento, num_documento;
    private Double total, igv, neto;

    private ResultSet resultado;

    
    
    public String getIdventa() {
        return idventa;
    }

    public void setIdventa(String idventa) {
        this.idventa = idventa;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public String getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(String idempleado) {
        this.idempleado = idempleado;
    }

    public String getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNum_documento() {
        return num_documento;
    }

    public void setNum_documento(String num_documento) {
        this.num_documento = num_documento;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getIgv() {
        return igv;
    }

    public void setIgv(Double igv) {
        this.igv = igv;
    }

    public Double getNeto() {
        return neto;
    }

    public void setNeto(Double neto) {
        this.neto = neto;
    }

    
    
    
    public void InsertarVenta() {
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call insertar_venta(?,?,?,?,?,?,?,?,?)}");

            pst.setString(1, this.getIdventa());
            pst.setString(2, this.getIdcliente());
            pst.setString(3, this.getIdempleado());
            pst.setString(4, this.getFecha_venta());
            pst.setString(5, this.getTipo_documento());
            pst.setString(6, this.getNum_documento());
            pst.setDouble(7, this.getTotal());
            pst.setDouble(8, this.getIgv());
            pst.setDouble(9, this.getNeto());

            pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex+ "Venta no registrada");
        }
    }

    
    public String ContarVentas() {
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call contar_venta()}");

            resultado = pst.executeQuery();

            while (resultado.next()) {
                return totalVentas = resultado.getString(1);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return null;
    }

    
    public void ActualizarVenta() {
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call actualizar_venta(?,?,?,?,?,?,?,?,?)}");

            pst.setString(1, this.getIdventa());
            pst.setString(2, this.getIdcliente());
            pst.setString(3, this.getIdempleado());
            pst.setString(4, this.getFecha_venta());
            pst.setString(5, this.getTipo_documento());
            pst.setString(6, this.getNum_documento());
            pst.setDouble(7, this.getTotal());
            pst.setDouble(8, this.getIgv());
            pst.setDouble(9, this.getNeto());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Venta Actualizada");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex+"Venta no Actualizada");
        }
    }

    public void eliminar_venta() {
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call eliminar_venta(?)}");

            pst.setString(1, this.getIdventa());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Venta eliminado");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Venta no eliminado");
        }
    }

}
