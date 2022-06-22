package Gastos;

import java.util.Date;

public  class Gasto  {

    public Gasto(Float monto, Date fecha,boolean recurrente) {
        this.monto = monto;
        this.fecha = fecha;
        this.recurrente= recurrente;
    }


    public boolean isRecurrente() {
        return recurrente;
    }

    public void setRecurrente(boolean recurrente) {
        this.recurrente = recurrente;
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