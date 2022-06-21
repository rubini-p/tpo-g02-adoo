package UnidadFuncional;

import Expensa.Expensa;

import java.util.Date;

/**
 * 
 */
public class Pago {

    public Pago(Date fechaDePago, Float monto) {
        this.fechaDePago = fechaDePago;
        this.monto = monto;
    }

    public Date fechaDePago;
    public Float monto;

    public Date getFechaDePago() {
        return fechaDePago;
    }

    public void setFechaDePago(Date fechaDePago) {
        this.fechaDePago = fechaDePago;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }




}