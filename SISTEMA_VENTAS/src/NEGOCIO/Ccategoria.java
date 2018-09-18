package NEGOCIO;

import DATOS.Cconexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Ccategoria {

    String totalCategoria;
    private ResultSet resultado;
    
    //atributos de la clase
    private String idcategoria; 
    private String nombreCategoria;

    
    //setters and getters
    public String getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(String idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
   
    
    //--------------------------------  LISTAR  ----------------------------------
    public void ListarCategoria(JTable F_ListarCategoria) {
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call listar_categoria()}");
            resultado = pst.executeQuery();

            DefaultTableModel dtm = new DefaultTableModel();

            dtm.addColumn("Código");
            dtm.addColumn("Categoría");

            F_ListarCategoria.setModel(dtm);

            while (resultado.next()) {
                Object vector[] = new Object[2];

                vector[0] = resultado.getObject(1);
                vector[1] = resultado.getObject(2);
                dtm.addRow(vector);
            }
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, ex);
        }
    }
 
//    //--------------------------------  INSERTAR  ----------------------------------
//    public void InsertarCategoria() {
//        try {
//            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call insertar_categoria(?,?)}");
//
//            pst.setString(1, this.getIdcategoria());
//            pst.setString(2, this.getNombreCategoria());
//
//            pst.executeUpdate();
//
//            JOptionPane.showMessageDialog(null, "Registrado guardado");
//            
//        } catch (HeadlessException | SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex+" Registrado no guardado");
//        }
//    }
//    //--------------------------------  ACTUALIZAR ----------------------------------
//    public void ActualizarCategoria() {
//        try {
//            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call actualizar_categoria(?,?)}");
//
//            pst.setString(1, this.getIdcategoria());
//            pst.setString(2, this.getNombreCategoria());
//
//            pst.executeUpdate();
//
//            JOptionPane.showMessageDialog(null, "Registro Actualizado");
//            
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null,ex+ "Registro No Actualizado");
//        }
//    }
    
    
    //-------------------   ACTUALIZAR    -----------------------
    public boolean editar(Ccategoria dts){
        
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call actualizar_categoria(?,?)}");
            
            pst.setString(1, this.getIdcategoria());
            pst.setString(2, this.getNombreCategoria());
            
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

    //--------------------------------  ELIMINAR  ----------------------------------
    public void eliminarCategoria() {
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call eliminar_categoria(?)}");

            pst.setString(1, this.getIdcategoria());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Categoria eliminado");
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex+ "Categoria no eliminado");
        }
    }

    
    //--------------------------------  BUSCAR POR NOMBRE ----------------------------------
    public void BuscarCategoria(JTable F_BuscarCategoria) {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Código");
        dtm.addColumn("Categoría");
        F_BuscarCategoria.setModel(dtm);
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call buscar_categoria(?)}");

            pst.setString(1, this.getNombreCategoria());
            resultado = pst.executeQuery();

            while (resultado.next()) {
                Object vector[] = new Object[7];

                vector[0] = resultado.getObject(1);
                vector[1] = resultado.getObject(2);
                dtm.addRow(vector);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex+ "Registrado no encontrado");
        }
    }

    
    //--------------------- CONTAR ------------------------------
    public String ContarCategoria() {
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call contar_categoria()}");

            resultado = pst.executeQuery();

            while (resultado.next()) {
                return totalCategoria = resultado.getString(1);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex+ "error");
        }
        return null;
    }
    
    
    
    //-------------------   INSERTAR    -----------------------
    public boolean insertar(Ccategoria dts){
        
        try {
            
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call insertar_categoria(?,?)}");
            
            pst.setString(1, this.getIdcategoria());
            pst.setString(2, this.getNombreCategoria());
            
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
    
    
}
