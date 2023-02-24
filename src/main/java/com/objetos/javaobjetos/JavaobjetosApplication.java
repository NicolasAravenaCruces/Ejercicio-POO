package com.objetos.javaobjetos;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.objetos.javaobjetos.models.Conejo;
import com.objetos.javaobjetos.models.Gato;
import com.objetos.javaobjetos.models.Lapizcera;
import com.objetos.javaobjetos.models.MiniConejo;
import com.objetos.javaobjetos.models.Perro;
import com.objetos.javaobjetos.models.Plumon;
import com.objetos.javaobjetos.models.Portamina;

@SpringBootApplication
public class JavaobjetosApplication {

	public static void main(String[] args) {
		//crear al perro 
		
		// darle atributos al dogo

		Perro perroCompleto = new Perro("Salchicha","cafe",40.5,"pelo duro",'f',13523);
        //System.out.println(perroCompleto.toString());

		

		//System.out.println(perroCompleto.getTamanio());

		ArrayList <Perro> misPerros = new ArrayList<Perro>();
		//misPerros.add(perroCompleto);
		//misPerros.add(perroDefault);

 
		Scanner teclado = new Scanner(System.in);
		/*System.out.print("Cuantos perros va a ingresar?: ");
		int cantidadPerros= teclado.nextInt();
		for(int i = 1; i<=cantidadPerros; i++){
			Perro perroDefault = new Perro();

			teclado.nextLine();
			do {
				System.out.println("Ingrese perro n°"+i);
				System.out.print("Ingrese Raza: ");
				perroDefault.setRaza(teclado.nextLine());
				System.out.print("Ingrese Color: ");
				perroDefault.setColor(teclado.nextLine());
				System.out.print("Ingrese Tamaño: ");
			    perroDefault.setTamanio(teclado.nextDouble());
				teclado.nextLine();
				System.out.print("Ingrese Pelaje: ");
				perroDefault.setPelaje(teclado.nextLine());
				System.out.print("Ingrese Sexo: ");
				perroDefault.setSexo(teclado.next().charAt(0));
				System.out.print("Ingrese Chip: ");
				perroDefault.setChip(teclado.nextInt());
	
			} while (i>cantidadPerros);
			misPerros.add(perroDefault);
	
		}
		System.out.println(misPerros);*/


		//creacion de un gato

		Gato michiVacio = new Gato();
		Gato michiGordito = new Gato("MichiWaton","Persa","Peludo",true,12);

		//System.out.println(michiGordito);

		Conejo senorBigotes = new Conejo();
		Conejo badBunny = new Conejo("Bad Bunny","cabeza de leon","peludo",false,5.0);
		//System.out.println(badBunny);

		michiVacio.setNombre("Fredo");
		senorBigotes.setNombre("Bigotes");
		//System.out.println(michiVacio);
		//System.out.println(senorBigotes);

		michiGordito.maullar();

		//Plumon plumon = new Plumon();
		Plumon plumonAzul = new Plumon("plastico","tinta azul",5.0,"tapa a presion",true);

		//Portamina mina=  new Portamina();
		Portamina portamina= new Portamina("metal","mina 0,7",3.0,true,true);

		Lapizcera ceraRojo= new Lapizcera("cera","cera roja",4.0,"papel",false);

		System.out.println(plumonAzul);
		plumonAzul.pizarra();
		System.out.println(portamina);
		portamina.bosquejar();
		System.out.println(ceraRojo);
		ceraRojo.pintar();
		

		MiniConejo conejito = new MiniConejo("atomo","chico","suave",false,30.0,10.0);

		conejito.caminar();
		conejito.saltarAlto();



	}

}
