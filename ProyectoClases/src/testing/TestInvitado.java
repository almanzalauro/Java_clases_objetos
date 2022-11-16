package testing;

import modelo.cliente.Invitado;
import modelo.cliente.Pareja;
import modelo.direccion.Direccion;
import modelo.mensajes.Mensaje;
import modelo.producto.Producto;

public class TestInvitado {

	public static void main(String[] args) {
		
		
		//creo pareja
		Pareja p1 = new Pareja("Jose", "Morello",111272);
		p1.setDireccion(new Direccion("Av. Belgrano", 365, "CABA"));
		
		//creo invitados
		Invitado i1= new Invitado("Leonel","Gonzalez", 8765);
		Invitado i2= new Invitado("Rodrigo","Menendez", 4555);
		Invitado i3= new Invitado("James","mujica", 12123);
		
		//creo productos y agrego a cada lista
		Producto prod1=new Producto("Heladera",4,242.1);
		Producto prod2=new Producto("Televisor",1,42.1);
		Producto prod3=new Producto("Cocina",7,42.1);
		
		p1.getRegalosDeseados().add(prod1);
		p1.getRegalosDeseados().add(prod2);
		
		//Agrego invitados a la lista
		p1.getLista_invitados().add(new Invitado("Jose", "Morales",111));
		p1.getLista_invitados().add(new Invitado("Agusto", "Cesar",222));
		p1.getLista_invitados().add(new Invitado("Manuel", "Neuer",333));
					
		i1.setMail("Jmorales@gmail.com");
		i1.setUsuario(i1.getApellido());
		i1.setClave("Morales12123");
		i1.setMensaje(new Mensaje("Feliz casamiento chicos!"));
		i1.setLista_regalos_elegidos(prod1,p1,4);
		i1.setLista_regalos_elegidos(prod2,p1,4);
		
		
		System.out.println("---INVITADO---");
		i1.datosInvitado(i1);
		
		
		
		
		
	}
		

}
