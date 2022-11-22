package interfaz;

import java.awt.JobAttributes;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import datos.Partido;
import datos.Selección;
import datos.Encargado;
import datos.Pais;

public class Main {

	public static void main(String[] args) {

		
	 Encargado encargado1 =new Encargado("Giuliano","Alegre",1);
	LinkedList<Pais> Fgrupos1 = encargado1.Fgrupos();
	encargado1.MostrarFgrupos(Fgrupos1);
	
	String A1 = JOptionPane.showInputDialog("ingrese el Primero del grupo A");
	String A2 = JOptionPane.showInputDialog("ingrese el Segundo del grupo A");
	if(Fgrupos1.contains(A1)){
		System.out.println("La lista contiene " + A1 );
	}else{
		System.out.println("No contiene el elemnto buscado");
	}
	if(Fgrupos1.contains(A2)){
		System.out.println("La lista contiene " + A1 );
	}else{
		System.out.println("No contiene el elemnto buscado");
	}
	}
}
