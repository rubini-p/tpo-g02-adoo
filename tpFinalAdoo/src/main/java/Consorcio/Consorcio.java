package Consorcio;

import Expensa.Expensa;
import Gastos.Gasto;
import UnidadFuncional.UnidadFuncional;

import java.util.List;

/**
 * 
 */
public class Consorcio {


    public Consorcio(List<UnidadFuncional> unidadesFuncionales, CuentaCorriente cuentaBancaria, List<Expensa> expensas) {
        this.unidadesFuncionales = unidadesFuncionales;
        this.cuentaBancaria = cuentaBancaria;
        this.expensas = expensas;
    }

    public List<UnidadFuncional> unidadesFuncionales;

    public CuentaCorriente cuentaBancaria;

    public List<Expensa> expensas;

    public void obtenerExpensas(UnidadFuncional unidades, Gasto gastos) {
        // TODO implement here
    }

}