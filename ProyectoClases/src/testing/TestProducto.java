package testing;

import modelo.producto.*;

import java.util.*;
public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Producto> listaproductos = new ArrayList<Producto>();
		
		//Creo productos
		Producto prod1 = new Producto("Heladera", 10, 10.04);
		Producto prod2 = new Producto("Televisor", 15, 100.04);
		Producto prod3 = new Producto("Plancha", 7, 1.04);
		Producto prod4 = new Producto("Cocina", 4, 10);
		
		
		prod1.setDescripcion("2 puertas con hielera");
		prod2.setDescripcion("60 pulgadas con bluetooh");
		prod3.setDescripcion("Inalambrica");
		prod4.setDescripcion("autolimpiante");
		
		//Agrego productos a la LISTA PRODUCTOS
		listaproductos.add(prod1);
		listaproductos.add(prod2);
		listaproductos.add(prod3);
		listaproductos.add(prod4);
		
		System.out.print("----PRODUCTOS----\n");
		
		
		//Imprimo la lista con los productos agregados
		System.out.println("Nombre   Precio   Stock   descripcion");
		for(Producto prod:listaproductos) {
			
			System.out.println(prod.getNomb_producto()+" | " +prod.getValor()+"$"+" | " +prod.getStock()+" |  " +prod.getDescripcion() );
			
		}
		
	}

}
