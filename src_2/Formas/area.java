package Formas;

public class area {
	public static void main(String[] args) {
		Retangulo mini = new Retangulo();
		
		mini.setAltura(10.00);
		Double mini_altura = mini.getAltura();
		
		mini.setBase(30.00);
		Double mini_base = mini.getBase();
		
		mini.setArea();
		Double mini_area = mini.getArea();
		
		mini.setPerimetro();	
		Double mini_perimetro = mini.getPerimetro();
		
		
		System.out.printf("O retangulo de base: %.2f e altura %.2f.\n"
				+ "Tem perimetro: %.2f, e area %.2f.", mini_base, mini_altura,mini_perimetro, mini_area);
	
	}

}
