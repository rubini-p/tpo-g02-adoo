package Expensa;

import Criterios.Criterio;
import Criterios.PagoCompletoGenerarFFR;
import Criterios.pagoCompleto;
import Gastos.Gasto;
import Gastos.Normales;
import Gastos.Recurrentes;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExpensaTest {

    @Test
    void setGastos() {
        Date date = new Date();
        Gasto gasto1 = new Recurrentes((float)1998, date,30);

        List<Gasto> gastos = new ArrayList<Gasto>();
        Administrador admin = new Administrador();
        Criterio critero = new pagoCompleto();

        Expensa expensa = new Expensa(date, gastos,critero, TipoDeExpensas.ORDINARIAS,admin);
        try{
            expensa.agregarGasto(gasto1);
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    @Test
    void setCriterio() {

        Expensa expensa = new Expensa(new Date(), new ArrayList<Gasto>(),new pagoCompleto(), TipoDeExpensas.ORDINARIAS,new Administrador());
        try{
            expensa.setCriterio(new PagoCompletoGenerarFFR());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    void obtenerMonto() {

        Gasto gasto1 = new Recurrentes((float)1998, new Date(),30);
        Gasto gasto2 = new Recurrentes((float)10, new Date(),30);
        Gasto gasto3 = new Recurrentes((float)1000, new Date(),30);
        List<Gasto> gastos = new ArrayList<Gasto>();

        gastos.add(gasto1);
        gastos.add(gasto2);
        gastos.add(gasto3);

        Expensa expensa = new Expensa(new Date(), gastos,new pagoCompleto(), TipoDeExpensas.ORDINARIAS,new Administrador());
        try{
            expensa.obtenerMonto();
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    @Test
    void agregarGasto() {
        Gasto gasto1 = new Recurrentes((float)1998, new Date(),30);
        Expensa expensa = new Expensa(new Date(), new ArrayList<Gasto>(),new pagoCompleto(), TipoDeExpensas.ORDINARIAS,new Administrador());
        try{
            expensa.agregarGasto(gasto1);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}