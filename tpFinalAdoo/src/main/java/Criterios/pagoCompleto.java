package Criterios;

import UnidadFuncional.UnidadFuncional;

/**
 * 
 */
public class pagoCompleto extends Criterio {

    @Override
    public float divisionDeExpensas(UnidadFuncional uf, float gastosTotales, float participacion) {

        return (float) ( ((gastosTotales * participacion) / 100) * 0);
    }
}