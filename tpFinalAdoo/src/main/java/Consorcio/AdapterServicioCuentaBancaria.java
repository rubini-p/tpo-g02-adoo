package Consorcio;

public class AdapterServicioCuentaBancaria implements AdapterCuentaBancaria {

    public float obtenerSaldo(String nroCuenta) {
        return 1000;
    }

}