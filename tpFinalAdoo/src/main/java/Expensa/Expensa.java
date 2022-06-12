package Expensa;

import Criterios.criterio;
import Gastos.Gasto;

import java.util.Date;
import java.util.List;


public  class Expensa {

    public Expensa() {
    }



    public Date fecha;

    private List<Gasto> gastos;

    private float total;

    public Criterios.criterio criterio;

    public tipoDeExpensas tipo;

    public Administrador administrador;




    public float obtenerMonto() {
        // TODO implement here
        return 0.0f;
    }


    public void cambiarCriterio(criterio Criterio) {
        // TODO implement here
    }




}