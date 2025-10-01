package sistemadefrete;

public class Carro extends Veiculo implements Fretavel {

    public double calcularCustoFrete(double distanciaEmKm){
        return distanciaEmKm * 1.25;
    }

}