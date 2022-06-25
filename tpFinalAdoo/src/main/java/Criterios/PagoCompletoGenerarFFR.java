package Criterios;

import UnidadFuncional.UnidadFuncional;

/**
 * 
 */
public class PagoCompletoGenerarFFR extends Criterio {

    @Override
    public float divisionDeExpensas(UnidadFuncional uf, float gastosTotales, float participacion) {
        return (float) ( ((gastosTotales * participacion) / 100) * 1.2);
    }
}