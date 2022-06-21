package Notificaciones;

import Notificaciones.estrategias.EstrategiaDeNotificacion;
import Notificaciones.estrategias.NotificacionPorEmail;
import Notificaciones.estrategias.NotificacionPorSMS;
import Notificaciones.estrategias.NotificacionPorWhatsApp;
import Notificaciones.estrategias.adapters.email.AdapterEmailJavaEmail;
import Notificaciones.estrategias.adapters.sms.AdapterSMSTwilio;
import Notificaciones.estrategias.adapters.whatsapp.AdapterWhatsAppTwilio;
import org.junit.jupiter.api.Test;

import org.junit.platform.commons.function.Try;

import static org.junit.jupiter.api.Assertions.*;

class NotificadorTest {

    @Test
    void enviar() {
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
        try {
            notificador.enviar(notificacion);
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    @Test
    void cambiarEstrategia() {
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
        try {
           notificador.setEstrategia(notificadorWhatsApp);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}