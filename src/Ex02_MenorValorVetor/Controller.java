package Ex02_MenorValorVetor;

public class Controller {
		public int verificar(int [] x , int n, int c) {
			if (c < 0) { //Quando o contador chegar na posição -1, depois de ter lido a posição 0 do vetor, ele deve retornar n, que seria o menor número do vetor
				return n;
			}else {
				if (x[c] < n) { //se o valor da posição C do vetor for menor que o valor de n, substituir o valor de n, tornando o menor número registrado.
					n = x[c]; //Substituição
					return n = verificar(x, n, c-1 ); //Chama a propria função subtraindo 1 da variavel c;

				}else {//caso o valor do vetor na posição C seja maior que o menor valor registrado, n, pular para o proximo termo.
					return verificar(x,n,c-1);
				}
			}
			
		}
}
