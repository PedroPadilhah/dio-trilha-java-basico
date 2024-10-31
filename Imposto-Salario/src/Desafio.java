import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) throws Exception {
        //Lê os valores de entrada
        Scanner leitorDeEntradas= new Scanner(System.in);
        float valorSalario= leitorDeEntradas.nextFloat();
        float valorBeneficios = leitorDeEntradas.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1500.00){
            //Adicionando o valor de imposto de acordo com o valor do salário
            valorImposto = 0.05F * valorSalario;

        } else if (valorSalario>= 1500.01 && valorSalario <=2500.00){
            valorImposto = 0.10F*valorSalario;

        } else{
            valorImposto = 0.15F*valorSalario;  
        }
        leitorDeEntradas.close();

        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));
    }
    
}
