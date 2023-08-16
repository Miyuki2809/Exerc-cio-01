import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) throws Exception{
        Scanner leitor = new Scanner(System.in);
		int numero;
		int resultado=1;
		do {
			System.out.println("Informe numeros entre 2 e 5: ");
			numero = leitor.nextInt();
			if((numero <= 2) || (numero >= 5))
			{
				System.out.println("esse numero nao pode");
			}
			
		}while ((numero<2)||(numero>5));
		
		while (numero!=0) {
				resultado *=numero;
				numero--;
		}
		
		System.out.println(resultado);
        leitor.close();
    }
}
