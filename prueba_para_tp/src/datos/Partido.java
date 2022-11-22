package datos;

public class Partido {

	private Pais pais1;
	private Pais pais2;
	private int id_partido;
	private int duración;
	private int goles1;
	private int goles2;
	private int puntos1;
	private int puntos2;
	
	

	public Partido(Pais pais1, Pais pais2, int id_partido, int duración, int goles1, int goles2, int puntos1,
			int puntos2) {
		super();
		this.pais1 = pais1;
		this.pais2 = pais2;
		this.id_partido = id_partido;
		this.duración = duración;
		this.goles1 = goles1;
		this.goles2 = goles2;
		this.puntos1 = puntos1;
		this.puntos2 = puntos2;
	}

	public Pais getPais1() {
		return pais1;
	}

	public void setPais1(Pais pais1) {
		this.pais1 = pais1;
	}

	public Pais getPais2() {
		return pais2;
	}

	public void setPais2(Pais pais2) {
		this.pais2 = pais2;
	}

	public int getId_partido() {
		return id_partido;
	}

	public void setId_partido(int id_partido) {
		this.id_partido = id_partido;
	}

	public int getDuración() {
		return duración;
	}

	public void setDuración(int duración) {
		this.duración = duración;
	}

	
	
	
	public int getGoles1() {
		return goles1;
	}

	public void setGoles1(int goles1) {
		this.goles1 = goles1;
	}

	public int getGoles2() {
		return goles2;
	}

	public void setGoles2(int goles2) {
		this.goles2 = goles2;
	}

	public int getPuntos1() {
		return puntos1;
	}

	public void setPuntos1(int puntos1) {
		this.puntos1 = puntos1;
	}

	public int getPuntos2() {
		return puntos2;
	}

	public void setPuntos2(int puntos2) {
		this.puntos2 = puntos2;
	}

	@Override
	public String toString() {
		return "Partido [pais1=" + pais1 + ", pais2=" + pais2 + ", id_partido=" + id_partido + ", duración=" + duración
				+ ", goles1=" + goles1 + ", goles2=" + goles2 + ", puntos1=" + puntos1 + ", puntos2=" + puntos2 + "]";
	}


	}

	
	

