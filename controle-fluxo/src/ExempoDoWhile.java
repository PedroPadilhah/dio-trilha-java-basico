import java.util.Random;
public class ExempoDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando...");
        }while(tocando());

        System.out.println("Alô!!");
        
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        //Negando o ato de continuar tocando
        return ! atendeu;
    }
}