public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <=5; numero ++ ){
            if (numero == 3)
            //continue; <-- Em continue o código ia interromper o numero == 3 e continuar a contagem, ao contrario do "break" que quebra o codigo e imprime apenas os numeros < 3.
                break;
                System.out.println(numero);
        } 
    }
    
}
