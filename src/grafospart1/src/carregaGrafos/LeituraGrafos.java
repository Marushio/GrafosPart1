package grafospart1.src.carregaGrafos;

import java.io.*;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class LeituraGrafos {
	public static void main(String[] args) {
                Grafos grafos = new Grafos();
                Scanner entrada = new Scanner(System.in);
                int verticePesquisa;
		System.out.println("\n MATRIZ DE ADJACÊNCIAS \n");
		grafos.leituraMatriz("src//p/entrada1.in"); 
                
		System.out.println("\n LISTA DE ADJACÊNCIAS \n");
		grafos.leituraLista("src//p/entrada1.in");
                System.out.println("\n Digite um Vertice par ver seus adjacentes \n");
                verticePesquisa=entrada.nextInt();
                grafos.imprimeVerticeL(verticePesquisa);
                grafos.imprimeVerticeM(verticePesquisa);
                
                
	}
}
