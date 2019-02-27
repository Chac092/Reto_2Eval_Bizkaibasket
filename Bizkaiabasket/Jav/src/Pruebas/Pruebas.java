package Pruebas;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import clases.copy.Erabiltzailea;
import clases.copy.Jokalariak;

class Pruebas {

	@Test
	void testusuario() {
		Erabiltzailea E1 = new Erabiltzailea("Pepe", "Pass", "Admin");
		Erabiltzailea E2 = new Erabiltzailea("Pepe","Pass","Admin");
		Erabiltzailea E3 = new Erabiltzailea("Juanjo","Carrillo","Erabiltzaile");
		assertTrue(E1.equals(E2));
		assertFalse(E2.equals(E3));
	}
	
	@Test
	void meterUsuario(){
		int usuario_dentro = 0; 
		ArrayList<Erabiltzailea> Erabiltzaile = new ArrayList<Erabiltzailea>();
		Erabiltzailea usua = new Erabiltzailea("pepe","Pass","Erabiltzailea");
		Erabiltzaile.add(usua);
		if (Erabiltzaile.size()==1) {
			usuario_dentro = 1;
		}
		assertEquals(usuario_dentro,1);
	}
	
	@Test
	void CambiarUsuario() {
		ArrayList<Erabiltzailea> Erabiltzaile = new ArrayList<Erabiltzailea>();
		Erabiltzailea usua = new Erabiltzailea("pepe","Pass","Erabiltzailea");
		Erabiltzaile.add(usua);
		int i;
		for (  i=0; i<Erabiltzaile.size();i++) {
			if ("pepe".equals(Erabiltzaile.get(i).getUsuario()) && "Erabiltzailea".equals(Erabiltzaile.get(i).getProfila()) ) {
				System.out.println(Erabiltzaile.get(i).getUsuario());
				System.out.println(Erabiltzaile.get(i).getPass());
				System.out.println(Erabiltzaile.get(i).getProfila());
			}
		}
		i=i-1;
		
		Erabiltzaile.get(i).setUsuario("David");
		Erabiltzaile.get(i).setPass("Chacon");
		Erabiltzaile.get(i).setProfila("Admin");
		
		System.out.println(Erabiltzaile.get(i).getUsuario());
		System.out.println(Erabiltzaile.get(i).getPass());
		System.out.println(Erabiltzaile.get(i).getProfila());
		
		int todoOK=0;
		if(Erabiltzaile.get(i).getUsuario().equals("David")&& Erabiltzaile.get(i).getPass().equals("Chacon")&&
				Erabiltzaile.get(i).getProfila().equals("Admin")) {
			todoOK = 1;
		}
		assertEquals(todoOK,1);
	}
	
	@Test
	void BorrarUsuario() {
		ArrayList<Erabiltzailea> Erabiltzaile = new ArrayList<Erabiltzailea>();
		Erabiltzailea usua = new Erabiltzailea("pepe","Pass","Erabiltzailea");
		Erabiltzaile.add(usua);
		for (int i=0; i<Erabiltzaile.size();i++) {
			if ("pepe".equals(Erabiltzaile.get(i).getUsuario()) && "Erabiltzailea".equals(Erabiltzaile.get(i).getProfila()) ) {
				Erabiltzaile.remove(i);
				
			}
		}
		int todoOK=0;
		if (Erabiltzaile.size()== 0) {
			todoOK = 1;
		}
		assertEquals(todoOK,1);
	}
	
	@Test
	void Taldea_sortu() {
		ArrayList<clases.copy.Taldeak> Taldea = new ArrayList<clases.copy.Taldeak>();
		clases.copy.Taldeak Equipo = new clases.copy.Taldeak("PK8888", "Equipo1",
				"Urdaibai", "", "");
		Taldea.add(Equipo);
		int todoOK=0;
		if (Taldea.size() == 1) {
			todoOK = 1;
		}
		assertEquals(todoOK,1);
	}
	
	@Test
	void CambiarEquipo() {
		int i;
		ArrayList<clases.copy.Taldeak> Taldea = new ArrayList<clases.copy.Taldeak>();
		clases.copy.Taldeak Equipo = new clases.copy.Taldeak("PK8888", "Equipo1",
				"Urdaibai", "", "");
		Taldea.add(Equipo);
		String Buscador = "Equipo1";
		boolean Encontrado = false;
		int todoOK=0;
		for (i = 0; Taldea.size() > i && !Encontrado == true; i++) {
			if (Taldea.get(i).getIzena().equals(Buscador)) {
				Encontrado = true;
				Taldea.get(i).setKod_taldea("PK8888");
				Taldea.get(i).setIzena("Equipo3");
				Taldea.get(i).setUdalerri("Equipo4");
				Taldea.get(i).setPosta("Equipo5");
				Taldea.get(i).setPosta("Equipo6");
			}
		}
		i = i-1;
		
		if (Taldea.get(i).getKod_taldea().equals("PK8888")&&Taldea.get(i).getIzena().equals("Equipo3")&& 
				Taldea.get(i).getUdalerri().equals("Equipo4") ) {
			todoOK=1;
		}
		assertEquals(todoOK,1);
	}
	
	@Test
	void Borrar_Taldea() {
		int i;
		int todoOK=0;
		ArrayList<clases.copy.Taldeak> Taldea = new ArrayList<clases.copy.Taldeak>();
		clases.copy.Taldeak Equipo = new clases.copy.Taldeak("PK8888", "Equipo1",
				"Urdaibai", "", "");
		Taldea.add(Equipo);
		boolean Encontrado = false;
		String Buscador = "Equipo1";
		for (i = 0; Taldea.size() > i && !Encontrado == true; i++) {
			if (Taldea.get(i).getIzena().equals(Buscador)) {
				Encontrado = true;
				Taldea.remove(i);	
			}
		}
		if(Taldea.size() == 0) {
			todoOK=1;
		}
	}
	
	@Test
	void Crear_Jugador() {
		int j;
		int todoOK=0;
		ArrayList<clases.copy.Taldeak> Taldea = new ArrayList<clases.copy.Taldeak>();
		clases.copy.Taldeak Equipo = new clases.copy.Taldeak("PK8888", "Equipo1",
				"Urdaibai", "", "");
		Taldea.add(Equipo);
		
		Jokalariak Jugador = new Jokalariak("959615","Txomin","Garcia","Equipo1");
		for (j=0;j<Taldea.size() ;j++) {
			if(Taldea.get(j).getIzena().equals(Equipo.getIzena())) {
				Taldea.get(j).getJokalaria().add(Jugador);
				break;
			}	
		}
		
		if (Taldea.get(j).getJokalaria().size()==1) {	
			todoOK = 1;
		}
	}
	
@Test
	void cambiar_juadores() {
	int ja =0;
	int ka=0;
	int j;
	boolean todoOK =false;
	ArrayList<clases.copy.Taldeak> Taldea = new ArrayList<clases.copy.Taldeak>();
	clases.copy.Taldeak Equipo = new clases.copy.Taldeak("PK8888", "Equipo1",
			"Urdaibai", "", "");
	Taldea.add(Equipo);
	Jokalariak Jugador = new Jokalariak("959615","Txomin","Garcia","Equipo1");
	for (j=0;j<Taldea.size() ;j++) {
		if(Taldea.get(j).getIzena().equals(Equipo.getIzena())) {
			Taldea.get(j).getJokalaria().add(Jugador);
			break;
			}	
	}
	for ( j=0; j<Taldea.size();j++) {
		if (Taldea.get(j).getIzena().equals("Equipo1")) {
			for (int k=0; k<Taldea.get(j).getJokalaria().size();k++) {
				if(Taldea.get(j).getJokalaria().get(k).getIzena().equals("Txomin") ) {
					ja = j;
					ka = k;
				}
			}
		}
	}
	Taldea.get(ja).getJokalaria().get(ka).setDni_joka("999999");
	Taldea.get(ja).getJokalaria().get(ka).setIzena("Irati");
	Taldea.get(ja).getJokalaria().get(ka).setAbizena("Garcia");
	Taldea.get(ja).getJokalaria().get(ka).setTaldea("Equipo1");
	
	if(Taldea.get(ja).getJokalaria().get(ka).getDni_joka().equals("999999") &&
			Taldea.get(ja).getJokalaria().get(ka).getIzena().equals("Irati") &&
			Taldea.get(ja).getJokalaria().get(ka).getAbizena().equals("Garcia")) {
		todoOK = true;
	}
	assertTrue(todoOK);
}
	@Test
	void Borrar_Jugadores() {
		int j;
		int i=0;
		int todoOK=0;
		ArrayList<clases.copy.Taldeak> Taldea = new ArrayList<clases.copy.Taldeak>();
		clases.copy.Taldeak Equipo = new clases.copy.Taldeak("PK8888", "Equipo1",
				"Urdaibai", "", "");
		Taldea.add(Equipo);
		
		Jokalariak Jugador = new Jokalariak("959615","Txomin","Garcia","Equipo1");
		for (j=0;j<Taldea.size() ;j++) {
			if(Taldea.get(j).getIzena().equals(Equipo.getIzena())) {
				Taldea.get(j).getJokalaria().add(Jugador);
				break;
			}	
		}
			if (Taldea.get(i).getIzena().equals("Equipo1"))  {
				for (int k=0;k<Taldea.get(i).getJokalaria().size();k++) {
					if (Taldea.get(i).getJokalaria().get(k).getIzena().equals("Txomin")) {
						Taldea.get(i).getJokalaria().remove(k);
					}
				}
			}
			if(Taldea.get(i).getJokalaria().size()==0) {
				todoOK=1;
			}
		}
	
}
