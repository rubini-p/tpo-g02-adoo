package Consorcio;
import Expensa.Expensa;
import UnidadFuncional.UnidadFuncional;

public class ControladorConsorcio {

    public Administrador administrador;

    public void agregarExpensas(Consorcio c, Expensa expensa) {
        c.agregarExpensa(expensa);
    }

    public void agregarUnidadFuncional(Consorcio c, UnidadFuncional uf) {
        c.agregarUnidadFuncional(uf);
    }

    public void agregarCuentaBancaria(AdapterCuentaBancaria CuentaBancaria) {

    }
}