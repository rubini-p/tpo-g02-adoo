
import Criterios.Criterio;
import Criterios.PagoCompletoGenerarFFR;
import Criterios.pagoCompleto;
import Expensa.Expensa;
import Expensa.TipoDeExpensas;
import Expensa.Administrador;
import Expensa.ControladorExpensas;
import Gastos.Gasto;

import java.util.ArrayList;
import java.util.Date;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Date date = new Date();
        Gasto gasto1 = new Gasto((float)1998,date, false);
        Gasto gasto2 = new Gasto((float)1990,date, false);

        List<Gasto> gastos = new ArrayList<Gasto>();
        gastos.add(gasto1);
        gastos.add(gasto2);
        Administrador admin = new Administrador();

        Criterio critero = new pagoCompleto();
        Criterio criterio2 = new PagoCompletoGenerarFFR();

        Expensa expensa = new Expensa(date, gastos, TipoDeExpensas.ORDINARIAS);
        Expensa expensa2 = new Expensa(date, gastos, TipoDeExpensas.EXTRAORDINARIAS);




        System.out.println(expensa.obtenerMonto());
        ControladorExpensas controlador = new ControladorExpensas();
        List<Expensa> expensasLista= new ArrayList();
        expensasLista.add(expensa2);
        expensasLista.add(expensa);




    }
}
