package Expensa;

import Criterios.Criterio;
import Gastos.Gasto;

import java.util.Date;
import java.util.List;


public  class Expensa {


    public Expensa(Date fecha, List<Gasto> gastos,  TipoDeExpensas tipo) {
        this.fecha = fecha;
        this.gastos = gastos;
        this.total = obtenerMonto();
        this.tipo = tipo;
    }

    public Date fecha;

    private List<Gasto> gastos;

    private float total;

    public TipoDeExpensas tipo;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Gasto> getGastos() {
        return gastos;
    }

    public void setGastos(List<Gasto> gastos) {
        this.gastos = gastos;
    }

    public float obtenerMonto() {
        float sum=0;
        for (final Gasto gasto : this.gastos) {
            sum = sum + gasto.getMonto();
        }
        return sum;
    }

    public void agregarGasto(Gasto gasto){
        gastos.add(gasto);
    }





}