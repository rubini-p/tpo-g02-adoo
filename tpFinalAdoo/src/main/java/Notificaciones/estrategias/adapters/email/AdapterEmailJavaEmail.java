package Notificaciones.estrategias.adapters.email;

import Notificaciones.Notificacion;

public class AdapterEmailJavaEmail implements AdapterNotificadorEmail {

	public void enviarEmail(Notificacion notificacion) {
		System.out.println("Enviando Email a " +
				notificacion.getNroDestinatario() + " por Twilio: " +
				"'" + notificacion.getMensaje() + "'"
				);
	}

}
