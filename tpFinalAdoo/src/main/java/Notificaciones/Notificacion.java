package Notificaciones;

public class Notificacion {
    
	private String emailDestinatario;
	private String emailRemitente;
	private String mensaje;
	private String nroDestinatario;
	private String nroRemitente;
	
	public String getEmailDestinatario() {
		return emailDestinatario;
	}

	public void setEmailDestinatario(String emailDestinatario) {
		this.emailDestinatario = emailDestinatario;
	}

	public String getEmailRemitente() {
		return emailRemitente;
	}

	public void setEmailRemitente(String emailRemitente) {
		this.emailRemitente = emailRemitente;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getNroDestinatario() {
		return nroDestinatario;
	}

	public void setNroDestinatario(String nroDestinatario) {
		this.nroDestinatario = nroDestinatario;
	}

	public String getNroRemitente() {
		return nroRemitente;
	}

	public void setNroRemitente(String nroRemitente) {
		this.nroRemitente = nroRemitente;
	}	
}

