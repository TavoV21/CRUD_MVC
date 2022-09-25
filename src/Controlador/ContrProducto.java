package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Modelo.ConsultasProducto;
import Modelo.Producto;
import Vista.VentanaProducto;

public class ContrProducto implements ActionListener {

	private Producto mod;
	private ConsultasProducto modC;
	private VentanaProducto frm;

	public ContrProducto(Producto mod, ConsultasProducto modC, VentanaProducto frm) 
	{
		this.mod = mod;
		this.modC = modC;
		this.frm = frm;
		this.frm.btnGuardar.addActionListener(this);
		this.frm.btnModificar.addActionListener(this);
		this.frm.btnEliminar.addActionListener(this);
		this.frm.btnBuscar.addActionListener(this);
		this.frm.btnLimpiar.addActionListener(this);
	
	}
		public void iniciar(){
			frm.setTitle("Productos");
			frm.setLocationRelativeTo(null);
			frm.txtBuscar.setVisible(false);
		}
		
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == frm.btnGuardar)
		{			
			mod.setCodigo(frm.txtCodigo.getText());
			mod.setNombre(frm.txtNombre.getText());
			mod.setPrecio(Double.parseDouble(frm.txtPrecio.getText()));
			mod.setCantidad(Integer.parseInt(frm.txtCantidad.getText()));
			mod.setOperacion(Double.parseDouble(frm.txtPrecio.getText()),Integer.parseInt(frm.txtCantidad.getText()));
             
			if(modC.registrar(mod)) {
				JOptionPane.showMessageDialog(null, "Registro Exitoso!!!");
				limpiar();
			}else {
				JOptionPane.showMessageDialog(null, "Fallo al Registrar");
				limpiar();

			}
			}
		
		if(e.getSource() == frm.btnModificar)
		{			
			mod.setId(Integer.parseInt(frm.txtBuscar.getText()));
			mod.setCodigo(frm.txtCodigo.getText());
			mod.setNombre(frm.txtNombre.getText());
			mod.setPrecio(Double.parseDouble(frm.txtPrecio.getText()));
			mod.setCantidad(Integer.parseInt(frm.txtCantidad.getText()));
			mod.setOperacion(Double.parseDouble(frm.txtPrecio.getText()),Integer.parseInt(frm.txtCantidad.getText()));

             
			if(modC.modificar(mod)) {
				JOptionPane.showMessageDialog(null, "Actualizacion Exitosa!!!");
				limpiar();
			}else {
				JOptionPane.showMessageDialog(null, "Fallo al Actualizar");
				limpiar();

			}
			}
		
		if(e.getSource() == frm.btnEliminar)
		{			
			mod.setId(Integer.parseInt(frm.txtBuscar.getText()));		
             
			if(modC.eliminar(mod)) {
				JOptionPane.showMessageDialog(null, "Eliminacion Exitosa!!!");
				limpiar();
			}else {
				JOptionPane.showMessageDialog(null, "Fallo al Eliminar");
				limpiar();

			}
			}
		
		if(e.getSource() == frm.btnBuscar)
		{			
			mod.setCodigo(frm.txtCodigo.getText());	

             
			if(modC.consultar(mod)) {
				
				frm.txtBuscar.setText(String.valueOf(mod.getId()));
				frm.txtCodigo.setText(mod.getCodigo());
				frm.txtNombre.setText(mod.getNombre());
				frm.txtPrecio.setText(String.valueOf(mod.getPrecio()));
				frm.txtCantidad.setText(String.valueOf(mod.getCantidad()));
				mod.setOperacion(mod.getPrecio(),mod.getCantidad());
				frm.txtpnTotal.setText("TOTAL: "+ mod.getOperacion());
							
			}else {
				JOptionPane.showMessageDialog(null, "No se encontro registro");
				limpiar();
			}
			}
		
		if(e.getSource() == frm.btnLimpiar) {
			limpiar();

		}

		
		}
	
	
	
	public void limpiar() {
		
		frm.txtBuscar.setText(null);
		frm.txtCodigo.setText(null);
		frm.txtNombre.setText(null);
		frm.txtPrecio.setText(null);
		frm.txtCantidad.setText(null);
		frm.txtpnTotal.setText(null);
			
	}

	

}
