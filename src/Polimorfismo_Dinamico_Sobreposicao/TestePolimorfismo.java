package Polimorfismo_Dinamico_Sobreposicao;

public class TestePolimorfismo extends Animal{
	public static void main(String[] args) {
		Animal primeiro = new Cachorro();
		Animal segundo = new Gato();
		
		primeiro.fazerSom();
		segundo.fazerSom();
		}
	}
