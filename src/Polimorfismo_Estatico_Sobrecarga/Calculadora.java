package Polimorfismo_Estatico_Sobrecarga;

public class Calculadora {
	public int somar(int a,int b) {
		return a + b;
	}
	public int somar(int a ,int b ,int c) {
		return a + b + c;
	}
	public double somar(double a, double b) {
		return a + b;
	}
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		int resultado1 = calculadora.somar(5, 6);
			System.out.println("A soma entre 5 e 6 eh "+ resultado1);
			
		int resultado2 = calculadora.somar(7, 8, 9);
			System.out.println("A soma entre 7, 8 e 9 eh "+ resultado2);
			
		double resultado3 = calculadora.somar(2.5, 7.5);
			System.out.println("A soma das notas (2,5 e 7,5) eh "+ resultado3);
	}
}
