package Consorcio;

import Criterios.pagoCompleto;
import Expensa.Expensa;
import Externos.Persona;
import Gastos.Gasto;

import UnidadFuncional.ControladorUnidadesFuncionales;
import UnidadFuncional.UnidadFuncional;
import UnidadFuncional.TipoDeUnidadFuncional;
import UnidadFuncional.UnidadFuncional;
import Expensa.TipoDeExpensas;
import Expensa.Administrador;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.*;

class ControladorConsorcioTest {

    @Test
    void agregarExpensas() {

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
        CuentaCorriente ctaCte = new CuentaCorriente();
        Gasto gasto1 = new Gasto((float)1998, new Date(),false);
        Gasto gasto2 = new Gasto((float)10, new Date(),false);
        Gasto gasto3 = new Gasto((float)1000, new Date(),false);
        List<Gasto> gastos = new ArrayList<Gasto>();

        gastos.add(gasto1);
        gastos.add(gasto2);
        gastos.add(gasto3);

        Expensa expensa = new Expensa(new Date(), gastos, TipoDeExpensas.ORDINARIAS);
        List<Expensa>listaEXPEN = new ArrayList<>();
        listaEXPEN.add(expensa);

        Consorcio consorcio = new Consorcio(listaUFs,ctaCte,listaEXPEN);

        ControladorConsorcio controladorC = new ControladorConsorcio();
        try {
            controladorC.agregarExpensas(consorcio, expensa);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Test
    void agregarUnidadFuncional() {
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
        CuentaCorriente ctaCte = new CuentaCorriente();
        Gasto gasto1 = new Gasto((float)1998, new Date(),false);
        Gasto gasto2 = new Gasto((float)10, new Date(),false);
        Gasto gasto3 = new Gasto((float)1000, new Date(),false);
        List<Gasto> gastos = new ArrayList<Gasto>();

        gastos.add(gasto1);
        gastos.add(gasto2);
        gastos.add(gasto3);

        Expensa expensa = new Expensa(new Date(), gastos, TipoDeExpensas.ORDINARIAS);
        List<Expensa>listaEXPEN = new ArrayList<>();
        listaEXPEN.add(expensa);

        Consorcio consorcio = new Consorcio(listaUFs,ctaCte,listaEXPEN);

        ControladorConsorcio controladorC = new ControladorConsorcio();
        try {
            controladorC.agregarUnidadFuncional(consorcio, uf1);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @Test
    void expensasPorUnidad() {

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
        CuentaCorriente ctaCte = new CuentaCorriente();
        Gasto gasto1 = new Gasto((float)1998, new Date(),true);
        Gasto gasto2 = new Gasto((float)10, new Date(),false);
        Gasto gasto3 = new Gasto((float)1000, new Date(),false);
        List<Gasto> gastos = new ArrayList<Gasto>();

        gastos.add(gasto1);
        gastos.add(gasto2);
        gastos.add(gasto3);

        Expensa expensa = new Expensa(new Date(), gastos, TipoDeExpensas.ORDINARIAS);
        List<Expensa>listaEXPEN = new ArrayList<>();
        listaEXPEN.add(expensa);

        Consorcio consorcio = new Consorcio(listaUFs,ctaCte,listaEXPEN);

        ControladorConsorcio controladorC = new ControladorConsorcio();
        try {
            controladorC.expensasPorUnidad(consorcio);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}