package Notificacion;

/**
 * 
 */
public class Notificacion {

    public Notificacion(String email, int telefono, String emailDestinatario, String telefonoDestinatario) {
        this.email = email;
        this.telefono = telefono;
        this.emailDestinatario = emailDestinatario;
        this.telefonoDestinatario = telefonoDestinatario;
    }

    public String email;

    public int telefono;

    public String emailDestinatario;

    public String telefonoDestinatario;

}