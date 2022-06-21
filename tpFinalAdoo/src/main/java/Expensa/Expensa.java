package Expensa;

import Criterios.Criterio;
import Gastos.Gasto;

import java.util.Date;
import java.util.List;


public  class Expensa {


    public Expensa(Date fecha, List<Gasto> gastos, Criterio criterio, TipoDeExpensas tipo, Administrador administrador) {
        this.fecha = fecha;
        this.gastos = gastos;
        this.total = obtenerMonto();
        this.criterio = criterio;
        this.tipo = tipo;
        this.administrador = administrador;
    }

    public Date fecha;

    private List<Gasto> gastos;

    private float total;

    public Criterio criterio;

    public TipoDeExpensas tipo;

    public Administrador administrador;

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

    public Criterio getCriterio() {
        return criterio;
    }

    public void setCriterio(Criterio criterio) {
        this.criterio = criterio;
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