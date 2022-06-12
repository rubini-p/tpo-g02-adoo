package Expensa;

public class Administrador {

    private String NombreUsuario;
    private String Contraseña;

    public String login(){
        return NombreUsuario + "/" + Contraseña;
    }

}
