package Expensa;

import Gastos.Gasto;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ControladorExpensasTest {

    @Test
    void agregarGastos() {

        Gasto gasto1=new Gasto((float)1000.1, new Date(),false);
        Gasto gasto2=new Gasto((float)10.0, new Date(),false);
        Gasto gasto3=new Gasto((float)1000.1, new Date(),true);
        List<Gasto> gastos= new ArrayList<>();

        gastos.add(gasto1);
        gastos.add(gasto2);
        gastos.add(gasto3);

        Expensa expensa = new Expensa(new Date(), new ArrayList<>(),TipoDeExpensas.ORDINARIAS);

        ControladorExpensas controlador = new ControladorExpensas();
        try {
            controlador.agregarGastos(expensa,gastos);

        }catch (Exception e){
            e.printStackTrace();
        }

     }

    @Test
    void obtenerTotal() {
        Gasto gasto1=new Gasto((float)1000.1, new Date(),false);
        Gasto gasto2=new Gasto((float)10.0, new Date(),true);
        Gasto gasto3=new Gasto((float)1000.1, new Date(),true);
        List<Gasto> gastos= new ArrayList<>();

        gastos.add(gasto1);
        gastos.add(gasto2);
        gastos.add(gasto3);

        Expensa expensa = new Expensa(new Date(), new ArrayList<>(),TipoDeExpensas.ORDINARIAS);

        ControladorExpensas controlador = new ControladorExpensas();
        controlador.agregarGastos(expensa,gastos);
        try {
            System.out.print(controlador.obtenerTotal(expensa));

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}