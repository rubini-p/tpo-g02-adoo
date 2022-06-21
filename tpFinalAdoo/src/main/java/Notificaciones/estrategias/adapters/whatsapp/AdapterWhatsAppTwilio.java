package Notificaciones.estrategias.adapters.whatsapp;

import Notificaciones.Notificacion;

public class AdapterWhatsAppTwilio implements AdapterNotificadorWhatsApp {

	public void enviarWhatsApp(Notificacion notificacion) {
		System.out.println("Enviando WhatsApp a " +
		notificacion.getNroDestinatario() + " por Twilio: " +
		"'" + notificacion.getMensaje() + "'"
		);
	}

}
