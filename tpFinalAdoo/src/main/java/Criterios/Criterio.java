package Criterios;

import Consorcio.AdapterCuentaBancaria;
import Consorcio.Consorcio;
import Expensa.Expensa;
import Gastos.Gasto;
import UnidadFuncional.UnidadFuncional;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * 
 */
public abstract class Criterio {

    private float saldo ;
    public void setSaldo(@NotNull AdapterCuentaBancaria cuenta, String nroCuenta) {
        this.saldo = cuenta.obtenerSaldo(nroCuenta);
    }
    public float getSaldo() {
        return this.saldo;
    }
// pasarle expensas en vez de gastos
    public float calculoDeGastos(Expensa expensa) {
        List<Gasto> gastos = expensa.getGastos();
        float montoTotal = 0.0f ;
        int mesCorriente = LocalDate.now().getMonthValue();

        for ( Gasto g : gastos ) {
            if (mesCorriente == g.getFecha().getMonth()) {
//              si es gasto del mes sumo
                montoTotal += g.getMonto() ;
            } else {
//                si es recurrente sumo
                if (g.isRecurrente()) {
                    montoTotal += g.getMonto() ;
                }
            }
        }
        return montoTotal;
    }

    public abstract float divisionDeExpensas(UnidadFuncional uf, float gastosTotales, float participacion);

}