package grafospart1.src.carregaGrafos;

import java.io.*;
import java.io.IOException;
import java.util.LinkedList;

public class LeituraGrafos {

	static void leituraMatriz(String nomeArq) {
		try {// tenta ler o arquivo
			FileReader ent = new FileReader(nomeArq); // associa var a arq
			BufferedReader br = new BufferedReader(ent);// abre parq p/ler
			String linha;
			String[] campos = null;
			String[] campos2 = null;

			int n = Integer.parseInt(br.readLine()); // lê 1a linha
			int M[][] = new int[n + 1][n + 1]; // pega número vért

			while ((linha = br.readLine()) != null) {
				campos = linha.split(":");// quebra dados separados por ":"
				int u = Integer.parseInt(campos[0]);
				campos2 = campos[1].split(",");// quebra dados separados por ","
				for (String edge : campos2) {
					int v = Integer.parseInt(edge);
                                      
					M[u][v] = 1;
					M[v][u] = 1;
				}
			}
			br.close();// fecha arquivo

			// percorre e escreve matriz de adjacências
			System.out.print("    ");
			for (int i = 1; i <= n; i++) {
				System.out.printf(" %2d |", i);
			}
			System.out.println();
			for (int i = 1; i <= n; i++) {
				System.out.printf(" %2d|", i);
				for (int j = 1; j <= n; j++) {
					if (M[i][j] == 1) {
						System.out.print("  X |");
					} else if (i == j) {
						System.out.print("  0 |");
					} else {
						System.out.print("    |");
					}
				}
				System.out.println();
			}
		} catch (IOException erro) {// não conseguiu ler o arquivo
			System.out.println("Erro na leitura do arquivo!");
		}
	}
        static void leituraLista(String nomeArq) {
            try {// tenta ler o arquivo
               FileReader ent = new FileReader(nomeArq); // associa var a arq
			BufferedReader br = new BufferedReader(ent);// abre parq p/ler
			String linha;
			String[] campos = null;
			String[] campos2 = null;

			int n = Integer.parseInt(br.readLine()); // lê 1a linha
                        LinkedList L[] = new LinkedList[n+1]; // pega número vért
                        
			//int M[][] = new int[n + 1][n + 1]; 

			while ((linha = br.readLine()) != null) {
				campos = linha.split(":");// quebra dados separados por ":"
				int u = Integer.parseInt(campos[0]);
				campos2 = campos[1].split(",");// quebra dados separados por ","
                                L[u]=new LinkedList();
				for (String edge : campos2) {                                
                                        L[u].add(Integer.parseInt(edge));                            
				}
			}
			br.close();// fecha arquivo

			// percorre e escreve matriz de adjacências
			
			System.out.println();
			for (int i = 1; i <= n; i++) {
                                if(!L[i].isEmpty()){
                                    for (int j = 1; j < L[i].size(); j++) {
                                    	System.out.print("=>"+L[i].get(j).toString()+" ");
                                    }
                                    System.out.println();
                                }
			}
            } catch (IOException erro) {// não conseguiu ler o arquivo
			System.out.println("Erro na leitura do arquivo!");
		}
        }

	public static void main(String[] args) {
		System.out.println("\n MATRIZ DE ADJACÊNCIAS \n");
		leituraMatriz("src//p/entrada1.in");
                leituraMatriz("src//p/entrada2.in");
		System.out.println("\n LISTA DE ADJACÊNCIAS \n");
		leituraLista("src//p/entrada1.in");
                leituraLista("src//p/entrada2.in");
	}
}
