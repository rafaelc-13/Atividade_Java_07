package Animais_de_Estimacao;

public class Meus_animais {
	public static void main(String[] args) {
		
	
	Animais gatao = new Animais();
		
	gatao.setNome("Michelangelo");
	String Nome_1 = gatao.getNome();
	gatao.setTipo("Gato");	
	String Tipo_1 = gatao.getTipo();
	gatao.setIdade(2);
	int Idade_1 = gatao.getIdade();
	
	System.out.println("O perfil do seu pet eh:");
	System.out.printf("Nome: %s \nTipo: %s \nIdade: %d" , Nome_1,Tipo_1,Idade_1);
	
	
	
	
	
	
	
	
	}
}
