package exercicio6;

public class MainEx06 {
	
	public static void main(String[] args) {
		int[] v = {2,3,5,6,7,9,8,4,25,27,44,18,36};
		System.out.println(menor(v, 0, v.length-1));
	}
	
	// Algoritmo recursivo para encontrar o menor valor de um vetor
	public static int menor(int v[], int inicio, int fim) {
		int meio = (inicio+fim)/2;
		int n1, n2;
		if(meio>inicio){
			n1=menor(v, inicio, meio);
			n2=menor(v, meio+1, fim);
		} else{
			n1=v[inicio];
			n2=v[fim];
		}
		if(n1<n2) return n1; else return n2;
	}
}
