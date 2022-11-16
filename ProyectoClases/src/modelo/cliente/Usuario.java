package modelo.cliente;



public abstract class Usuario {
	private String nombre; 
	private String apellido;
	private String usuario;
	private String clave;
	private String mail;
	private int dni;

//contructores
	public Usuario() {
	}
	public Usuario(String nombre, String apellido, String usuario, String clave,String mail,int dni) {
		this.nombre = nombre;
		this.apellido=apellido;
		this.usuario=usuario;
		this.clave=clave;
		this.mail=mail;
		this.dni=dni;
	}
	public Usuario(String nombre, String apellido, int dni) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
	}
	public Usuario(String mail, String usuario, String contraseña) {
		this.mail=mail;
		this.usuario=usuario;
		this.clave=contraseña;
	}


	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", usuario=" + usuario + ", clave="
				+ clave + ", mail=" + mail + ", dni=" + dni + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public Boolean validarContraseña(String clave ) throws Exception {
		if (this.getClave()== clave) {
			return  true;
		}
		else {
			throw new Exception(" clave incorrecta");
			
		}
		
	}

	
	
	

	
}