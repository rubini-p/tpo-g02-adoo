package Consorcio;

import Criterios.Criterio;
import Expensa.Expensa;
import Notificaciones.Notificador;
import UnidadFuncional.UnidadFuncional;
import UnidadFuncional.Pago;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Consorcio {

    private List<UnidadFuncional> unidadesFuncionales;
    private AdapterCuentaBancaria cuentaBancaria;
    private List<Expensa> expensas;
    private String nroCuenta;
    private Administrador administrador;
    private Notificador notificador;
    private int tamanoTotal = 200 ;
    private Criterio criterio ;

    public Consorcio(List<UnidadFuncional> unidadesFuncionales, List<Expensa> expensas, Criterio criterio) {
        this.unidadesFuncionales = unidadesFuncionales;
        this.expensas = expensas;
        this.criterio = criterio ;
    }

//    public void expensasPorUnidad(ArrayList<Expensa> expensas , ArrayList<UnidadFuncional> unidadesFuncionales){
//        int TamañoTotal= 0;
//        float montoToal=0;
//
//        for (final Expensa expensa : expensas) {
//            montoToal = montoToal + expensa.obtenerMonto();
//        }
//
//        float montoPUnidad= 0;
//
//        for (final UnidadFuncional unidad : unidadesFuncionales) {
////            System.out.println(consorcio.calcularGastosUnidad(montoToal,TamañoTotal,unidad)+"de :"+ montoToal);
//
//        }
//    }


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
        float porcentaje = unidadFuncional.obtenerPorcentaje(TamañoTotal);
        float montoAPagar = (porcentaje*totalAPagar)/100;
        return montoAPagar=montoAPagar +unidadFuncional.getDeuda();
    }

    public float obtenerSaldo() {
        return cuentaBancaria.obtenerSaldo(this.nroCuenta);
    }



    public void liquidarExpensas(UnidadFuncional uf) {
        float participacion = uf.obtenerPorcentaje(tamanoTotal) ;
        float gastosTotales = 0f;
        for ( Expensa e: expensas) {
            int mesExpensa = e.getFecha().getMonth() ;
            if ( new Date().getMonth() == e.getFecha().getMonth()) {
                gastosTotales = criterio.calculoDeGastos(e) ;
            }
        }
        float montoExpensaUF = criterio.divisionDeExpensas(uf, gastosTotales, participacion) ;
        if (montoExpensaUF < 0) {
            montoExpensaUF = 0 ;
        }
        Pago factura = new Pago(new Date(), montoExpensaUF);
        uf.agregarFactura(factura);
    }
}
