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

    public void expensasPorUnidad(Consorcio consorcio){
        int TamañoTotal= 0;
        float montoToal=0;

        for (final Expensa expensa : consorcio.getExpensas()) {
            montoToal = montoToal + expensa.obtenerMonto();
        }
        for (final UnidadFuncional unidades : consorcio.getUnidadesFuncionales()) {
            TamañoTotal = TamañoTotal + unidades.getTamaño();
        }

        float montoPUnidad= 0;

        for (final UnidadFuncional unidad : consorcio.getUnidadesFuncionales()) {
            System.out.println(consorcio.calcularGastosUnidad(montoToal,TamañoTotal,unidad)+"de :"+ montoToal);

        }
    }
}