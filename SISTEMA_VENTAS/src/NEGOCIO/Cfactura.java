
package NEGOCIO;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Cfactura {
  
    
    private String idventa,idcliente,idempleado,fechaVenta,tipoDocumento,numDocumento;

    /**
     * @param idventa the idventa to set
     */
    public void setIdventa(String idventa) {
        this.idventa = idventa;
    }

    /**
     * @param idcliente the idcliente to set
     */
    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    /**
     * @param idempleado the idempleado to set
     */
    public void setIdempleado(String idempleado) {
        this.idempleado = idempleado;
    }

    /**
     * @param fechaVenta the fechaVenta to set
     */
    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    /**
     * @param tipoDocumento the tipoDocumento to set
     */
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    /**
     * @param numDocumento the numDocumento to set
     */
    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }
    
    
    
    public void InsertarFactura()
    {
        try
        {
        PreparedStatement pst=DATOS.Cconexion.ObtenerConexion().prepareCall("{call insertar_venta(?,?,?,?,?,?)}");
        
        pst.setString(1,this.idventa);
        pst.setString(2,this.idcliente);
        pst.setString(3,this.idempleado);
        pst.setString(4,this.fechaVenta);
        pst.setString(5,this.tipoDocumento);
        pst.setString(6,this.numDocumento);
       
        pst.executeUpdate();
        
        JOptionPane.showMessageDialog(null,"Registrado guardado");
        
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Registrado no guardado");
        }        
    }
    
//    public void ListarCliente(JTable F_ListarCliente)
//    {
//    try
//    {
//    PreparedStatement pst=DATOS.Cconexion.ObtenerConexion().prepareCall("{call listar_clientes()}");
//    
//    resultado =pst.executeQuery();
//    
//    DefaultTableModel dtm=new DefaultTableModel();
//    
//    dtm.addColumn("Codigo");
//    dtm.addColumn("Nombres");
//    dtm.addColumn("Apellidos");
//    dtm.addColumn("Direccion");
//    dtm.addColumn("Telefono");
//    dtm.addColumn("DNI");
//    dtm.addColumn("RUC");
//    
//    F_ListarCliente.setModel(dtm);
//    
//    
//    while(resultado.next())
//    {
//    Object vector[]= new Object[7];
//    
//    vector[0]=resultado.getObject(1);
//    vector[1]=resultado.getObject(2);
//    vector[2]=resultado.getObject(3);
//    vector[3]=resultado.getObject(4);
//    vector[4]=resultado.getObject(5);
//    vector[5]=resultado.getObject(6);
//    vector[6]=resultado.getObject(7);
//    dtm.addRow(vector);
//    }}
//    catch(Exception ex){    }  
//    }
   
//    
//    public void ActualizarCliente()
//    {    
//    try 
//    {
//        PreparedStatement pst=DATOS.Cconexion.ObtenerConexion().prepareCall("{call actualizar_cliente(?,?,?,?,?,?,?)}");
//        
//        pst.setString(1,this.idcli);
//        pst.setString(2,this.nombre_cli);
//        pst.setString(3,this.apellidos_cli);
//        pst.setString(4,this.direccion_cli);
//        pst.setString(5,this.telefono_cli);
//        pst.setString(6,this.dni_cli);
//        pst.setString(7,this.ruc_cli);
//
//        pst.executeUpdate();
//        
//        JOptionPane.showMessageDialog(null,"Registrado Actualizado");    
//    }
//    catch(Exception ex)
//    { JOptionPane.showMessageDialog(null,"no Actualizado");   }
//    }
    
//    public void eliminar_cliente()
//    {
//    try
//    {
//     PreparedStatement pst=DATOS.Cconexion.ObtenerConexion().prepareCall("{call eliminar_cliente(?)}");
//        
//        pst.setString(1,this.idcli);
//       
//        pst.executeUpdate();
//        
//        JOptionPane.showMessageDialog(null,"REgistrado eliminado");
//    }
//    catch(Exception ex)
//    { JOptionPane.showMessageDialog(null,"REgistrado no eliminado");}
//        }
//    
//    
//    public void BuscarCliente(JTable F_BuscarCliente)
//    {
//       DefaultTableModel dtm=new DefaultTableModel();
//    
//    dtm.addColumn("Codigo");
//    dtm.addColumn("Nombres");
//    dtm.addColumn("Apellidos");
//    dtm.addColumn("Direccion");
//    dtm.addColumn("Telefono");
//    dtm.addColumn("DNI");
//    dtm.addColumn("RUC");
//    
//    F_BuscarCliente.setModel(dtm);  
//       
//        try{
//    PreparedStatement pst=DATOS.Cconexion.ObtenerConexion().prepareCall("{call buscar_cliente(?)}");
//        
//       pst.setString(1,this.apellidos_cli);
//       
//     resultado =pst.executeQuery();
// 
//    while(resultado.next())
//    {
//    Object vector[]= new Object[7];
//    
//    vector[0]=resultado.getObject(1);
//    vector[1]=resultado.getObject(2);
//    vector[2]=resultado.getObject(3);
//    vector[3]=resultado.getObject(4);
//    vector[4]=resultado.getObject(5);
//    vector[5]=resultado.getObject(6);
//    vector[6]=resultado.getObject(7);
//    dtm.addRow(vector);
//    }     
//    }
//    catch(Exception ex)
//            {JOptionPane.showMessageDialog(null,"REgistrado no encontrado");}                    
//    }
//    
    
    
    
}
