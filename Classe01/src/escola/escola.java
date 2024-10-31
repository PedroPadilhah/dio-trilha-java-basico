package escola;

public class escola {
    public static void main(String[] args) {
        
        aluno felipe = new aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(18);

        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos");

    }
}
