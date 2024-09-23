public class ExemploForArray {
    public static void main(String[] args) {
        
        String alunos [] = {"Elize", "Cristina", "Almeida", "Portes"};
        //MANEIRA ABREVIADA
        for(String aluno : alunos){
          System.out.println("O nome do aluno é: " + aluno);
        }

        //MANEIRA NÃO ABREVIADA

       /*for (int x=0; x < alunos.length; x ++){
           System.out.println("O aluno no indice x=" + x + " é " + alunos [ x ]) ;
        }*/

        

    }
    
}
