public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T"; //M /T
        switch (plano) {
            case "T":
                System.out.println("5gb e Youtube");
            case "M":
                System.out.println("WhatsApp e Instagram free"); 
            case "B":
                System.out.println("100 minutos de ligação");
        }
    }
    
}
