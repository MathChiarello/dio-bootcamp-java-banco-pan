public class EX8_Consoantes {
    
    public static void main(String[] args) {
        
        String[] vetor = { "a", "b", "c", "d", "e" };
        String[] vogais = { "a", "e", "i", "o", "u" };
        int consoante = 0;
        int vogal = 0;
        
        for (int i = 0; i < vetor.length; i++) {
            if (
                    vetor[i].equalsIgnoreCase("a") ||
                    vetor[i].equalsIgnoreCase("e") ||
                    vetor[i].equalsIgnoreCase("i") ||
                    vetor[i].equalsIgnoreCase("o") ||
                    vetor[i].equalsIgnoreCase("u")
            ) {
                vogal++;
            } else {
                consoante++;
            }
        }
        
        System.out.println("Consoantes no Vetor: " + consoante);
        System.out.println("Vogais no Vetor: " + vogal);
        

    }
}
