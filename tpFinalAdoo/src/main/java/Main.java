
import Criterios.Criterio;
import Criterios.PagoCompletoGenerarFFR;
import Criterios.pagoCompleto;
import Expensa.Expensa;
import Expensa.TipoDeExpensas;
import Expensa.LoginAdapter;
import Expensa.Administrador;
import Gastos.Gasto;
import Gastos.Normales;
import Gastos.Recurrentes;
import Notificacion.TipoDeNotificacion;


import java.awt.*;
import java.util.ArrayList;
import java.util.Date;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Date date = new Date();
        Gasto gasto1 = new Recurrentes((float)1998, date,30);
        Gasto gasto2 = new Normales((float)1990,date);

        List<Gasto> gastos = new ArrayList<Gasto>();
        gastos.add(gasto1);
        gastos.add(gasto2);
        Administrador admin = new Administrador();

        Criterio critero = new pagoCompleto();
        Criterio criterio2 = new PagoCompletoGenerarFFR();

        Expensa expensa = new Expensa(date, gastos,critero, TipoDeExpensas.ORDINARIAS,admin);
        expensa.criterio.divisionDePagos();
        expensa.setCriterio(criterio2);
        expensa.criterio.divisionDePagos();

        System.out.print(expensa.obtenerMonto());



    }
}
