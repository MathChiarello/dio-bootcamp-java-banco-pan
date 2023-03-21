package dio.digitalinnovation;

public class Saudacao {

    // private int horaDoDia;

    public String saudacao(int hora) {
        if (hora >= 0 && hora <= 12) {
            return "Bom dia!";
        } else if (hora > 12 && hora <= 18) {
            return "Bom tarde!";
        } else if (hora > 18 && hora <= 24) {
            return "Bom noite!";
        }
        return "Horário incorreto!";
    }

    
    /*
    public int getHoraDoDia() {
        return horaDoDia;
    }

    public int setHoraDoDia(int hora) {
        this.horaDoDia = hora;
        return this.horaDoDia;
        
    } 
    */  
}
