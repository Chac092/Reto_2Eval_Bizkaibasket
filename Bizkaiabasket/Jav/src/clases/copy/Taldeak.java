package clases.copy;

import java.util.ArrayList;

import Main.Programa_Main;


public class Taldeak implements Comparable <Taldeak> {
	//Atributoak deklaratu
	 private String Kod_taldea;
	 private String Izena; 
	 private String Udalerri;
	 private String posta;
	 private String Zelaia;
	 private Integer puntuak = 0;
	 private boolean jokatu = false;
	 private  ArrayList <Jokalariak> jokalaria = new ArrayList <Jokalariak>();
	 
	 //metodos
	 
	 //Este metodo servira para dar unos valores a las variables de la clase
	 	
	 	public Taldeak (String Kod_taldea, String Izena, String Udalerri, String posta, String Zelaia) {
	 		this.Kod_taldea = Kod_taldea;
	 		this.Izena = Izena;
	 		this.Udalerri=Udalerri;
	 		this.posta = posta;
	 		this.Zelaia=Zelaia;
	 	}
	 //Este metodo sirve para tener una copia de una clase entera y poder crear objetos identicos
	 	
	 	Taldeak (Taldeak C){
	 		this.Kod_taldea = C.Kod_taldea;
	 		this.Izena = C.Izena;
	 		this.Udalerri = C.Udalerri;
	 		this.posta = C.posta;
	 		this.Zelaia = C.Zelaia;
	 	}
	 //Aqui apareceran los setters y los getters 
		
	 	public String getKod_taldea() {
			return Kod_taldea;
		}
		public void setKod_taldea(String kod_taldea) {
			Kod_taldea = kod_taldea;
		}
		public String getIzena() {
			return Izena;
		}
		public void setIzena(String izena) {
			Izena = izena;
		}
		public String getUdalerri() {
			return Udalerri;
		}
		public void setUdalerri(String udalerri) {
			Udalerri = udalerri;
		}
		public String getPosta() {
			return posta;
		}
		public void setPosta(String posta) {
			this.posta = posta;
		}
		public String getZelaia() {
			return Zelaia;
		}
		public void setZelaia(String zelaia) {
			Zelaia = zelaia;
		}
	 	//Aqui programaremos un hascode 
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((Izena == null) ? 0 : Izena.hashCode());
			result = prime * result + ((Kod_taldea == null) ? 0 : Kod_taldea.hashCode());
			result = prime * result + ((Udalerri == null) ? 0 : Udalerri.hashCode());
			result = prime * result + ((Zelaia == null) ? 0 : Zelaia.hashCode());
			result = prime * result + ((posta == null) ? 0 : posta.hashCode());
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
			Taldeak other = (Taldeak) obj;
			if (Kod_taldea == null) {
				if (other.Kod_taldea != null)
					return false;
			} else if (!Kod_taldea.equals(other.Kod_taldea))
				return false;
			return true;
		}

		public  ArrayList <Jokalariak> getJokalaria() {
			return jokalaria;
		}

		public void setJokalaria(ArrayList <Jokalariak> jokalaria) {
			jokalaria = jokalaria;
		}

		public int getPuntuak() {
			return puntuak;
		}

		public void setPuntuak(int puntuak) {
			this.puntuak = puntuak;
		}
		
		@Override
		public int compareTo(Taldeak o) {
			// TODO Auto-generated method stub
			this.puntuak.compareTo(o.puntuak);
			if (this.puntuak > o.puntuak)
				return -1;
			else {
				return 1;
			}
			
		}

		
		
			
	}
	 
