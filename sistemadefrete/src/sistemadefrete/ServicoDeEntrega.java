package sistemadefrete;

import java.util.ArrayList;
import java.util.List;

public class ServicoDeEntrega {
    List<Fretavel> lista = new ArrayList<Fretavel>();

    public void append(Fretavel fretavel) {
        lista.add(fretavel);
    }

    public double CalcularCustoTotal(double distanciaEmKm) {
        double total = 0;
        for (int i = 0; i < lista.size(); i++) {
            total += lista.get(i).calcularCustoFrete(distanciaEmKm);
        }

        return total;
    }

    public void clear () {
        lista.clear();
    }
}