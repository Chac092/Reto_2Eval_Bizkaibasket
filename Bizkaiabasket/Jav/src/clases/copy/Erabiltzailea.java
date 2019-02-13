package clases.copy;

import java.util.ArrayList;

public class Erabiltzailea {
	//Atributos

	private String Usuario;
	private String Pass;
	private String Profila;
	
	//Metodos
	
	//Este metodo servira para dar unos valores a las variables de la clase
	public  Erabiltzailea (String Usuario,String Pass,String Profila ){
		this.Usuario = Usuario;
		this.Pass = Pass;
		this.Profila = Profila;
	}
	//Este metodo sirve para tener una copia de una clase entera y poder crear objetos identicos

	 Erabiltzailea ( Erabiltzailea C){
		this.Usuario = C.Usuario;
		this.Pass = C.Pass;
		this.Profila = C.Profila;
	}
	 //Aqui apareceran los setters y los getters 

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getPass() {
		return Pass;
	}

	public void setPass(String pass) {
		Pass = pass;
	}

	public String getProfila() {
		return Profila;
	}

	public void setProfila(String profila) {
		Profila = profila;
	}
	
 	//Aqui programaremos un hascode 

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Pass == null) ? 0 : Pass.hashCode());
		result = prime * result + ((Profila == null) ? 0 : Profila.hashCode());
		result = prime * result + ((Usuario == null) ? 0 : Usuario.hashCode());
		return result;
	}
	
	//Aqui programaremos un Equals 

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Erabiltzailea other = (Erabiltzailea) obj;
		if (Pass == null) {
			if (other.Pass != null)
				return false;
		} else if (!Pass.equals(other.Pass))
			return false;
		if (Profila == null) {
			if (other.Profila != null)
				return false;
		} else if (!Profila.equals(other.Profila))
			return false;
		if (Usuario == null) {
			if (other.Usuario != null)
				return false;
		} else if (!Usuario.equals(other.Usuario))
			return false;
		return true;
	}

	

}
