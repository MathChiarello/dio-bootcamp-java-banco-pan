/**
 * Classe para testar a minha classe SmartTV
 */
public class Usuario {

    public static void main(String[] args) {
        
        SmartTv smartTV = new SmartTv();

        System.out.println("Estado: " + smartTV.OnOff);
        System.out.println("Canal: " + smartTV.canal);
        System.out.println("Volume: " + smartTV.volume);

        smartTV.ligar();
        smartTV.alterarCanal(13);
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();

        System.out.println("----------- ALTERAÇÃO -----------");

        System.out.println("Estado: " + smartTV.OnOff);
        System.out.println("Canal: " + smartTV.canal);
        System.out.println("Volume: " + smartTV.volume);
        

    }

    
    
}