package grafospart1.src.carregaGrafos;


import java.util.Scanner;

public class LeituraGrafos {
	public static void main(String[] args) {
                Grafos grafos = new Grafos();
                Scanner entrada = new Scanner(System.in);
                int verticePesquisa,vertice1,vertice2;
		System.out.println("\n MATRIZ DE ADJACÊNCIAS \n");
		grafos.leituraMatriz("src//p/entrada1.in"); 
		System.out.println("\n LISTA DE ADJACÊNCIAS \n");
		grafos.leituraLista("src//p/entrada1.in");
                System.out.println("\n Digite um Vertice par ver seus adjacentes:");
                verticePesquisa=entrada.nextInt();
                System.out.println("Resultado na Lista:");
                grafos.imprimeVerticeL(verticePesquisa);
                System.out.println("Resultado na Matriz:");
                grafos.imprimeVerticeM(verticePesquisa);
                System.out.println("\n Digite dois vertices para saber se são adjasentes:");
                System.out.println("Vertice 1:");
                vertice1=entrada.nextInt();
                System.out.println("Vertice 2:");
                vertice2=entrada.nextInt();
                System.out.println("Resultado na Lista:");
                System.out.println(grafos.verAdjasenciaL(vertice1, vertice2));
                System.out.println("Resultado na Matriz:");
                System.out.println(grafos.verAdjasenciaM(vertice1, vertice2));
	}
}
