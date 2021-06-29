
public class TestaConversao {

	
		public static void main (String[] args) {
			
			float pontoFlutuante = 3.14f; // 4 bytes
			
			double salario = 1270.50;
			int valor = (int) salario; 
			System.out.println(valor);
			
			long numeroGrande = 32143346564L; // 64 bytes
			
			double valor1 = 0.2;
			double valor2 = 0.1;
			double total = valor1 + valor2;
			
			System.out.println(total);
			
			
		}
}
