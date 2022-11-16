package modelo.cliente;

import java.util.ArrayList;
import java.util.List;

import modelo.direccion.*;
import modelo.listadeinvitados.ListaInvitados;
import modelo.producto.Producto;


public class Pareja extends Usuario {

	private List<Invitado>lista_invitados = new ArrayList<Invitado>();
	private Direccion direccion;
	private List<Producto>regalosDeseados = new ArrayList<Producto>();
	

	public Pareja(String nombre, String apellido,int dni) {
		super(nombre,apellido,dni);
	}
	
	public Pareja(String nombre, String apellido,int dni,String mail, String usuario, 
				  String contraseña, ListaInvitados lista, Direccion direcc, ProductosElegidos prod_elegidos) {
		super(nombre,apellido,mail,usuario,contraseña,dni);
		
	}


//-------Sets & gets--------
	public List<Invitado> getLista_invitados() {
		return lista_invitados;
	}

	public void setLista_invitados(List<Invitado> lista_invitados) {
		this.lista_invitados = lista_invitados;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public List<Producto> getRegalosDeseados() {
		return regalosDeseados;
	}

	public void setRegalosDeseados(List<Producto> regalosDeseados) {
		this.regalosDeseados = regalosDeseados;
	}
//-------methods-------
	
	public void mostrarListaDeseada(Pareja p1) {
		int contador=1;
		System.out.println("\n*Productos deseados");
		for(Producto prod:regalosDeseados) {
			System.out.println(contador+" "+prod.getNomb_producto());
			contador++;
		}
	}
	
	public void mostrarInvitados(Pareja p1) {
		int contador=1;
		System.out.println("\n*Lista de invitados");
		for(Invitado invitado:lista_invitados) {
			System.out.println(contador);
			invitado.datosInvitado(invitado);
			contador++;
			System.out.println("\n");
		}
	}
	
	public void mostrardatos(Pareja p1) {
		System.out.println("--DATOS DE LA PAREJA--");
		//Datos de la pareja
		System.out.println(p1.getNombre()+" "+p1.getApellido());	
		System.out.println("Calle:"+p1.getDireccion().getCalle()+" "+p1.getDireccion().getNumero());
		
		//Datos de los invitados + sus regalos + mensaje
		p1.mostrarListaDeseada(p1);
		p1.mostrarInvitados(p1);
		
		
	}
	
	
	
	
}
	

