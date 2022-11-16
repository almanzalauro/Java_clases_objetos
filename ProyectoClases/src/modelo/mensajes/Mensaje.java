package modelo.mensajes;

public class Mensaje {
	private String mensaje;
	
	public Mensaje(String mensaje) {
		super();
		this.mensaje=mensaje;
	}
	
	@Override
	public String toString() {
		return  mensaje;
	}
	public String getMensaje(){
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
