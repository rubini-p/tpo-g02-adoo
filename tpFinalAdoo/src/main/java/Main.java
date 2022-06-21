
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
        expensa.criterio.divisionDePagos();
        expensa.setCriterio(criterio2);
        expensa.criterio.divisionDePagos();

        System.out.print(expensa.obtenerMonto());
        ControladorExpensas controlador = new ControladorExpensas();

        controlador.agregarGasto(expensa, gasto1);
        controlador.obtenerTotal(expensa);


        Notificador notificador = new Notificador();
        EstrategiaDeNotificacion notificadorSMS = new NotificacionPorSMS(new AdapterSMSTwilio());
        EstrategiaDeNotificacion notificadorWhatsApp = new NotificacionPorWhatsApp(new AdapterWhatsAppTwilio());
        EstrategiaDeNotificacion notificadorEmail = new NotificacionPorEmail(new AdapterEmailJavaEmail());

        Notificacion notificacion = new Notificacion();
        notificacion.setEmailDestinatario("martin@gmail.com");
        notificacion.setEmailRemitente("tomas@gmail.com");
        notificacion.setMensaje("Hola");
        notificacion.setNroDestinatario("1234");
        notificacion.setNroRemitente("9876");

        notificador.setEstrategia(notificadorEmail);

        notificador.enviar(notificacion);
    }
}
