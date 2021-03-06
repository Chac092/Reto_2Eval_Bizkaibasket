package clases.copy;

public class Jokalariak {
	//Atributos
	private String dni_joka;
	private String Izena;
	private String Abizena;
	private String Taldea;
	
	//Metodos
	
	//Este metodo servira para dar unos valores a las variables de la clase
	
	public Jokalariak(String dni_joka, String Izena, String Abizena, String Taldea){
		this.dni_joka = dni_joka;
		this.Izena = Izena;
		this.Abizena = Abizena;
		this.Taldea = Taldea;
	}
	//Este metodo sirve para tener una copia de una clase entera y poder crear objetos identicos
	
	public Jokalariak (Jokalariak C){
		this.dni_joka = C.dni_joka;
		this.Izena = C.Izena;
		this.Abizena = C.Abizena;
		this.Taldea = C.Taldea;
	}
	 //Aqui apareceran los setters y los getters 
	
	public String getDni_joka() {
		return dni_joka;
	}
	public void setDni_joka(String dni_joka) {
		this.dni_joka = dni_joka;
	}
	public String getIzena() {
		return Izena;
	}
	public void setIzena(String izena) {
		Izena = izena;
	}
	public String getAbizena() {
		return Abizena;
	}
	public void setAbizena(String abizena) {
		Abizena = abizena;
	}
	public String getTaldea() {
		return Taldea;
	}
	public void setTaldea(String taldea) {
		Taldea = taldea;
	}
 	//Aqui programaremos un hascode 
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Abizena == null) ? 0 : Abizena.hashCode());
		result = prime * result + ((Izena == null) ? 0 : Izena.hashCode());
		result = prime * result + ((Taldea == null) ? 0 : Taldea.hashCode());
		result = prime * result + ((dni_joka == null) ? 0 : dni_joka.hashCode());
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
		Jokalariak other = (Jokalariak) obj;
		if (dni_joka == null) {
			if (other.dni_joka != null)
				return false;
		} else if (!dni_joka.equals(other.dni_joka))
			return false;
		return true;
	}
		
	
}
