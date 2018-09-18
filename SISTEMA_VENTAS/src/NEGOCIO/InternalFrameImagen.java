
package NEGOCIO;

import javax.swing.JInternalFrame;


public class InternalFrameImagen extends JInternalFrame {
   
    private PanelImagen pi =new PanelImagen();
    
    public InternalFrameImagen()
        {
            setContentPane( pi );
    
    }
    
    public void setImage(String nombreImagen)
    {
    pi.setImagen(nombreImagen);
    }
}
