package Gastos;

import java.util.Date;

public abstract class Gasto  {

    public Gasto(Float monto, boolean recurrente, Date fecha) {
        this.monto = monto;
        this.recurrente = recurrente;
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

    public boolean isRecurrente() {
        return recurrente;
    }

    public void setRecurrente(boolean recurrente) {
        this.recurrente = recurrente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}