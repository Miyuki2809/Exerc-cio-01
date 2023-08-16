public class exercicio02 {
    public static void main(String[] args) throws Exception{
        int soma = 0;
		int contador = 0;
		
		while(contador<50) {
			contador+=1;
			if(contador % 2==0) {
				soma = soma+contador;
				
				
			}
			
			
			
		}
		System.out.println("A soma dos 50 primeiros numeros pares: "+soma);
	}
}

