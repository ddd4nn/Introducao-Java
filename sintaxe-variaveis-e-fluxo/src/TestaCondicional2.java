
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("Acompanhado?  " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("você tem mais de 18 anos");
			System.out.println("Seja bem-vindo");
		} else {
			System.out.println("infelizmente você não pode entrar");

		}
		
		
		
	}
}
