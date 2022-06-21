package Notificaciones.estrategias.adapters.sms;

import Notificaciones.Notificacion;

public class AdapterSMSTwilio implements AdapterNotificadorSMS {

	public void enviarSMS(Notificacion notificacion) {
		System.out.println("Enviando SMS a " +
				notificacion.getNroDestinatario() + " por Twilio: " +
				"'" + notificacion.getMensaje() + "'"
				);
	}

}
