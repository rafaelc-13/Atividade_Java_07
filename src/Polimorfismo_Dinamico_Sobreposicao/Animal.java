package Polimorfismo_Dinamico_Sobreposicao;

public class Animal {
	public void fazerSom() {
		System.out.println("Som de um animal");
	}
}

class Cachorro extends Animal{
	public void fazerSom() {
		System.out.println("Latido do cachorro.");
	}
}
class Gato extends Animal{
	public void fazerSom() {
		System.out.println("Miado do gato.");
	}
}
