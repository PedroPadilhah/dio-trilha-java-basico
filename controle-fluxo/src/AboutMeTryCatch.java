import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

class AboutMeTryCatch {
    public static void main(String[] args) {
    try{
        //CRIANDO O OBJETO SCANNER
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        //Imprimindo as informações para nosso usuário...

        System.out.println( "Olá, me chamo" + nome.toUpperCase() + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm");
        scanner.close();
      }
      catch (InputMismatchException e){
        System.err.println("Os campos idade e altura devem ser representados por números e por pontos");
        
      }
    }

    }

