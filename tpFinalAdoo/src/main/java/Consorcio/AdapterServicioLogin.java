package Consorcio;

public class AdapterServicioLogin implements AdapterLogin {

    @Override
    public void login(String usuario, String contrseña) {
        System.out.println("Usuario " + usuario + " logeado exitosamente");
    }
}
