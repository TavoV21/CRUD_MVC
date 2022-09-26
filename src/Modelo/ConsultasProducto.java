package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultasProducto extends Conexion {

	public boolean registrar(Producto pro){
		PreparedStatement ps=null;
		Connection con= getConexion();
	
		String sql= "INSERT INTO producto(codigo,nombre,precio,cantidad,total) VALUES(?,?,?,?,?)";
		
		try {
			ps= con.prepareStatement(sql);
			ps.setString(1, pro.getCodigo());
			ps.setString(2, pro.getNombre());
			ps.setDouble(3, pro.getPrecio());
			ps.setInt(4, pro.getCantidad());
			ps.setDouble(5, pro.getOperacion());
			ps.execute();			
			return true;
			
		} catch(SQLException e) {
			System.err.println(e);
			return false;

		}finally {
			try {
				con.close();
			} catch (SQLException e2) {
				System.err.println(e2);
			}
		}
	}
	
	
	
	public boolean modificar(Producto pro){
		PreparedStatement ps=null;
		Connection con= getConexion();
	
		String sql= "UPDATE producto SET codigo=?, nombre=?, precio=?, cantidad=?, total=? WHERE id=?";
		
		try {
			ps= con.prepareStatement(sql);
			ps.setString(1, pro.getCodigo());
			ps.setString(2, pro.getNombre());
			ps.setDouble(3, pro.getPrecio());
			ps.setInt(4, pro.getCantidad());
			ps.setDouble(5, pro.getOperacion());
			ps.setInt(6, pro.getId());
			ps.execute();			
			return true;
			
		} catch(SQLException e) {
			System.err.println(e);
			return false;

		}finally {
			try {
				con.close();
			} catch (SQLException e2) {
				System.err.println(e2);
			}
		}
	}
	
	
	public boolean eliminar(Producto pro){
		PreparedStatement ps=null;
		Connection con= getConexion();
	
		String sql= "DELETE FROM producto WHERE id=?";
		
		try {
			ps= con.prepareStatement(sql);
			ps.setInt(1, pro.getId());
			ps.execute();			
			return true;
			
		} catch(SQLException e) {
			System.err.println(e);
			return false;

		}finally {
			try {
				con.close();
			} catch (SQLException e2) {
				System.err.println(e2);
			}
		}
	}
	
	
	
	public boolean consultar(Producto pro){
		PreparedStatement ps=null;
		Connection con= getConexion();
	
		String sql= "SELECT * FROM producto WHERE codigo=?";
		
		try {
			ps= con.prepareStatement(sql);
			ps.setString(1, pro.getCodigo());
			ResultSet rs = ps.executeQuery();	
			
			if(rs.next()) {
				pro.setId(Integer.parseInt(rs.getString("id")));
				pro.setCodigo(rs.getString("codigo"));
				pro.setNombre(rs.getString("nombre"));
				pro.setPrecio(Double.parseDouble(rs.getString("precio")));
				pro.setCantidad(Integer.parseInt(rs.getString("cantidad")));
				return true;
			}
			
			
			return false;
			
		} catch(SQLException e) {
			System.err.println(e);
			return false;

		}finally {
			try {
				con.close();
			} catch (SQLException e2) {
				System.err.println(e2);
			}
		}
	}
	
	
}
