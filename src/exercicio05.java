import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) throws Exception{
        Scanner leitor = new Scanner(System.in);
		int opcao=0;
		
		while (opcao!=4) {
			System.out.println("\n Opção: \n1 - Sacar \n2 - Depositar \n3 - Verificar saldo \n4 - Sair");
			opcao = Integer.parseInt(leitor.nextLine());
			
			switch (opcao) {
			case 1:
				System.out.println("Você escolheu a opção de sacar");
				break;
			case 2:
				System.out.println("Você escolheu a opção de depositar");
				break;
			case 3:
				System.out.println("Você escolheu a opção de verificar saldo");
				break;
			case 4:
				System.out.println("Você escolheu a opção de sair");
				break;
			default:
				System.out.println("Opção inválida, escolha outra opção");
				break;
			}
            
		}
        leitor.close();

    }
}
