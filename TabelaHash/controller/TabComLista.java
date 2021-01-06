package controller;

import java.util.ArrayList;
import java.util.HashMap;

public class TabComLista {
	
	public HashMap<Integer, ArrayList<String>> adiciona(String item, HashMap<Integer, ArrayList<String>> hm) {
		int posicao = (int) item.toLowerCase().charAt(0) - 97;
		ArrayList<String> aux = new ArrayList<>();
		if(hm.isEmpty()) {
			aux.add(item);
			hm.put(posicao, aux);
		} else {
			if(!hm.containsKey(posicao)) {
				aux.add(item);
				hm.put(posicao, aux);
			} else {
				aux = (ArrayList<String>) hm.get(posicao);
				aux.add(item);
				hm.put(posicao, aux);
			}
		}
		return hm;
	}
}
