package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
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
