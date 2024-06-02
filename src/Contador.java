import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		try 
		{
		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro:");
		int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro:");
		int parametroDois = terminal.nextInt();

		
			Contar(parametroUm, parametroDois);		
		}			
		catch (Exception ParametrosInvalidosException)
		{
			System.out.println("Falha ao realizar a contagem, verifique os parâmetros informados.");
		}
	}


	private static void Contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {				
			if (parametroUm < parametroDois) {
			int contagem = parametroDois - parametroUm;
			//realizar o for para imprimir os números com base na variável contagem
			for(int i = 1; i <= contagem; i++)
			{
				System.out.println("Imprimindo o número " + i);
			}
			}else
			{
				throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!") ;
			}
	}
}

