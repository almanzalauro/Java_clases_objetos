package modelo.cliente;
import java.util.ArrayList;
import java.util.List;

import modelo.mensajes.Mensaje;
import modelo.producto.Producto;

public class Invitado extends Usuario{
	private double saldo_cuenta = 999;
	private Mensaje mensaje;
	private List<Producto> lista_regalos_elegidos = new ArrayList<Producto>();
	
	double total=0;
	
	public Invitado() {
		super();
	}
	public Invitado(String nombre, String apellido, int dni) {
		super(nombre, apellido, dni);
	}
	public Invitado(String nombre, String apellido, String usuario, 
				    String contraseña, String mail, int dni) {
		super(nombre, apellido, usuario, contraseña, mail, dni);
	}
	public Invitado(String mail, String usuario, String contraseña) {
		super(mail, usuario, contraseña);
	}
	
	
	//------Sets & gets-------
	public double getSaldo_cuenta() {
		return saldo_cuenta;
	}
	public void setSaldo_cuenta(float saldo_cuenta) {
		this.saldo_cuenta = saldo_cuenta;
	}
	public Mensaje getMensaje() {
		return this.mensaje;
	}
	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	public List<Producto> getLista_regalos_elegidos() {
		return lista_regalos_elegidos;
	}
	public boolean setLista_regalos_elegidos(Producto prod, Pareja p1,int cantidad) {
		
		if(lista_regalos_elegidos.contains(prod)==false) {
			if(p1.getRegalosDeseados().contains(prod)!=true) {
				return false;
			}
			lista_regalos_elegidos.add(prod);
			total=total+prod.getValor();
			if (cantidad> prod.getStock()) {
				return false;
			}
			prod.setStock(prod.getStock()-cantidad);
			this.comprarRegalos();
		}
		return true;
	}
	
	//------Methods-------
	
	//muestro la lista desada por la pareja
	public void mostrarProdPareja(Pareja p1){
		p1.mostrarListaDeseada(p1);
		
	}
	
	//muestro los prod elegidos por el invitado
	public void mostrarProdElegidos(Invitado inv) {
		for(Producto regalo: lista_regalos_elegidos) {
			System.out.println("Regalo: "+regalo.getNomb_producto());
		}
	}

	//compro el regalo
	public boolean comprarRegalos() {
		System.out.println("TOTAL: "+total+"$");
		if(saldo_cuenta<total) {
			return false;
		}
		saldo_cuenta= saldo_cuenta-total;
		return true;
	}	

	//muestro datos del invitado
	public void datosInvitado(Invitado inv) {
		System.out.println("Nombre: "+inv.getNombre()+" "+inv.getApellido());
		System.out.println("Mensaje: "+inv.getMensaje());
		inv.mostrarProdElegidos(inv);
		System.out.println("Saldo inicial: " +saldo_cuenta+"$");
		inv.comprarRegalos();
		System.out.println("Saldo final: " +saldo_cuenta+"$");		
	}
	
	

}
