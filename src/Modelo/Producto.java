package Modelo;

public class Producto {

	 private int Id;
	 private String codigo;
	 private String nombre;
	 private Double precio;
	 private int cantidad;
	 private double operacion;
	 
	public int operacion(int prec,int cant) {
		int op= prec*cant;
		return op;
	}
    public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getOperacion() {
		return operacion;
	}
	public void setOperacion(double prec,int cant) {
		double c=cant;
		this.operacion = prec*c;
	}

}
