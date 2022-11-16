package modelo.producto;

public class Producto {
	private String descripcion;
	private String nombre;
	private int stock;
	private double valor;

	
	//constructor
	
	public Producto(String descripcion, String nomb_producto, int stock, double valor) {
		this.descripcion = descripcion;
		this.nombre = nomb_producto;
		this.stock = stock;
		this.valor = valor;
	}
	public Producto(String nombre, int stock, double valor) {
		this.nombre = nombre;
		this.stock = stock;
		this.valor = valor;
	}
	
	
	//-----Sets & gets-------
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setNomb_producto(String nomb_producto) {
		this.nombre = nomb_producto;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public String getNomb_producto() {
		return nombre;
	}
	public int getStock() {
		return stock;
	}
	public double getValor() {
		return valor;
	}
	
	public boolean venderProducto(int cantidad) {
		if(this.getStock()< cantidad) {
			return false;
		}
		this.stock = this.stock - cantidad;
		return true;
	}
		
	
}
