package datos;


public class Selección {	
private String nombre;
private String jugador_estrella;
private int Puntos_Fgrupos;
private int Partidos_ganados;
private int Partidos_perdidos;
private int empates;
private int Goles_a_favor;
private int Goles_en_contra;


public Selección(String nombre, String jugador_estrella, int puntos_Fgrupos, int partidos_ganados,
		int partidos_perdidos, int empates, int goles_a_favor, int goles_en_contra) {
	super();
	this.nombre = nombre;
	this.jugador_estrella = jugador_estrella;
	Puntos_Fgrupos = puntos_Fgrupos;
	Partidos_ganados = partidos_ganados;
	Partidos_perdidos = partidos_perdidos;
	this.empates = empates;
	Goles_a_favor = goles_a_favor;
	Goles_en_contra = goles_en_contra;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getJugador_estrella() {
	return jugador_estrella;
}

public void setJugador_estrella(String jugador_estrella) {
	this.jugador_estrella = jugador_estrella;
}


public int getPuntos_Fgrupos() {
	return Puntos_Fgrupos;
}

public void setPuntos_Fgrupos(int puntos_Fgrupos) {
	Puntos_Fgrupos = puntos_Fgrupos;
}

public int getPartidos_ganados() {
	return Partidos_ganados;
}

public void setPartidos_ganados(int partidos_ganados) {
	Partidos_ganados = partidos_ganados;
}

public int getEmpates() {
	return empates;
}

public void setEmpates(int empates) {
	this.empates = empates;
}

public int getGoles_a_favor() {
	return Goles_a_favor;
}

public void setGoles_a_favor(int goles_a_favor) {
	Goles_a_favor = goles_a_favor;
}

public int getGoles_en_contra() {
	return Goles_en_contra;
}

public void setGoles_en_contra(int goles_en_contra) {
	Goles_en_contra = goles_en_contra;
}



public int getPartidos_perdidos() {
	return Partidos_perdidos;
}

public void setPartidos_perdidos(int partidos_perdidos) {
	Partidos_perdidos = partidos_perdidos;
}

@Override
public String toString() {
	return "Selección [nombre=" + nombre + ", jugador_estrella=" + jugador_estrella + ", Puntos_Fgrupos="
			+ Puntos_Fgrupos + ", Partidos_ganados=" + Partidos_ganados + ", Partidos_perdidos=" + Partidos_perdidos
			+ ", empates=" + empates + ", Goles_a_favor=" + Goles_a_favor + ", Goles_en_contra=" + Goles_en_contra
			+ "]";
}





}
