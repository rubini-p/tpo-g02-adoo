package Consorcio;

import Expensa.Expensa;
import Notificaciones.Notificador;
import UnidadFuncional.UnidadFuncional;

import java.util.List;

/**
 * 
 */
public class Consorcio {

    private List<UnidadFuncional> unidadesFuncionales;
    private AdapterCuentaBancaria cuentaBancaria;
    private List<Expensa> expensas;
    private String nroCuenta;
    private Administrador administrador;
    private Notificador notificador;

    public Consorcio(List<UnidadFuncional> unidadesFuncionales, List<Expensa> expensas) {
        this.unidadesFuncionales = unidadesFuncionales;
        this.expensas = expensas;
    }

    public List<UnidadFuncional> getUnidadesFuncionales() {
        return unidadesFuncionales;
    }

    public AdapterCuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(AdapterCuentaBancaria cuentaBancaria) {
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

    public float obtenerSaldo() {
        return cuentaBancaria.obtenerSaldo(this.nroCuenta);
    }
}
