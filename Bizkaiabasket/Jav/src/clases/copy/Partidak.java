package clases.copy;

public class Partidak {
	//Atributos
	
	private String Kod_Partida;
	private String Talde1;
	private String Talde2;
	private String Data;
	private int talde1;
	private int talde2;
	
	//Metodos
	
	//Este metodo servira para dar unos valores a las variables de la clase
	
	public Partidak(String Kod_Partida, String Talde1, String Talde2, String Data, int talde1, int talde2){
		this.Kod_Partida=Kod_Partida;
		this.Talde1=Talde1;
		this.Talde2=Talde2;
		this.Data=Data;
		this.talde1=talde1;
		this.talde2=talde2;
		
	}
	//Este metodo sirve para tener una copia de una clase entera y poder crear objetos identicos

	Partidak(Partidak C) {
		this.Kod_Partida=C.Kod_Partida;
		this.Talde1=C.Talde1;
		this.Talde2=C.Talde2;
		this.Data=C.Data;
		this.talde1=C.talde1;
		this.talde2=C.talde2;
	}
	 //Aqui apareceran los setters y los getters 

	public String getKod_Partida() {
		return Kod_Partida;
	}
	public void setKod_Partida(String kod_Partida) {
		Kod_Partida = kod_Partida;
	}
	public String getTalde1() {
		return Talde1;
	}
	public void setTalde1(String talde1) {
		Talde1 = talde1;
	}
	public String getTalde2() {
		return Talde2;
	}
	public void setTalde2(String talde2) {
		Talde2 = talde2;
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	public int getTaldeuno() {
		return talde1;
	}

	public void setTaldeuno(int talde1) {
		this.talde1 = talde1;
	}

	public int getTaldedos() {
		return talde2;
	}

	public void setTaldedos(int talde2) {
		this.talde2 = talde2;
	}
	
	
 	//Aqui programaremos un hascode 

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Data == null) ? 0 : Data.hashCode());
		result = prime * result + ((Kod_Partida == null) ? 0 : Kod_Partida.hashCode());
		result = prime * result + ((Talde1 == null) ? 0 : Talde1.hashCode());
		result = prime * result + ((Talde2 == null) ? 0 : Talde2.hashCode());
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
		Partidak other = (Partidak) obj;
		if (Kod_Partida == null) {
			if (other.Kod_Partida != null)
				return false;
		} else if (!Kod_Partida.equals(other.Kod_Partida))
			return false;
		return true;
	}

	
}
