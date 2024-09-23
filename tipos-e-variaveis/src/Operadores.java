public class Operadores {
        public static void main(String[] args)   {
             String nomeCompleto = "LINGUAGEM" + "JAVA";
             System.out.println(nomeCompleto);
            
             int numero = 5;

             //*Repetição */
            
             //*numero=numero+1 ou numero++; */
             
             //x repetição
             //x numero = numero + 1;
             
            //*Adicionar o "++" antes do nome da variavel se for querer que ele incremente e depois imprima */
            //*O mesmo serve para a decrementação, ou seja, vc irá adicioanr o -- DEPOIS do nome da variavel, fazendo com que ele imprima e depois subtraia o valor */
            
             System.out.println( ++ numero );

             System.out.println(numero);

             //* NEGAR EXPRESSÕES BOOLEANAS */

             boolean variavel = true;

            variavel = !variavel;

             System.out.println(variavel);

             //*OPERADOR TERNARIO */
               int a, b;
               a=5;
               b=6;
               String resultado= a==b ? "verdadeiro" : "falso";

               System.out.println(resultado);

               //*OPERADORES RELACIONAIS */
               int numero1= 1;
               int numero2= 2;

               boolean simNao= numero1 == numero2;

               System.out.println("numeroUm é igual a numeroDois?" + simNao);   

               simNao= numero1 != numero2;

               System.out.println("numeroUm é diferente do numeroDois?" + simNao);
            
        }
    } 
    

