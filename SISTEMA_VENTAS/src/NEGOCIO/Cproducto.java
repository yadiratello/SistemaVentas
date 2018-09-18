package NEGOCIO;

import DATOS.Cconexion;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class Cproducto {

    private ResultSet resultado;
    String totalProducto;

    private String idproducto, idcategoria, nombre, descripcion;
    private double stock, precio_compra, precio_venta;
    private String fecha_vencimiento;
    //categoria
    private String codigocategoria, nombreCategoria;

    
    
    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public String getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(String idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getCodigocategoria() {
        return codigocategoria;
    }

    public void setCodigocategoria(String codigocategoria) {
        this.codigocategoria = codigocategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    

    
    

    public boolean InsertarProducto(Cproducto dts) {
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call insertar_producto(?,?,?,?,?,?,?,?)}");

            pst.setString(1, dts.getIdproducto());
            pst.setString(2, dts.getIdcategoria());
            pst.setString(3, dts.getNombre());
            pst.setString(4, dts.getDescripcion());
            pst.setDouble(5, dts.getStock());
            pst.setDouble(6, dts.getPrecio_compra());
            pst.setDouble(7, dts.getPrecio_venta());
            pst.setString(8, dts.getFecha_vencimiento());

            int n = pst.executeUpdate();
            
            if(n!=0){//si se ha insertado registros
                return true;
            }else{
                return false;
            }

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex);
            return false;
        }
    }

    
    public void ListarProducto(JTable F_ListarProducto) {
        try {
            PreparedStatement pst = DATOS.Cconexion.ObtenerConexion().prepareCall("{call listar_producto()}");

            resultado = pst.executeQuery();

            DefaultTableModel dtm = new DefaultTableModel();

            dtm.addColumn("Código");
            dtm.addColumn("Categoria");
            dtm.addColumn("Producto");
            dtm.addColumn("Descripción");
            dtm.addColumn("Stock");
            dtm.addColumn("Precio Compra");
            dtm.addColumn("Precio Venta");
            dtm.addColumn("fecha Venc.");

            F_ListarProducto.setModel(dtm);

            while (resultado.next()) {
                Object vector[] = new Object[8];

                vector[0] = resultado.getObject(1);
                vector[1] = resultado.getObject(2);
                vector[2] = resultado.getObject(3);
                vector[3] = resultado.getObject(4);
                vector[4] = resultado.getObject(5);
                vector[5] = resultado.getObject(6);
                vector[6] = resultado.getObject(7);
                vector[7] = resultado.getObject(8);

                dtm.addRow(vector);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    
    public boolean ActualizarProducto(Cproducto dts) {
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call actualizar_producto(?,?,?,?,?,?,?,?)}");

            pst.setString(1, dts.getIdproducto());
            pst.setString(2, dts.getIdcategoria());
            pst.setString(3, dts.getNombre());
            pst.setString(4, dts.getDescripcion());
            pst.setDouble(5, dts.getStock());
            pst.setDouble(6, dts.getPrecio_compra());
            pst.setDouble(7, dts.getPrecio_venta());
            pst.setString(8, dts.getFecha_vencimiento());
    
            int n = pst.executeUpdate();
            
            if(n!=0){//si se ha insertado registros
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public void eliminar_producto() {
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call eliminar_producto(?)}");

            pst.setString(1, this.getIdproducto());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registro eliminado");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Registro no eliminado");
        }
    }

    public void BuscarProducto(JTable F_BuscarProducto) {
        DefaultTableModel dtm = new DefaultTableModel();

        dtm.addColumn("Código");
        dtm.addColumn("Categoria");
        dtm.addColumn("Producto");
        dtm.addColumn("Descripción");
        dtm.addColumn("Stock");
        dtm.addColumn("Precio Compra");
        dtm.addColumn("Precio Venta");
        dtm.addColumn("fecha Venc.");

        F_BuscarProducto.setModel(dtm);

        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call buscar_producto(?)}");

            pst.setString(1, this.getNombre());

            resultado = pst.executeQuery();

            while (resultado.next()) {
                Object vector[] = new Object[8];

                vector[0] = resultado.getObject(1);
                vector[1] = resultado.getObject(2);
                vector[2] = resultado.getObject(3);
                vector[3] = resultado.getObject(4);
                vector[4] = resultado.getObject(5);
                vector[5] = resultado.getObject(6);
                vector[6] = resultado.getObject(7);
                vector[7] = resultado.getObject(8);

                dtm.addRow(vector);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex+ "Registro no encontrado");
        }
    }

    //*****************BUSCAR CATEGORIA LO UTILIZAMOS CUANDO DAMOS CLIC EN LA GRILLA PRODUCTO********************//
    public String BuscarCategoria(String da) {
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call buscar_categoria(?)}");

            pst.setString(1, this.getNombreCategoria());

            resultado = pst.executeQuery();

            while (resultado.next()) {
                return da = resultado.getString(1);
            }
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
        return null;
    }

    
    public String ContarProducto() {
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call contar_producto()}");

            resultado = pst.executeQuery();

            while (resultado.next()) {
                return totalProducto = resultado.getString(1);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return null;
    }

}
