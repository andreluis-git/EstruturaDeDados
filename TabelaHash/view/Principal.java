package view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import controller.HashLinear;
import controller.TabComLista;

public class Principal {
	 public static void main(String[] args) {
		 HashLinear tab = new HashLinear(26);
		 Scanner le = new Scanner(System.in);
		 String item;
		 System.out.println("\n*******************************************************");
		 System.out.println("Tabela HASH com tratamento de colisoes Linear");
		 System.out.print("***********************************************************");
		 for (int i = 0; i < 26; i++) {
			 System.out.print("\n\nInserindo elemento " + (i + 1));
			 System.out.print(" - Forneca um nome: ");
			 item = le.nextLine();
			 tab.insere(item);
		 } 
		 
		 HashMap<Integer, ArrayList<String>> hm = new HashMap<>();
		 
		 // Converte a Tabela Hash em Tabela Hash com Lista
		 hm = convertVetor(tab.getVetor());
		 
		 System.out.println("\n\n------- Lista encadeada de nomes dentro da Tabela ----------\n");
		 for(int i = 0, size = tab.getVetor().length; i < size; i++) {
			 if(!(hm.get(i) == null))
				 System.out.println("Chave " + i + " -> " + hm.get(i));
			 else
				 System.out.println("Chave " + i + " -> Vazia");
		 }
	}
	 
	 public static HashMap<Integer, ArrayList<String>> convertVetor(String vetor[]){
			HashMap<Integer, ArrayList<String>> hm = new HashMap<>();
			TabComLista list = new TabComLista();
			 
			 for(String nome : vetor) {
				 list.adiciona(nome, hm);
			 }
			 
			 return hm;
		}
}