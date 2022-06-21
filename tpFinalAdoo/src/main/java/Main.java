
import Criterios.Criterio;
import Criterios.PagoCompletoGenerarFFR;
import Criterios.pagoCompleto;
import Expensa.Expensa;
import Expensa.TipoDeExpensas;
import Expensa.LoginAdapter;
import Expensa.Administrador;
import Expensa.ControladorExpensas;
import Gastos.Gasto;
import Gastos.Normales;
import Gastos.Recurrentes;

import Notificaciones.Notificacion;
import Notificaciones.Notificador;
import Notificaciones.estrategias.EstrategiaDeNotificacion;
import Notificaciones.estrategias.NotificacionPorEmail;
import Notificaciones.estrategias.NotificacionPorSMS;
import Notificaciones.estrategias.NotificacionPorWhatsApp;
import Notificaciones.estrategias.adapters.email.AdapterEmailJavaEmail;
import Notificaciones.estrategias.adapters.sms.AdapterSMSTwilio;
import Notificaciones.estrategias.adapters.whatsapp.AdapterWhatsAppTwilio;

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
        Expensa expensa2 = new Expensa(date, gastos,critero, TipoDeExpensas.EXTRAORDINARIAS,admin);
        expensa.criterio.divisionDePagos();
        expensa.setCriterio(criterio2);
        expensa.criterio.divisionDePagos();

        System.out.println(expensa.obtenerMonto());
        ControladorExpensas controlador = new ControladorExpensas();
        List<Expensa> expensasLista= new ArrayList();
        expensasLista.add(expensa2);
        expensasLista.add(expensa);

        controlador.agregarGasto(expensa, gasto1);
        controlador.obtenerTotal(expensasLista);
        System.out.println(controlador.obtenerTotal(expensasLista));

    }
}
