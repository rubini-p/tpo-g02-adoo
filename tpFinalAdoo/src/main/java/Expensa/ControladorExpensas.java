package Expensa;

import Criterios.Criterio;
import Gastos.Gasto;

import java.util.List;

public class ControladorExpensas {


    public void agregarGastos(Expensa expensa, List<Gasto> gastos){

        for (final Gasto gasto : gastos) {
            if (expensa.getFecha().getMonth()==gasto.getFecha().getMonth()|| gasto.isRecurrente()==true){
                expensa.agregarGasto(gasto);
            }
        }
    }

    public float obtenerTotal(Expensa expensa){
        float sum=0;
        for (final Gasto gasto : expensa.getGastos()) {
            sum = sum + gasto.getMonto();
        }
        return sum;
    }
}


