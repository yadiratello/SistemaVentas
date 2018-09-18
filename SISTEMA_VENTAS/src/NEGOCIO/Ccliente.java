package NEGOCIO;

import DATOS.Cconexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Ccliente {

    private ResultSet resultado;
    String totalCliente;

    private String idcli, nombre_cli, apellidos_cli, direccion_cli, telefono_cli, dni_cli, ruc_cli;

    public String getIdcli() {
        return idcli;
    }

    public void setIdcli(String idcli) {
        this.idcli = idcli;
    }

    public String getNombre_cli() {
        return nombre_cli;
    }

    public void setNombre_cli(String nombre_cli) {
        this.nombre_cli = nombre_cli;
    }

    public String getApellidos_cli() {
        return apellidos_cli;
    }

    public void setApellidos_cli(String apellidos_cli) {
        this.apellidos_cli = apellidos_cli;
    }

    public String getDireccion_cli() {
        return direccion_cli;
    }

    public void setDireccion_cli(String direccion_cli) {
        this.direccion_cli = direccion_cli;
    }

    public String getTelefono_cli() {
        return telefono_cli;
    }

    public void setTelefono_cli(String telefono_cli) {
        this.telefono_cli = telefono_cli;
    }

    public String getDni_cli() {
        return dni_cli;
    }

    public void setDni_cli(String dni_cli) {
        this.dni_cli = dni_cli;
    }

    public String getRuc_cli() {
        return ruc_cli;
    }

    public void setRuc_cli(String ruc_cli) {
        this.ruc_cli = ruc_cli;
    }

    //-------------------   INSERTAR    -----------------------
    public boolean insertar(Ccliente dts) {

        try {

            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call insertar_cliente(?,?,?,?,?,?,?)}");

            pst.setString(1, getIdcli());
            pst.setString(2, getNombre_cli());
            pst.setString(3, getApellidos_cli());
            pst.setString(4, this.getDireccion_cli());
            pst.setString(5, this.getTelefono_cli());
            pst.setString(6, this.getDni_cli());
            pst.setString(7, this.getRuc_cli());

            int n = pst.executeUpdate();

            if (n != 0) {//si se ha insertado registros
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }

    }

    //-------------------   ACTUALIZAR    -----------------------
    public boolean editar(Ccliente dts) {

        try {
            PreparedStatement pst = DATOS.Cconexion.ObtenerConexion().prepareCall("{call actualizar_cliente(?,?,?,?,?,?,?)}");
            
            pst.setString(1, getIdcli());
            pst.setString(2, getNombre_cli());
            pst.setString(3, getApellidos_cli());
            pst.setString(4, this.getDireccion_cli());
            pst.setString(5, this.getTelefono_cli());
            pst.setString(6, this.getDni_cli());
            pst.setString(7, this.getRuc_cli());
            
            int n = pst.executeUpdate();

            if (n != 0) {//si se ha insertado registros
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }

    }

    public void InsertarCliente() {
        try {
            PreparedStatement pst = Cconexion.ObtenerConexion().prepareCall("{call insertar_cliente(?,?,?,?,?,?,?)}");

            pst.setString(1, this.idcli);
            pst.setString(2, this.nombre_cli);
            pst.setString(3, this.apellidos_cli);
            pst.setString(4, this.direccion_cli);
            pst.setString(5, this.telefono_cli);
            pst.setString(6, this.dni_cli);
            pst.setString(7, this.ruc_cli);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registrado guardado");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Registro no guardado");
        }
    }

    public void ListarCliente(JTable F_ListarCliente) {
        try {
            PreparedStatement pst = DATOS.Cconexion.ObtenerConexion().prepareCall("{call listar_clientes()}");

            resultado = pst.executeQuery();

            DefaultTableModel dtm = new DefaultTableModel();

            dtm.addColumn("Codigo");
            dtm.addColumn("Nombres");
            dtm.addColumn("Apellidos");
            dtm.addColumn("Direccion");
            dtm.addColumn("Telefono");
            dtm.addColumn("DNI");
            dtm.addColumn("RUC");

            F_ListarCliente.setModel(dtm);

            while (resultado.next()) {
                Object vector[] = new Object[7];

                vector[0] = resultado.getObject(1);
                vector[1] = resultado.getObject(2);
                vector[2] = resultado.getObject(3);
                vector[3] = resultado.getObject(4);
                vector[4] = resultado.getObject(5);
                vector[5] = resultado.getObject(6);
                vector[6] = resultado.getObject(7);
                dtm.addRow(vector);
            }
        } catch (Exception ex) {
        }
    }

    public void ActualizarCliente() {
        try {
            PreparedStatement pst = DATOS.Cconexion.ObtenerConexion().prepareCall("{call actualizar_cliente(?,?,?,?,?,?,?)}");

            pst.setString(1, this.idcli);
            pst.setString(2, this.nombre_cli);
            pst.setString(3, this.apellidos_cli);
            pst.setString(4, this.direccion_cli);
            pst.setString(5, this.telefono_cli);
            pst.setString(6, this.dni_cli);
            pst.setString(7, this.ruc_cli);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registrado Actualizado");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "no Actualizado");
        }
    }

    public void eliminar_cliente() {
        try {
            PreparedStatement pst = DATOS.Cconexion.ObtenerConexion().prepareCall("{call eliminar_cliente(?)}");

            pst.setString(1, this.idcli);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "REgistrado eliminado");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "REgistrado no eliminado");
        }
    }

    public void BuscarCliente(JTable F_BuscarCliente) {
        DefaultTableModel dtm = new DefaultTableModel();

        dtm.addColumn("Codigo");
        dtm.addColumn("Nombres");
        dtm.addColumn("Apellidos");
        dtm.addColumn("Direccion");
        dtm.addColumn("Telefono");
        dtm.addColumn("DNI");
        dtm.addColumn("RUC");

        F_BuscarCliente.setModel(dtm);

        try {
            PreparedStatement pst = DATOS.Cconexion.ObtenerConexion().prepareCall("{call buscar_cliente(?)}");

            pst.setString(1, this.apellidos_cli);

            resultado = pst.executeQuery();

            while (resultado.next()) {
                Object vector[] = new Object[7];

                vector[0] = resultado.getObject(1);
                vector[1] = resultado.getObject(2);
                vector[2] = resultado.getObject(3);
                vector[3] = resultado.getObject(4);
                vector[4] = resultado.getObject(5);
                vector[5] = resultado.getObject(6);
                vector[6] = resultado.getObject(7);
                dtm.addRow(vector);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "REgistrado no encontrado");
        }
    }

    public String ContarClientes() {
        try {
            PreparedStatement pst = DATOS.Cconexion.ObtenerConexion().prepareCall("{call contar_cliente()}");

            resultado = pst.executeQuery();

            while (resultado.next()) {
                return totalCliente = resultado.getString(1);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error");
        }
        return null;
    }

}
