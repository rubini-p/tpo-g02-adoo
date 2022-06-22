package Expensa;

import Criterios.PagoCompletoGenerarFFR;
import Criterios.pagoCompleto;
import Gastos.Gasto;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class ExpensaTest {



    @Test
    void obtenerMontoTotal() {

        Gasto gasto1 = new Gasto((float)1998, new Date(),false);
        Gasto gasto2 = new Gasto((float)10, new Date(),false);
        Gasto gasto3 = new Gasto((float)1000, new Date(),false);
        List<Gasto> gastos = new ArrayList<Gasto>();

        gastos.add(gasto1);
        gastos.add(gasto2);
        gastos.add(gasto3);

        Expensa expensa = new Expensa(new Date(), gastos, TipoDeExpensas.ORDINARIAS);
        try{
            expensa.obtenerMonto();
            System.out.print(expensa.obtenerMonto());

        }catch (Exception e){
            e.printStackTrace();
        }


    }

    @Test
    void agregarGasto() {
        Gasto gasto1 = new Gasto((float)1998, new Date(),false);
        Expensa expensa = new Expensa(new Date(), new ArrayList<Gasto>(),TipoDeExpensas.ORDINARIAS);
        try{
            expensa.agregarGasto(gasto1);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}