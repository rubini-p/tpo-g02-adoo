package UnidadFuncional;

import Expensa.Expensa;

import java.util.Date;

/**
 * 
 */
public class Pago {

    public Pago(Date fechaDePago, Float monto, float totalAPagar) {
        this.fechaDePago = fechaDePago;
        this.monto = monto;
        this.totalAPagar = totalAPagar;
    }

    public Date fechaDePago;
    public Float monto;
    public float totalAPagar;

    public void Pagar(Expensa expensa, UnidadFuncional unidadFuncional) {


    }

}