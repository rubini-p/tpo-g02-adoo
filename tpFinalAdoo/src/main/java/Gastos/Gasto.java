package Gastos;

import java.util.Date;

public abstract class Gasto  {

    public Gasto(Float monto, Date fecha) {
        this.monto = monto;
        this.fecha = fecha;
    }

    private Float monto;

    public boolean recurrente;

    private Date fecha;


    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }


    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}