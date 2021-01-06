package controller;

class MergeSort 
{
    void merge(Candidato[] candidatos, int inicio, int meio, int fim)
    {
        int arr1 = meio - inicio + 1;
        int arr2 = fim - meio;
 
        Candidato esquerda[] = new Candidato[arr1];
        Candidato direita[] = new Candidato[arr2];
 
        for (int i = 0; i < arr1; ++i)
            esquerda[i] = candidatos[inicio + i];
        for (int j = 0; j < arr2; ++j)
            direita[j] = candidatos[meio + 1 + j];
 
        int i = 0, j = 0;
 
        int k = inicio;
        while (i < arr1 && j < arr2) {
        	long cpfCandidatoL = Long.parseLong(esquerda[i].cpfCandidato);
        	long cpfCandidatoR = Long.parseLong(direita[j].cpfCandidato);
        	
            if (cpfCandidatoL <= cpfCandidatoR) {
                candidatos[k] = esquerda[i];
                i++;
            }
            else {
                candidatos[k] = direita[j];
                j++;
            }
            k++;
        }
 
        while (i < arr1) {
            candidatos[k] = esquerda[i];
            i++;
            k++;
        }
 
        while (j < arr2) {
            candidatos[k] = direita[j];
            j++;
            k++;
        }
    }
 
    void sort(Candidato[] candidatos, int inicio, int fim)
    {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
 
            sort(candidatos, inicio, meio);
            sort(candidatos, meio + 1, fim);
 
            merge(candidatos, inicio, meio, fim);
        }
    }
 
    static void printArray(Candidato[] candidatos)
    {
        int n = candidatos.length;
        for (int i = 0; i < n; ++i) {
        	System.out.println(candidatos[i].nomeCandidato + " " + candidatos[i].cpfCandidato);
        }
    }
}
