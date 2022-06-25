package Criterios;

import UnidadFuncional.UnidadFuncional;

/**
 * 
 */
public class PagoConFR extends Criterio {


    @Override
    public float divisionDeExpensas(UnidadFuncional uf, float gastosTotales, float participacion) {
        gastosTotales =- this.getSaldo();
        return (float) (gastosTotales * participacion) / 100 ;
    }
}