import Notificaciones.Notificacion;
import Notificaciones.Notificador;
import Notificaciones.estrategias.EstrategiaDeNotificacion;
import Notificaciones.estrategias.NotificacionPorEmail;
import Notificaciones.estrategias.NotificacionPorSMS;
import Notificaciones.estrategias.NotificacionPorWhatsApp;
import Notificaciones.estrategias.adapters.email.AdapterEmailJavaEmail;
import Notificaciones.estrategias.adapters.sms.AdapterSMSTwilio;
import Notificaciones.estrategias.adapters.whatsapp.AdapterWhatsAppTwilio;

public class TestNotificaciones {
    public static void main(String[] args) {

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