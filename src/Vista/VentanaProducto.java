package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.ConsultasProducto;
import Modelo.Producto;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.SpringLayout;

public class VentanaProducto extends JFrame{

	public JPanel contentPane;
	public JTextField txtCodigo;
	public JTextField txtNombre;
	public JTextField txtPrecio;
	public JTextField txtCantidad;
	public JTextField txtBuscar;
	public JTextPane txtpnTotal;
	public JButton btnModificar;
	public JButton btnEliminar;
	public JButton btnBuscar;
	public JButton btnLimpiar;
	public JButton btnGuardar;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public VentanaProducto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Codigo:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 67, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 73, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel, 119, SpringLayout.WEST, contentPane);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNombre, 108, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNombre, 73, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNombre, 129, SpringLayout.WEST, contentPane);
		contentPane.add(lblNombre);
		
		JLabel lblPreciol = new JLabel("Precio:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblPreciol, 146, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblPreciol, 73, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblPreciol, 129, SpringLayout.WEST, contentPane);
		contentPane.add(lblPreciol);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblCantidad, 187, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblCantidad, 73, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblCantidad, 136, SpringLayout.WEST, contentPane);
		contentPane.add(lblCantidad);
		
		txtCodigo = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtCodigo, 64, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtCodigo, 169, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtCodigo, 309, SpringLayout.WEST, contentPane);
		txtCodigo.setBackground(SystemColor.info);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNombre = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtNombre, 105, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtNombre, 169, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtNombre, 309, SpringLayout.WEST, contentPane);
		txtNombre.setBackground(SystemColor.info);
		txtNombre.setColumns(10);
		contentPane.add(txtNombre);
		
		txtPrecio = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtPrecio, 143, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtPrecio, 169, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtPrecio, 309, SpringLayout.WEST, contentPane);
		txtPrecio.setBackground(SystemColor.info);
		txtPrecio.setColumns(10);
		contentPane.add(txtPrecio);
		
		txtCantidad = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtCantidad, 184, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtCantidad, 169, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtCantidad, 309, SpringLayout.WEST, contentPane);
		txtCantidad.setBackground(SystemColor.info);
		txtCantidad.setColumns(10);
		contentPane.add(txtCantidad);
		
		btnGuardar = new JButton("Guardar");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnGuardar, 47, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnGuardar, -42, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnGuardar, 0, SpringLayout.EAST, lblCantidad);
		btnGuardar.setForeground(Color.BLUE);
		btnGuardar.setBackground(SystemColor.activeCaptionBorder);
		contentPane.add(btnGuardar);
		
		btnModificar = new JButton("Modificar");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnModificar, 0, SpringLayout.NORTH, btnGuardar);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnModificar, 14, SpringLayout.EAST, btnGuardar);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnModificar, -235, SpringLayout.EAST, contentPane);
		btnModificar.setForeground(Color.BLUE);
		btnModificar.setBackground(SystemColor.activeCaptionBorder);
		contentPane.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnEliminar, 0, SpringLayout.NORTH, btnGuardar);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnEliminar, 6, SpringLayout.EAST, btnModificar);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnEliminar, 334, SpringLayout.WEST, contentPane);
		btnEliminar.setForeground(Color.BLUE);
		btnEliminar.setBackground(SystemColor.activeCaptionBorder);
		contentPane.add(btnEliminar);
		
		btnBuscar = new JButton("Buscar");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnBuscar, 63, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnBuscar, 356, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnBuscar, 445, SpringLayout.WEST, contentPane);
		btnBuscar.setForeground(Color.BLUE);
		btnBuscar.setBackground(SystemColor.activeCaptionBorder);
		contentPane.add(btnBuscar);
		
		txtBuscar = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtBuscar, 105, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtBuscar, 356, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtBuscar, 445, SpringLayout.WEST, contentPane);
		txtBuscar.setBackground(SystemColor.info);
		txtBuscar.setColumns(10);
		contentPane.add(txtBuscar);
		
		btnLimpiar = new JButton("Limpiar");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnLimpiar, 0, SpringLayout.NORTH, btnGuardar);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnLimpiar, 10, SpringLayout.EAST, btnEliminar);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnLimpiar, 433, SpringLayout.WEST, contentPane);
		btnLimpiar.setForeground(Color.BLUE);
		btnLimpiar.setBackground(SystemColor.activeCaptionBorder);
		contentPane.add(btnLimpiar);
		
		txtpnTotal = new JTextPane();
		txtpnTotal.setEditable(false);
		txtpnTotal.setBackground(SystemColor.inactiveCaption);
		txtpnTotal.setForeground(SystemColor.desktop);
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpnTotal, -56, SpringLayout.NORTH, btnGuardar);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtpnTotal, 0, SpringLayout.WEST, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtpnTotal, -25, SpringLayout.NORTH, btnGuardar);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtpnTotal, 314, SpringLayout.WEST, contentPane);
		contentPane.add(txtpnTotal);
		
		JLabel lblBienvenidoALa = new JLabel("Bienvenido a la Tienda");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblBienvenidoALa, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblBienvenidoALa, 0, SpringLayout.EAST, btnEliminar);
		lblBienvenidoALa.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		contentPane.add(lblBienvenidoALa);
	}
}
