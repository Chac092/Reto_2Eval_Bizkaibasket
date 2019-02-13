package clases.copy;

public class Liga {
	
	private String Liga_Izena;
	private String Kod_Liga;
	
	Liga(String Liga_Izena, String Kod_Liga){
		this.Liga_Izena=Liga_Izena;
		this.Kod_Liga=Kod_Liga;
	}
	Liga(Liga C){
		this.Liga_Izena=C.Liga_Izena;
		this.Kod_Liga=C.Kod_Liga;
	}
	public String getLiga_Izena() {
		return Liga_Izena;
	}
	public void setLiga_Izena(String liga_Izena) {
		Liga_Izena = liga_Izena;
	}
	public String getKod_Liga() {
		return Kod_Liga;
	}
	public void setKod_Liga(String kod_Liga) {
		Kod_Liga = kod_Liga;
	}
 	//Aqui programaremos un hascode 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Kod_Liga == null) ? 0 : Kod_Liga.hashCode());
		result = prime * result + ((Liga_Izena == null) ? 0 : Liga_Izena.hashCode());
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
		Liga other = (Liga) obj;
		if (Kod_Liga == null) {
			if (other.Kod_Liga != null)
				return false;
		} else if (!Kod_Liga.equals(other.Kod_Liga))
			return false;
		return true;
	}
	
}

