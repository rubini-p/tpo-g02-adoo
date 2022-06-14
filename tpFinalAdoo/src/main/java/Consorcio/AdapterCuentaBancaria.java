package Consorcio;

import java.util.Date;


public interface AdapterCuentaBancaria {



    public float obtenerSaldo(Date fecha, int cbu, String alias);

}