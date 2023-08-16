public class exercicio03 {
    public static void main(String[] args) throws Exception{
        int numero = 0;
		int soma = 0;
		
		while(numero<=50) {
			if(numero % 2==0) {
				numero++;
			}else {
				soma+=numero;
				numero++;
			}
			
		}
		System.out.println(soma);

    }
}
