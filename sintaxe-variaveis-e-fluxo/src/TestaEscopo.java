
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado;

		if (quantidadePessoas >= 2) {
			// n existe
			// tb n
			acompanhado = true;
			// aqui sim mas só até as chaves

		} else {

			// n existe
			acompanhado = false;
			// aqui sim mas só até as chaves
		}

		System.out.println("Acompanhado?  " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("você tem mais de 18 anos");
			System.out.println("Seja bem-vindo");
		} else {
			System.out.println("infelizmente você não pode entrar");

		}

	}
}
