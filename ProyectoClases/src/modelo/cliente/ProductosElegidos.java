package modelo.cliente;

import java.util.ArrayList;
import java.util.List;

import modelo.producto.Producto;

public class ProductosElegidos {
	private  List<Producto> listadeproductos = new ArrayList<Producto>();

	public List<Producto> getListadeproductos() {
		return listadeproductos;
	}

	public void setListadeproductos(Producto prod) {
		listadeproductos.add(prod);
	}
	
	public void mostrarLista() {
		for(Producto prod:listadeproductos) {
			System.out.println(prod.getNomb_producto());
		}
	}
}
