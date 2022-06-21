package Consorcio;

import Expensa.Expensa;
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

    public List<UnidadFuncional> getUnidadesFuncionales() {
        return unidadesFuncionales;
    }

    public CuentaCorriente getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaCorriente cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public List<Expensa> getExpensas() {
        return expensas;
    }

    public void agregarExpensa(Expensa expensa) {
        this.expensas.add(expensa);
    }

    public void agregarUnidadFuncional(UnidadFuncional uf) {
        this.unidadesFuncionales.add(uf);
    }

    public float calcularGastosUnidad(float totalAPagar, int TamañoTotal,UnidadFuncional unidadFuncional) {
        int porcentaje = unidadFuncional.obtenerPorcentaje(TamañoTotal);
        float montoAPagar = (porcentaje*totalAPagar)/100;
        return montoAPagar=montoAPagar +unidadFuncional.getDeuda();
    }
}
