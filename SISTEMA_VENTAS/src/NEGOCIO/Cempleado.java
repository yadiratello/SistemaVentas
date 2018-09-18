package NEGOCIO;

import DATOS.Cconexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class Cempleado {

    //DECLARANDO LOS ATRIBUTOS  
    private String idemp, nom_emp, apellidos_emp, direccion_emp, telefono_emp, dni_emp, login_emp, tipo_emp, contrasenia_emp;

    private String TotalEmpleado;
    private ResultSet resultado;

    
    
    public String getIdemp() {
        return idemp;
    }

    public void setIdemp(String idemp) {
        this.idemp = idemp;
    }

    public String getNom_emp() {
        return nom_emp;
    }

    public void setNom_emp(String nom_emp) {
        this.nom_emp = nom_emp;
    }

    public String getApellidos_emp() {
        return apellidos_emp;
    }

    public void setApellidos_emp(String apellidos_emp) {
        this.apellidos_emp = apellidos_emp;
    }

    public String getDireccion_emp() {
        return direccion_emp;
    }

    public void setDireccion_emp(String direccion_emp) {
        this.direccion_emp = direccion_emp;
    }

    public String getTelefono_emp() {
        return telefono_emp;
    }

    public void setTelefono_emp(String telefono_emp) {
        this.telefono_emp = telefono_emp;
    }

    public String getDni_emp() {
        return dni_emp;
    }

    public void setDni_emp(String dni_emp) {
        this.dni_emp = dni_emp;
    }

    public String getLogin_emp() {
        return login_emp;
    }

    public void setLogin_emp(String login_emp) {
        this.login_emp = login_emp;
    }

    public String getTipo_emp() {
        return tipo_emp;
    }

    public void setTipo_emp(String tipo_emp) {
        this.tipo_emp = tipo_emp;
    }

    public String getContrasenia_emp() {
        return contrasenia_emp;
    }

    public void setContrasenia_emp(String contrasenia_emp) {
        this.contrasenia_emp = contrasenia_emp;
    }

    public ResultSet getResultado() {
        return resultado;
    }

    public void setResultado(ResultSet resultado) {
        this.resultado = resultado;
    }

    
    

    //METODOS DEL EMPLEADO
    public void ListarEmpleado(JTable F_ListarEmpleado) {
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call listar_empleado()}");

            setResultado(pst.executeQuery());

            DefaultTableModel dtm = new DefaultTableModel();

            dtm.addColumn("Código");
            dtm.addColumn("Nombre");
            dtm.addColumn("Apellidos");
            dtm.addColumn("Direccion");
            dtm.addColumn("Telefono");
            dtm.addColumn("DNI");
            dtm.addColumn("login");
            dtm.addColumn("tipo");
            dtm.addColumn("contraseña");

            F_ListarEmpleado.setModel(dtm);

            while (resultado.next()) {
                Object vector[] = new Object[9];

                vector[0] = resultado.getObject(1);
                vector[1] = resultado.getObject(2);
                vector[2] = resultado.getObject(3);
                vector[3] = resultado.getObject(4);
                vector[4] = resultado.getObject(5);
                vector[5] = resultado.getObject(6);
                vector[6] = resultado.getObject(7);
                vector[7] = resultado.getObject(8);
                vector[8] = resultado.getObject(9);

                dtm.addRow(vector);
            }

        } catch (Exception ex) {
        }
    }

    //funcion contar empleado
    public String ContarEmpleado() {
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call contar_empleado()}");
            resultado = pst.executeQuery();
            while (resultado.next()) {
                return TotalEmpleado = resultado.getString(1);//capturando el valor del Resulset
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    //-------------------   INSERTAR    -----------------------
    public boolean insertar(Cempleado dts){
                
        try {
            
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call insertar_empleado(?,?,?,?,?,?,?,?,?)}");
            
            pst.setString(1, dts.getIdemp());
            pst.setString(2, dts.getNom_emp());
            pst.setString(3, dts.getApellidos_emp());
            pst.setString(4, dts.getDireccion_emp());
            pst.setString(5, dts.getTelefono_emp());
            pst.setString(6, dts.getDni_emp());
            pst.setString(7, dts.getLogin_emp());
            pst.setString(8, dts.getTipo_emp());
            pst.setString(9, dts.getContrasenia_emp());
            
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
    
    
    //-------------------   ACTUALIZAR    -----------------------
    public boolean editar(Cempleado dts){
                
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call actualizar_empleado(?,?,?,?,?,?,?,?,?)}");
            
            pst.setString(1, dts.getIdemp());
            pst.setString(2, dts.getNom_emp());
            pst.setString(3, dts.getApellidos_emp());
            pst.setString(4, dts.getDireccion_emp());
            pst.setString(5, dts.getTelefono_emp());
            pst.setString(6, dts.getDni_emp());
            pst.setString(7, dts.getLogin_emp());
            pst.setString(8, dts.getTipo_emp());
            pst.setString(9, dts.getContrasenia_emp());
            
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
//
//    //PROCEDIMIENTO INSERTAR EMPLEADO
//    public boolean InsertarEmpleado(Cempleado dts) {
//        try {
//            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call insertar_empleado(?,?,?,?,?,?,?,?,?)}");
//
//            pst.setString(1, idemp);
//            pst.setString(2, this.nom_emp);
//            pst.setString(3, this.apellidos_emp);
//            pst.setString(4, this.direccion_emp);
//            pst.setString(5, this.telefono_emp);
//            pst.setString(6, this.dni_emp);
//            pst.setString(7, this.login_emp);
//            pst.setString(8, this.tipo_emp);
//            pst.setString(9, this.contrasenia_emp);
//
//            pst.executeUpdate();
//
//            JOptionPane.showMessageDialog(null, "Registro Guardado");
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, "Registro no guardado");
//        }
//
//    }
//
//    public void ActualizarEmpleado() {
//        try {
//            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call actualizar_empleado(?,?,?,?,?,?,?,?,?)}");
//
//            pst.setString(1, idemp);
//            pst.setString(2, this.nom_emp);
//            pst.setString(3, this.apellidos_emp);
//            pst.setString(4, this.direccion_emp);
//            pst.setString(5, this.telefono_emp);
//            pst.setString(6, this.dni_emp);
//            pst.setString(7, this.login_emp);
//            pst.setString(8, this.tipo_emp);
//            pst.setString(9, this.contrasenia_emp);
//
//            pst.executeUpdate();
//
//            JOptionPane.showMessageDialog(null, "Registro Actualizado");
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, "Registro no actualizado");
//        }
//
//    }

    public void eliminar_empleado() {
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call eliminar_empleado(?)}");

            pst.setString(1, this.idemp);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registrado eliminado");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Registrado no eliminado");
        }
    }

    public void BuscarEmpleado(JTable F_BuscarEmpleado) {
        DefaultTableModel dtm = new DefaultTableModel();

        dtm.addColumn("Codigo");
        dtm.addColumn("Nombres");
        dtm.addColumn("Apellidos");
        dtm.addColumn("Direccion");
        dtm.addColumn("Telefono");
        dtm.addColumn("DNI");
        dtm.addColumn("login");
        dtm.addColumn("tipo");
        dtm.addColumn("contraseña");

        F_BuscarEmpleado.setModel(dtm);
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call buscar_empleado(?)}");
            pst.setString(1, this.apellidos_emp);

            resultado = pst.executeQuery();
            while (resultado.next()) {
                Object vector[] = new Object[9];

                vector[0] = resultado.getObject(1);
                vector[1] = resultado.getObject(2);
                vector[2] = resultado.getObject(3);
                vector[3] = resultado.getObject(4);
                vector[4] = resultado.getObject(5);
                vector[5] = resultado.getObject(6);
                vector[6] = resultado.getObject(7);
                vector[7] = resultado.getObject(8);
                vector[8] = resultado.getObject(9);
                dtm.addRow(vector);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Registrado no encontrado");
        }
    }

    //paso 5
    //----------------------  ACCESO AL SISTEMA ------------------------///
    //----------------------  BUSCAR LOGIN  ------------------------///
    public String BuscarLogin(String login) {
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call buscar_login(?)}");

            pst.setString(1, this.login_emp);

            resultado = pst.executeQuery();

            while (resultado.next()) {
                return login = resultado.getString(7);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error");
        }
        return null;
    }

    //---------------------- BUSCAR TIPO ------------------------//
    public String BuscarTipo(String login, String tipo) {
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call buscar_tipo(?,?)}");

            pst.setString(1, this.login_emp);
            pst.setString(2, this.tipo_emp);

            resultado = pst.executeQuery();

            while (resultado.next()) {
                return tipo = resultado.getString(8);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error");
        }
        return null;
    }

    //----------------------  BUSCAR CONTRASEÑA ------------------------///
    public String BuscarContrasenia(String login, String tipo, String contra) {
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call buscar_contrasenia(?,?,?)}");

            pst.setString(1, this.login_emp);
            pst.setString(2, this.tipo_emp);
            pst.setString(3, this.contrasenia_emp);

            resultado = pst.executeQuery();

            while (resultado.next()) {
                return contra = resultado.getString(9);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error");
        }
        return null;
    }

    public void ActualizarContrasenia() {
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call actualizar_contrasenia(?,?)}");

            pst.setString(1, this.login_emp);
            pst.setString(2, this.contrasenia_emp);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Contraseña Actualizado");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "no Actualizado");
        }
    }

    //Funciones para mostrar los datos del empleado
    //en la boleta o factura
    //----------------------  BUSCAR CODIGO  ------------------------///
    public String BuscarCodigo(String codigo) {
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call buscar_login(?)}");

            pst.setString(1, this.login_emp);

            resultado = pst.executeQuery();

            while (resultado.next()) {
                return codigo = resultado.getString(1);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error");
        }
        return null;
    }

    //----------------------  BUSCAR NOMBRES  ------------------------///
    public String BuscarNombres(String nombre) {
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call buscar_login(?)}");

            pst.setString(1, this.login_emp);

            resultado = pst.executeQuery();

            while (resultado.next()) {
                return nombre = resultado.getString(2);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex+"error");
        }
        return null;
    }

    //----------------------  BUSCAR APELLIDOS  ------------------------///
    public String BuscarApellidos(String apellidos) {
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call buscar_login(?)}");

            pst.setString(1, this.login_emp);

            resultado = pst.executeQuery();

            while (resultado.next()) {
                return apellidos = resultado.getString(3);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error");
        }
        return null;
    }
}
