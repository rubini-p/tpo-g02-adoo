package Consorcio;

public class Administrador {

    private String usuario = "Admin";
    private String contraseña = "123456";
    private AdapterLogin adapter;

    public String getUsuario() {
        return usuario;
    }

    public void login() {
        this.adapter.login(this.usuario, this.contraseña);
    }

}
