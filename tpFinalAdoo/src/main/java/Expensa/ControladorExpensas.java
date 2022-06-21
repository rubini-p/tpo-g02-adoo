package Expensa;

import Criterios.Criterio;
import Gastos.Gasto;

public class ControladorExpensas {

    public void cambiarCriterio(Expensa expensa, Criterio nuevoCriterio){
        expensa.setCriterio(nuevoCriterio);
    }

    public void agregarGasto(Expensa expensa, Gasto nuevoGasto){
        expensa.agregarGasto(nuevoGasto);
    }

    public void obtenerTotal(Expensa expensa){
        System.out.print(expensa.obtenerMonto());
    }

}
