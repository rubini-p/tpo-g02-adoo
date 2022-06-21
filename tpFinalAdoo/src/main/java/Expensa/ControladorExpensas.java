package Expensa;

import Criterios.Criterio;
import Gastos.Gasto;

import java.util.List;

public class ControladorExpensas {

    public void cambiarCriterio(Expensa expensa, Criterio nuevoCriterio){
        expensa.setCriterio(nuevoCriterio);
    }

    public void agregarGasto(Expensa expensa, Gasto nuevoGasto){
        expensa.agregarGasto(nuevoGasto);
    }

    public float obtenerTotal(List<Expensa> expensas){
        float sum=0;
        for (final Expensa expensa : expensas) {
            sum = sum + expensa.obtenerMonto();
        }
        return sum;
    }
}


