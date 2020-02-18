import java.util.Scanner;

class Main {

		
	public static double soma(double N1, double N2) {
			return N1 + N2;
		}
	 static double subtracao(double N1, double N2) {
		   return N1 - N2;
		}
		public static double multiplicacao(double N1, double N2) {
			return N1 * N2;
		}
		public static double divisao(double N1, double N2) {
			return N1 / N2;
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Informe o primeiro numero:");
			double N1 = sc.nextDouble();
			System.out.println("Informe o segundo numero:");
			double N2 = sc.nextDouble();
			sc.close();
			
			double som = soma(N1,N2);
			double sub = subtracao(N1,N2);
			double multi = multiplicacao(N1,N2);
			double div = divisao(N1,N2);
			
			System.out.println("Soma: " + som);
			System.out.println("Subtracao: " + sub);
			System.out.println("Multiplicacao: " + multi);
			System.out.println("Divisao: " + div);
			
			
	

	}

}
