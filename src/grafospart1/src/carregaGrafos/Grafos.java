/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafospart1.src.carregaGrafos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author Marcio
 */
public class Grafos {
    private int M[][];
    private LinkedList L[];
    int qtdVertices;
    public void Grafos(){
        M=null;
        L=null;
        qtdVertices=0;
    }
    public void leituraMatriz(String nomeArq) {
                
		try {// tenta ler o arquivo
			FileReader ent = new FileReader(nomeArq); // associa var a arq
			BufferedReader br = new BufferedReader(ent);// abre parq p/ler
			String linha;
			String[] campos = null;
			String[] campos2 = null;

			qtdVertices = Integer.parseInt(br.readLine()); // lê 1a linha
		        M = new int[qtdVertices + 1][qtdVertices + 1]; // pega número vért

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
			for (int i = 1; i <= qtdVertices; i++) {
				System.out.printf(" %2d |", i);
			}
			System.out.println();
			for (int i = 1; i <= qtdVertices; i++) {
				System.out.printf(" %2d|", i);
				for (int j = 1; j <= qtdVertices; j++) {
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
        public void leituraLista(String nomeArq) {
            
            try {// tenta ler o arquivo
               FileReader ent = new FileReader(nomeArq); // associa var a arq
			BufferedReader br = new BufferedReader(ent);// abre parq p/ler
			String linha;
			String[] campos = null;
			String[] campos2 = null;

			int n = Integer.parseInt(br.readLine()); // lê 1a linha
                        L = new LinkedList[qtdVertices+1]; // pega número vért
                        
			//int M[][] = new int[n + 1][n + 1]; 

			while ((linha = br.readLine()) != null) {
				campos = linha.split(":");// quebra dados separados por ":"
				int u = Integer.parseInt(campos[0]);
				campos2 = campos[1].split(",");// quebra dados separados por ","
                                if(L[u]==null){
                                    L[u]=new LinkedList();
                                }    
				for (String edge : campos2) {  
                                    int v = Integer.parseInt(edge);
                                    L[u].add(v);
                                    
                                  
                                    if(L[v]==null){
                                        L[v] = new LinkedList();
                                    }
                                        L[v].add(u); 
                                     
                                    
				}
			}
			br.close();// fecha arquivo

			// percorre e escreve matriz de adjacências
			
			System.out.println();
			for (int i = 1; i <= n; i++) {
                                if(L[i]!=null){
                                    System.out.print(" | "+i+" | ");
                                    for (int j = 0; j < L[i].size(); j++) {
                                    	System.out.print("=>"+L[i].get(j).toString()+" ");
                                    }
                                    System.out.println();
                                }
			}
                        
            } catch (IOException erro) {// não conseguiu ler o arquivo
			System.out.println("Erro na leitura do arquivo!");
		}
            
        }
        public void imprimeVerticeL(int verticePesquisa) {
                  System.out.println("Lista:");
                  System.out.print(verticePesquisa+": ");
                  for(int i=0;i<L[verticePesquisa].size();i++){
                      System.out.print(" =>"+L[verticePesquisa].get(i));
                      
                  }
                  System.out.println();
        }
        public void imprimeVerticeM(int verticePesquisa) {  
            System.out.println("Matriz: ");
            System.out.print(verticePesquisa+"|");
	    for(int i = 0;i<qtdVertices;i++){
                    if (M[verticePesquisa][i] == 1) {
                        System.out.print(" =>"+i);
                    }
 
            }
                  
        }
}
