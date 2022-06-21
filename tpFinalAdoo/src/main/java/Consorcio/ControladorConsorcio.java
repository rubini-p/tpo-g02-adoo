package Consorcio;
import Expensa.Administrador;
import Expensa.Expensa;
import UnidadFuncional.UnidadFuncional;

import java.util.List;


public class ControladorConsorcio {

    public Administrador administrador;

    public void agregarExpensas(Consorcio c, Expensa expensa) {
        c.agregarExpensa(expensa);
    }

    public void agregarUnidadFuncional(Consorcio c, UnidadFuncional uf) {
        c.agregarUnidadFuncional(uf);
    }

    public void agregarCuentaBancaria(CuentaCorriente CuentaBancaria) {

    }

    public void expensasPorUnidad(Consorcio consorcio){
        int TamañoTotal= 0;
        float montoToal=0;

        for (final Expensa expensa : consorcio.expensas) {
            montoToal = montoToal + expensa.obtenerMonto();
        }
        for (final UnidadFuncional unidades : consorcio.unidadesFuncionales) {
            TamañoTotal = TamañoTotal + unidades.getTamaño();
        }

        float montoPUnidad= 0;

        for (final UnidadFuncional unidad : consorcio.unidadesFuncionales) {
            System.out.println(consorcio.calcularGastosUnidad(montoToal,TamañoTotal,unidad)+"de :"+ montoToal);

        }
    }
}