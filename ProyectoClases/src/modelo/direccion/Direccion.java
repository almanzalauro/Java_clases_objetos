package modelo.direccion;

public class Direccion {
	private String calle;
	private String ciudad;
	private String  pais;
	private int numero;
	private int telefono;
	private int cod_postal;
	
	
	public Direccion(String calle, int numero, String ciudad) {
		this.calle=calle;
		this.ciudad=ciudad;
		this.numero=numero;
	}
	
	
	public Direccion(String calle, String ciudad, String pais, int numero, int telefono, int cod_postal) {
		this.calle = calle;
		this.ciudad = ciudad;
		this.pais = pais;
		this.numero = numero;
		this.telefono = telefono;
		this.cod_postal = cod_postal;
		
	}

	
	
	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", ciudad=" + ciudad + ", pais=" + pais + ", numero=" + numero
				+ ", telefono=" + telefono + ", cod_postal=" + cod_postal + "]";
	}


	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getCod_postal() {
		return cod_postal;
	}

	public void setCod_postal(int cod_postal) {
		this.cod_postal = cod_postal;
	}

	
	

	

	
	
	//METHOS
//	public boolean agregarDireccion() {}
//	public boolean eliminarDireccion() {}

}
