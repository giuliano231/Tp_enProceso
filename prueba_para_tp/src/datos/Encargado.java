package datos;

import java.lang.reflect.Array;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Encargado {
	
	private String nombre;
	private String apellido;
	private int id_encargado;
	
	public Encargado(String nombre, String apellido, int id_encargado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.id_encargado = id_encargado;
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

	public int getId_encargado() {
		return id_encargado;
	}

	public void setId_encargado(int id_encargado) {
		this.id_encargado = id_encargado;
	}
	

	@Override
	public String toString() {
		return "Encargado [nombre=" + nombre + ", apellido=" + apellido + ", id_encargado=" + id_encargado + "]";
	}

	
	public static void MostrarFgrupos(LinkedList<Pais> Fgrupos){
		for (Pais Pais : Fgrupos) {
			System.out.println("Grupo "+Pais.getGrupo());
			System.out.println(Pais.getNombre() + " este pais gano "+ Pais.getSelección().getPartidos_ganados()+ " empato " + Pais.getSelección().getEmpates() + " Perdio "+ Pais.getSelección().getPartidos_perdidos() + " Goles a Favor  "+ Pais.getSelección().getGoles_a_favor()+ " Goles en Contra " + Pais.getSelección().getGoles_en_contra()+ " Puntos "+ Pais.getSelección().getPuntos_Fgrupos());
		}
	} 
	
	
	public static LinkedList<Pais> Fgrupos(){
		LinkedList<Partido> todos = FParajugar();
		LinkedList<Pais> Fgrupos = new LinkedList<Pais>();
		for (Partido partido : todos) {
				partido.setGoles1((int)(Math.random()*3+1));
				partido.setGoles2((int)(Math.random()*3+1));
				
			if(partido.getGoles1() > partido.getGoles2() ) {
				partido.getPais1().getSelección().setPartidos_ganados(partido.getPais1().getSelección().getPartidos_ganados()+1);
				partido.getPais1().getSelección().setPuntos_Fgrupos(partido.getPais1().getSelección().getPuntos_Fgrupos()+3);
				partido.getPais2().getSelección().setPartidos_perdidos(partido.getPais2().getSelección().getPartidos_perdidos()+1);
				
				partido.getPais1().getSelección().setGoles_a_favor(partido.getPais1().getSelección().getGoles_a_favor() + partido.getGoles1());
				partido.getPais1().getSelección().setGoles_en_contra(partido.getPais1().getSelección().getGoles_en_contra() + partido.getGoles2());
				partido.getPais2().getSelección().setGoles_a_favor(partido.getPais2().getSelección().getGoles_a_favor() + partido.getGoles2());
				partido.getPais2().getSelección().setGoles_en_contra(partido.getPais2().getSelección().getGoles_en_contra() +partido.getGoles1() );
			}else {
				partido.getPais2().getSelección().setPartidos_ganados(partido.getPais2().getSelección().getPartidos_ganados()+1);
				partido.getPais2().getSelección().setPuntos_Fgrupos(partido.getPais2().getSelección().getPuntos_Fgrupos()+3);
				partido.getPais1().getSelección().setPartidos_perdidos(partido.getPais1().getSelección().getPartidos_perdidos()+1);
				
				partido.getPais2().getSelección().setGoles_a_favor(partido.getPais2().getSelección().getGoles_a_favor() + partido.getGoles2());
				partido.getPais2().getSelección().setGoles_en_contra(partido.getPais2().getSelección().getGoles_en_contra() + partido.getGoles1());
				partido.getPais1().getSelección().setGoles_a_favor(partido.getPais1().getSelección().getGoles_a_favor() + partido.getGoles1());
				partido.getPais1().getSelección().setGoles_en_contra(partido.getPais1().getSelección().getGoles_en_contra() +partido.getGoles2() );
			}
			
			if (Fgrupos.contains(partido.getPais1())==false) {
				Fgrupos.add(partido.getPais1());
			}
			if(Fgrupos.contains(partido.getPais2())==false){
				Fgrupos.add(partido.getPais2());				
		}
		}
		
		return Fgrupos;
	}

	
	
	
	
	public static LinkedList<Partido> FParajugar(){
	       LinkedList<Partido> todos = new LinkedList<Partido>();
			 Selección S_Qatar = new  Selección("S_Qatar","Hassan Al Haydos",0,0,0,0,0,0);
			 Pais Qatar = new Pais("Qatar",true,'A',S_Qatar,1);
			 
			 Selección S_Ecuador = new  Selección("S_Ecuador","Hassan Al Haydos",0,0,0,0,0,0);
			 Pais Ecuador = new Pais("Ecuador",true,'A',S_Ecuador,2);
			 
			 Selección S_Senegal = new  Selección("S_Senegal","Hassan Al Haydos",0,0,0,0,0,0);
			 Pais Senegal = new Pais("Senegal",true,'A',S_Senegal,1);
			 
			 Selección S_Pbajos = new  Selección("S_Pbajos","Hassan Al Haydos",0,0,0,0,0,0);
			 Pais Pbajos = new Pais("Paises bajos",true,'A',S_Pbajos,3);
			 
			
			 Selección S_Inglaterra = new  Selección("S_Inglaterra","Hassan Al Haydos",0,0,0,0,0,0);
			 Pais Inglaterra = new Pais("Inglaterra",true,'B',S_Inglaterra,4);
			 
			
			 Selección S_EEUU = new  Selección("S_EEUU","Hassan Al Haydos",0,0,0,0,0,0);
			 Pais Estados_Unidos = new Pais("Estados Unidos",true,'B',S_EEUU,2);
			 
			 
			 Selección S_Iran = new  Selección("S_Iran","Hassan Al Haydos",0,0,0,0,0,0);
			 Pais Iran = new Pais("Iran",true,'B',S_Iran,1);
			 
			
			 Selección S_Gales = new  Selección("S_Gales","Hassan Al Haydos",0,0,0,0,0,0);
			 Pais Gales = new Pais("Gales",true,'B',S_Gales,2);
			 
			 
			 Selección S_argentina = new  Selección("S_Argentina","Messi",0,0,0,0,0,0);
			 Pais Argentina = new Pais("Argentina",true,'C',S_argentina,5);
			 
			
			 Selección S_Arabia = new  Selección("S_Arabia","Messi",0,0,0,0,0,0);
			 Pais Arabia = new Pais("Arabia Saudi",true,'C',S_Arabia,1);
			 
			
			 Selección S_Mexico = new  Selección("S_Mexico","Messi",0,0,0,0,0,0);
			 Pais Mexico = new Pais("Mexico",true,'C',S_Mexico,2);
			 
			 
			 Selección S_Polonia = new  Selección("S_Polonia","Messi",0,0,0,0,0,0);
			 Pais Polonia = new Pais("Polonia",true,'C',S_Polonia,3);
			 
			
			 Selección S_Francia = new  Selección("S_Francia","Messi",0,0,0,0,0,0);
			 Pais Francia = new Pais("Francia",true,'D',S_Francia,5);
			 
			 
			 Selección S_Australia = new  Selección("S_Australia","Messi",0,0,0,0,0,0);
			 Pais Australia = new Pais("Australia",true,'D',S_Australia,1);
			 
			 
			 Selección S_Dinamarca = new  Selección("S_Dinamarca","Messi",0,0,0,0,0,0);
			 Pais Dinamarca = new Pais("Dinamarca",true,'D',S_Dinamarca,2);
			 
			 
			 Selección S_Tunez = new  Selección("S_Tunez","Messi",0,0,0,0,0,0);
			 Pais Tunez = new Pais("Tunez",true,'D',S_Tunez,1);
			 
			
			 Selección S_España = new  Selección("S_España","Messi",0,0,0,0,0,0);
			 Pais España = new Pais("España",true,'E',S_España,4);
			 
			 
			 Selección S_Costa_Rica = new  Selección("S_Costa_Rica","Messi",0,0,0,0,0,0);
			 Pais Costa_Rica = new Pais("Costa Rica",true,'E',S_Costa_Rica,2);
			 
			 
			 Selección S_Alemania = new  Selección("S_Alemania","Messi",0,0,0,0,0,0);
			 Pais Alemania = new Pais("Alemania",true,'E',S_Alemania,4);
			 
			 
			 Selección S_Japon = new  Selección("S_Japon","Messi",0,0,0,0,0,0);
			 Pais Japon = new Pais("Japon",true,'E',S_Japon,2);
			 
			 
			 Selección S_Belgica = new  Selección("S_Belgica","Messi",0,0,0,0,0,0);
			 Pais Belgica = new Pais("Belgica",true,'F',S_Belgica,4);
			 
			
			 Selección S_Canada = new  Selección("S_Canada","Messi",0,0,0,0,0,0);
			 Pais Canada = new Pais("Canada",true,'F',S_Canada,1);
			 
			 
			 Selección S_Marruecos = new  Selección("S_Marruecos","Messi",0,0,0,0,0,0);
			 Pais Marruecos = new Pais("Marruecos",true,'F',S_Marruecos,1);
			 
			 
			 Selección S_Croacia = new  Selección("S_Croacia","Messi",0,0,0,0,0,0);
			 Pais Croacia = new Pais("Croacia",true,'F',S_Croacia,4);
			 
			 
			 Selección S_Brasil = new  Selección("S_Brasil","Messi",0,0,0,0,0,0);
			 Pais Brasil = new Pais("Brasil",true,'G',S_Brasil,5);
			 
			 
			 Selección S_Serbia = new  Selección("S_Serbia","Messi",0,0,0,0,0,0);
			 Pais Serbia = new Pais("Serbia",true,'G',S_Serbia,1);
			 
			
			 Selección S_Suiza = new  Selección("S_Suiza","Messi",0,0,0,0,0,0);
			 Pais Suiza = new Pais("Suiza",true,'G',S_Suiza,1);
			 
			
			 Selección S_Camerun = new  Selección("S_Camerun","Messi",0,0,0,0,0,0);
			 Pais Camerun = new Pais("Camerun",true,'G',S_Camerun,2);
			 
		
			 Selección S_Portugal = new  Selección("S_Portugal","Messi",0,0,0,0,0,0);
			 Pais Portugal = new Pais("Portugal",true,'H',S_Portugal,3);
			 
			
			 Selección S_Ghana = new  Selección("S_Ghana","Messi",0,0,0,0,0,0);
			 Pais Ghana = new Pais("Ghana",true,'H',S_Ghana,1);
			 
			
			 Selección S_Uruguay = new  Selección("S_Uruguay","Messi",0,0,0,0,0,0);
			 Pais Uruguay = new Pais("Uruguay",true,'H',S_Uruguay,3);
			 
			
			 Selección S_Corea_sur = new  Selección("S_Corea del sur","Messi",0,0,0,0,0,0);
			 Pais Corea_sur = new Pais("Corea del sur",true,'H',S_Corea_sur,1);
			 
			Partido partido1 = new Partido (Qatar,Ecuador,1,90,0,0,0,0);
			Partido partido2 = new Partido (Senegal,Pbajos,2,90,0,0,0,0);
			Partido partido3 = new Partido (Pbajos,Ecuador,3,90,0,0,0,0);
			Partido partido4 = new Partido (Qatar,Senegal,4,90,0,0,0,0);
			Partido partido5 = new Partido (Pbajos,Qatar,5,90,0,0,0,0);
			Partido partido6 = new Partido (Ecuador,Senegal,6,90,0,0,0,0);
			todos.add(partido1);
			todos.add(partido2);
			todos.add(partido3);
			todos.add(partido4);
			todos.add(partido5);
			todos.add(partido6);
			Partido partido7 = new Partido (Inglaterra,Iran,7,90,0,0,0,0);
			Partido partido8 = new Partido (Estados_Unidos,Gales,8,90,0,0,0,0);
			Partido partido9 = new Partido (Inglaterra,Estados_Unidos,9,90,0,0,0,0);
			Partido partido10 = new Partido (Gales,Iran,10,90,0,0,0,0);
			Partido partido11 = new Partido (Iran,Estados_Unidos,11,90,0,0,0,0);
			Partido partido12 = new Partido (Gales,Inglaterra,12,90,0,0,0,0);
			todos.add(partido7);
			todos.add(partido8);
			todos.add(partido9);
			todos.add(partido10);
			todos.add(partido11);
			todos.add(partido12);
			Partido partido13 = new Partido (Argentina,Arabia,13,90,0,0,0,0);
			Partido partido14 = new Partido (Mexico,Polonia,14,90,0,0,0,0);
			Partido partido15 = new Partido (Argentina,Mexico,15,90,0,0,0,0);
			Partido partido16 = new Partido (Polonia,Arabia,16,90,0,0,0,0);
			Partido partido17 = new Partido (Arabia,Mexico,17,90,0,0,0,0);
			Partido partido18 = new Partido (Polonia,Argentina,18,90,0,0,0,0);
			todos.add(partido13);
			todos.add(partido14);
			todos.add(partido15);
			todos.add(partido16);
			todos.add(partido17);
			todos.add(partido18);
			Partido partido19 = new Partido (Dinamarca,Tunez,19,90,0,0,0,0);
			Partido partido20 = new Partido (Francia,Australia,20,90,0,0,0,0);
			Partido partido21 = new Partido (Tunez,Australia,21,90,0,0,0,0);
			Partido partido22 = new Partido (Francia,Dinamarca,22,90,0,0,0,0);
			Partido partido23 = new Partido (Tunez,Francia,23,90,0,0,0,0);
			Partido partido24 = new Partido (Australia,Dinamarca,24,90,0,0,0,0);
			todos.add(partido19);
			todos.add(partido20);
			todos.add(partido21);
			todos.add(partido22);
			todos.add(partido23);
			todos.add(partido24);
			
			
			Partido partido25 = new Partido (Alemania,Japon,25,90,0,0,0,0);
			Partido partido26 = new Partido (España,Costa_Rica,26,90,0,0,0,0);
			Partido partido27 = new Partido (Japon,Costa_Rica,27,90,0,0,0,0);
			Partido partido28 = new Partido (España,Alemania,28,90,0,0,0,0);
			Partido partido29= new Partido (Costa_Rica,Alemania,29,90,0,0,0,0);
			Partido partido30= new Partido (Japon,España,30,90,0,0,0,0);
			todos.add(partido25);
			todos.add(partido26);
			todos.add(partido27);
			todos.add(partido28);
			todos.add(partido29);
			todos.add(partido30);
			Partido partido31 = new Partido (Marruecos,Croacia,31,90,0,0,0,0);
			Partido partido32 = new Partido (Belgica,Canada,32,90,0,0,0,0);
			Partido partido33 = new Partido (Belgica,Marruecos,33,90,0,0,0,0);
			Partido partido34 = new Partido (Canada,Croacia,34,90,0,0,0,0);
			Partido partido35 = new Partido (Belgica,Croacia,35,90,0,0,0,0);
			Partido partido36 = new Partido (Canada,Marruecos,36,90,0,0,0,0);
			todos.add(partido31);
			todos.add(partido32);
			todos.add(partido33);
			todos.add(partido34);
			todos.add(partido35);
			todos.add(partido36);
			Partido partido37 = new Partido (Suiza,Camerun,37,90,0,0,0,0);
			Partido partido38 = new Partido (Brasil,Serbia,38,90,0,0,0,0);
			Partido partido39 = new Partido (Serbia,Camerun,39,90,0,0,0,0);
			Partido partido40 = new Partido (Brasil,Suiza,40,90,0,0,0,0);
			Partido partido41 = new Partido (Brasil,Camerun,41,90,0,0,0,0);
			Partido partido42 = new Partido (Serbia,Suiza,42,90,0,0,0,0);
			todos.add(partido37);
			todos.add(partido38);
			todos.add(partido39);
			todos.add(partido40);
			todos.add(partido41);
			todos.add(partido42);
			Partido partido43 = new Partido (Uruguay,Corea_sur,43,90,0,0,0,0);
			Partido partido44 = new Partido (Portugal,Ghana,44,90,0,0,0,0);
			Partido partido45 = new Partido (Ghana,Corea_sur,45,90,0,0,0,0);
			Partido partido46 = new Partido (Portugal,Uruguay,46,90,0,0,0,0);
			Partido partido47 = new Partido (Portugal,Corea_sur,47,90,0,0,0,0);
			Partido partido48 = new Partido (Ghana,Uruguay,48,90,0,0,0,0);
			todos.add(partido43);
			todos.add(partido44);
			todos.add(partido45);
			todos.add(partido46);
			todos.add(partido47);
			todos.add(partido48);
		

	
			return todos;
		
}

}
