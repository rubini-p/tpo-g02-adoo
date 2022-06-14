package Gastos;

import java.util.Date;

/**
 * 
 */
public class Recurrentes extends Gasto {

    public Recurrentes(Float monto, boolean recurrente, Date fecha, int cadaCuantosDias) {
        super(monto, recurrente, fecha);
        CadaCuantosDias = cadaCuantosDias;
    }

    public int CadaCuantosDias;

    public int getCadaCuantosDias() {
        return CadaCuantosDias;
    }

    public void setCadaCuantosDias(int cadaCuantosDias) {
        CadaCuantosDias = cadaCuantosDias;
    }



}