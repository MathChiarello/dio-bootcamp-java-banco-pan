
/**
 * <h1>SmartTv</h1>
 * <p>Esta é uma classe que demonstra atributos e ações de uma Televisão</p>
 * @author Matheus Chiarello
 * @version 1.0
 * @since 28/02/2022
 */
public class SmartTv {

    boolean OnOff = false;
    int canal = 1;
    int volume = 25;

    /**
     * Método que demonstrar a ações de ligar uma televisão
     * @return Informa se a TV está ligada ou não com a palavra "ON"
     */
    public String ligar() {
        OnOff = true;
        return "ON";
    }

    public String desligar() {
        OnOff = false;
        return "OFF";
    }
    
    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    /**
     * Método que demonstrar a ações de mudar o canal de uma televisão
     * @param canal Número (inteiro) do canal a ser alterado
     */
    public void alterarCanal(int canal) {
        canal = this.canal;
    }
    
}