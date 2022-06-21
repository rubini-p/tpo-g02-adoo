import Gastos.Gasto;
import Gastos.Recurrentes;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date date = new Date();
        Gasto gasto1 = new Recurrentes((float)1998,true, date,30);


    }
}
