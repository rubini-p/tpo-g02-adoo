package Expensa;

import Criterios.Criterio;
import Gastos.Gasto;

import java.util.Date;
import java.util.List;


public  class Expensa {


    public Expensa(Date fecha, List<Gasto> gastos, float total, Criterio criterio, tipoDeExpensas tipo, Administrador administrador) {
        this.fecha = fecha;
        this.gastos = gastos;
        this.total = total;
        this.criterio = criterio;
        this.tipo = tipo;
        this.administrador = administrador;
    }

    public Date fecha;

    private List<Gasto> gastos;

    private float total;

    public Criterio criterio;

    public tipoDeExpensas tipo;

    public Administrador administrador;




    public float obtenerMonto() {
        // TODO implement here
        return 0.0f;
    }


    public void cambiarCriterio(Criterio Criterio) {
        // TODO implement here
    }




}