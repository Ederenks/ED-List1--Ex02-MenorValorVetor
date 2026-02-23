package Ex02_MenorValorVetor;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String [] args) {
		
		
		int [] vet = new int[5];
		
			for (int i=0;i<5;i++) { //Registrar valores no vetor
				vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (+i+1) + "° termo do vetor"));
			}
		
		Controller view = new Controller(); //Instância da classe
		
		int c = vet.length - 1; //Contador deve ser -1 do tamanho do vetor, ja que o vetor é de 0 a 4.
		int n = vet[c-1];//Último valor do vetor, na posição 4.
		System.out.println( view.verificar(vet,n,c)); //Impressão e chamada da função, retornando o menor valor do vetor.
		System.exit(n);
		
	}
}
