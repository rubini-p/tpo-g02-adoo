package Consorcio;

import Criterios.Criterio;
import Criterios.pagoCompleto;
import Expensa.Expensa;
import Gastos.Gasto;
import UnidadFuncional.UnidadFuncional;
import org.junit.jupiter.api.Test;
import Expensa.TipoDeExpensas;
import UnidadFuncional.Persona;
import UnidadFuncional.TipoDeUnidadFuncional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ConsorcioTest {



    @Test
    void testAgregarExpensa() {
    }

    @Test
    void testAgregarUnidadFuncional() {
    }

    @Test
    void calcularGastosUnidad() {
    }

    @Test
    void obtenerSaldo() {
    }

    @Test
    void liquidarExpensas() {
        List<UnidadFuncional> listaUFs = new ArrayList<UnidadFuncional>();

        Persona p1 = new Persona("Pablo", "Rubini");
        Persona p2 = new Persona("Camila", "Olivo");

        List<Persona> listaPersonas1 = new ArrayList<>();
        List<Persona> listaPersonas2 = new ArrayList<>();

        listaPersonas1.add(p1);
        listaPersonas2.add(p2);

        UnidadFuncional uf1 = new UnidadFuncional(1,36, listaPersonas1, null ,  (float)0.0, TipoDeUnidadFuncional.DEPARTAMENTO );
        UnidadFuncional uf2 = new UnidadFuncional(2,60, listaPersonas2, null ,  (float)1000.0, TipoDeUnidadFuncional.COCHERA );

        listaUFs.add(uf1);
        listaUFs.add(uf2);
        Gasto gasto1 = new Gasto((float)1998, new Date(),true);
        Gasto gasto2 = new Gasto((float)10, new Date(),false);
        Gasto gasto3 = new Gasto((float)1000, new Date(),false);
        List<Gasto> gastos = new ArrayList<Gasto>();

        gastos.add(gasto1);
        gastos.add(gasto2);
        gastos.add(gasto3);

        Expensa expensa = new Expensa(new Date(), gastos, TipoDeExpensas.ORDINARIAS);
        System.out.println(new Date());
        List<Expensa>listaEXPEN = new ArrayList<>();
        listaEXPEN.add(expensa);
        Criterio criterio = new pagoCompleto();
        Consorcio consorcio = new Consorcio(listaUFs,listaEXPEN, criterio);

        try {
            consorcio.liquidarExpensas(uf1);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}