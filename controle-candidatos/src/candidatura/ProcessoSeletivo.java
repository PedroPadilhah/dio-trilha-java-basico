package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"PEDRO", "PAULO", "MARIA", "LUCI", "ELIZE"};
        for( String candidato : candidatos){
            entrandoEmContato(candidato);
        }
    }
    
        static void entrandoEmContato(String candidato){
            int tentativasRealizadas=1;
            boolean continuarTentando=true;
            boolean atendeu = false;
            do{
                atendeu = atender();
                continuarTentando= !atendeu;
                if (continuarTentando) 
                    tentativasRealizadas++; 
                else
                    System.out.println("CONTATO REALIZADO COM SUCESSO");
                    
                
            }while(continuarTentando && tentativasRealizadas <3);

            if(atendeu)
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
            else
            System.out.println("Não conseguimos contato com o candidato " + candidato + ", número máximo de " + tentativasRealizadas + " tentaivas.");


        }
        //método auxiliar
        static boolean atender(){
            return new Random().nextInt(3)==1;
        }


        static void imprimirSelecionados(){
        String [] candidatos = {"PEDRO", "PAULO", "MARIA", "LUCI", "ELIZE"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
        for (int indice=0; indice < candidatos.length; indice++){
        System.out.println("O candidato n°" + (indice + 1) + " é o " + candidatos[indice]);
    }
        System.out.println("Forma abrevida sem o indice");
        for(String candidato: candidatos){
            System.out.println("O candidato selecionado para a vaga foi " + candidato);
        }

        

       selecaoCandidatos();
    }
    
        static void selecaoCandidatos(){
            String [] candidatos = {"PEDRO", "PAULO", "MARIA", "LUCI", "ELIZE", "CRISTINA", "RODRIGO", "MATEUS","CAMILA", "MAYARA"};

            int candidatosSelecionados = 0;
            int candidatosAtual = 0;
            double salarioBase = 2000.0;
            while(candidatosSelecionados <5 && candidatosAtual< candidatos.length){
                String candidato = candidatos[candidatosAtual];
                double salarioPretendido = valorPretendido();
                System.out.println("O candidato " + candidato + " soliciotu o valor de " + salarioPretendido);
                if(salarioBase >= salarioPretendido){
                    System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                    candidatosSelecionados++;
                }
                candidatosAtual++;
            }

        }

    static double valorPretendido() { 
        return ThreadLocalRandom.current().nextDouble(1800, 2000);         
    }

    static void analisarCandidato(double salarioPrentendido){
        double salarioBase = 2000.0;
        if (salarioPrentendido > salarioBase){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salarioBase==salarioPrentendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }

        
    }
}
