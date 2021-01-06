package controller;

class QuickSort 
{ 
	int partition(Candidato[] arr, int inicio, int fim) 
	{ 
		String pivot = arr[fim].nomeCandidato; 
		int i = (inicio-1); 
		for (int j=inicio; j<fim; j++) 
		{ 
			int tamanhoNome;
			if(arr[j].nomeCandidato.length() < pivot.length()) {
				tamanhoNome = arr[j].nomeCandidato.length();
			} else {
				tamanhoNome = pivot.length();
			}
		 for(int k = 0; k < tamanhoNome; k++) {
				if(!(arr[j].nomeCandidato.toLowerCase().charAt(k) == pivot.toLowerCase().charAt(k))){
					if(arr[j].nomeCandidato.toLowerCase().charAt(k) < pivot.toLowerCase().charAt(k)) {
						i++; 

			             Candidato temp = arr[i]; 
			             arr[i] = arr[j]; 
			             arr[j] = temp;
					}
					break;
				}
    	 }
		} 

		Candidato temp = arr[i+1]; 
		arr[i+1] = arr[fim]; 
		arr[fim] = temp; 

		return i+1; 
	} 


	void sort(Candidato[] arr, int inicio, int fim) 
	{ 
		if (inicio < fim) 
		{ 
			int pi = partition(arr, inicio, fim); 

			sort(arr, inicio, pi-1); 
			sort(arr, pi+1, fim); 
		} 
	} 

} 
