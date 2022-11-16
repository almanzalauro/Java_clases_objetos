package modelo.listaderegalos;
import java.util.ArrayList;
import java.util.List;
import modelo.producto.Producto;

public class RegalosElegidos {
	private List<Producto> listaderegalos = new ArrayList<Producto>();
	private String mensaje;

	public RegalosElegidos(){
	}
	
	public RegalosElegidos(List<Producto> listaderegalos, String mensaje) {
		super();
		this.listaderegalos = listaderegalos;
		this.mensaje = mensaje;
	}


	public List<Producto> getListaderegalos() {
		return listaderegalos;
	}


	public void setListaderegalos(List<Producto> listaderegalos) {
		this.listaderegalos = listaderegalos;
	}


	public String getMensaje() {
		return mensaje;
	}


	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
}
