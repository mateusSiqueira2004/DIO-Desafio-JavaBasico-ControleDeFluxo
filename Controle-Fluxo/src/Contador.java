import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
		try {
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt();
			try {
				contar(parametroUm, parametroDois);
				
			}catch (ParametrosInvalidosException ex) {
				
				System.out.println("O segundo parâmetro deve ser maior que o primeiro");
			}
		} catch (Exception e) {
			System.out.println("Digite um numero inteiro");
		}
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
		int contagem = parametroDois - parametroUm;

        for (int contagens = 1; contagens <= contagem; contagens ++) {
            System.out.println(contagens);
        }
    }
}
