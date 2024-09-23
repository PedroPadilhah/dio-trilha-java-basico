public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try{
        String cepFormatado = formatarCep("81650040");

        System.out.println(cepFormatado);

        }   catch(CepInvalidoException e){
            System.out.println("O CEP não obedece as leis de negócio");
        }
        
    }
    static  String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8 ) 
        throw new CepInvalidoException();

        //simulando cep formatado
        return "81.650-040";
            
        
    } 
}
