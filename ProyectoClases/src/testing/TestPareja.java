package testing;


import modelo.cliente.Invitado;
import modelo.cliente.Pareja;
import modelo.direccion.Direccion;
import modelo.mensajes.Mensaje;
import modelo.producto.Producto;

public class TestPareja {

	public static void main(String[] args) {
		
		//creo pareja
		Pareja p1 = new Pareja("Jose", "Morello",111272);
		p1.setDireccion(new Direccion("La pampa", 4171, "CABA"));
		Pareja p2 = new Pareja("Juana", "De arco",134799);
		
		//creo invitados
		Invitado inv1= new Invitado("Jose","Morales", 12123);
		Invitado inv2= new Invitado("Rodrigo","Menendez", 4555);
		Invitado inv3= new Invitado("Lionel","Messi", 8765);
		
	
		//Creo y agrego productos a la lista de la pareja
		Producto prod1=new Producto("Heladera",10,242.1);
		Producto prod2=new Producto("Televisor",21,42.1);
		Producto prod3=new Producto("Cocina",9,42.1);
		
		p1.getRegalosDeseados().add(prod1);
		p1.getRegalosDeseados().add(prod2);
		p1.getRegalosDeseados().add(prod3);

		inv1.setLista_regalos_elegidos(prod1,p1,3);
		inv1.setMensaje(new Mensaje("Feliz casamiento chicos!"));
		
		inv2.setLista_regalos_elegidos(prod2,p1,2);
		inv3.setLista_regalos_elegidos(prod3,p1,5);
		
		//Agrego invitados a la lista de la pareja
		p1.getLista_invitados().add(inv1);
		p1.getLista_invitados().add(inv2);
		p1.getLista_invitados().add(inv3);
		
		p1.mostrardatos(p1);
		
		p1.setUsuario("JMorello");
		p1.setClave("Morello123");
		
		
		System.out.println("-------");
		//Verifico clave de p1
		try {
			p1.validarContraseña("Morello123");
			System.out.println("Morello123 es valida");
		} catch (Exception e) {
			System.err.println("Morello123" + e.getMessage());
		}
		
		try {
			p1.validarContraseña("eee");
			System.out.println("eee valida");
		} catch (Exception e) {
			System.err.println("eee" + e.getMessage());
		}
		
		
		
	}
}