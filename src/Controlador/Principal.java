package Controlador;

import Modelo.ConsultasProducto;
import Modelo.Producto;
import Vista.VentanaProducto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Producto mod= new Producto();
		    ConsultasProducto modC= new ConsultasProducto();	    
			VentanaProducto frm= new VentanaProducto();
			
			ContrProducto ctrl= new ContrProducto(mod,modC,frm);
			ctrl.iniciar();			
			frm.setVisible(true);

			
	}

}
