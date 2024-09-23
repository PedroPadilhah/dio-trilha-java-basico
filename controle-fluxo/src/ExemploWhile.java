
import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        
        while (mesada > 0) {
            double valorTwix = valorAleatorio();

            if( valorTwix > mesada){
                valorTwix = mesada;
            }

            System.out.println("Doce do valor: " + valorTwix + " adicionado no carrinho ");
            mesada = mesada - valorTwix;
            
        }

        System.out.println("Mesada:" + mesada);
        System.out.println("Elize gastou todo seu dinheiro em Twix");
    }
        private static double valorAleatorio(){
            return ThreadLocalRandom.current().nextDouble(2, 8);
        }
}
