package Notificaciones.estrategias;

import Notificaciones.Notificacion;
import Notificaciones.estrategias.adapters.sms.AdapterNotificadorSMS;

public class NotificacionPorSMS implements EstrategiaDeNotificacion {

	private AdapterNotificadorSMS adapter;
	
	public void setAdapter(AdapterNotificadorSMS adapter) {
		this.adapter = adapter;
	}

	public NotificacionPorSMS(AdapterNotificadorSMS adapter) {
		super();
		this.adapter = adapter;
	}

	public void enviar(Notificacion notificacion) {
		this.adapter.enviarSMS(notificacion);
	}

}
