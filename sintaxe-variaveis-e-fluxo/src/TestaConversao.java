
public class TestaConversao {

	public static void main(String[] args) {
		//double é 64 bits
		double salario = 1270.50;
		//float é 32 bits
		float pontoFlutuante = 3.14f;		
		//int até 32bits
		int valor = (int) salario;
		
		System.out.println(valor);
		//long 64bits
		long numeroGrande = 231823761237167L;
		//short 16 bits
		short valorPequeno = 3254;
		//byte é até 127
		byte b = 127;
	}

}
