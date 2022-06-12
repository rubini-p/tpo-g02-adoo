package Gastos;

import java.util.Date;

public abstract class Gasto  {

    public Gasto(Float monto, boolean recurrente, Date fecha) {
        this.monto = monto;
        this.recurrente = recurrente;
        this.fecha = fecha;
    }

    public Gasto() {
    }

    private Float monto;

    public boolean recurrente;

    private Date fecha;

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

    public float getMonto() {
        return getMonto();
    }

}