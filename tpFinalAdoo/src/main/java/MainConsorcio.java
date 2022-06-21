import Consorcio.Consorcio;
import Consorcio.ControladorConsorcio;
import Consorcio.CuentaCorriente;
import Criterios.Criterio;
import Criterios.pagoCompleto;
import Expensa.Expensa;
import Expensa.TipoDeExpensas;
import Expensa.Administrador;
import Externos.Persona;
import Gastos.Gasto;
import UnidadFuncional.ControladorUnidadesFuncionales;
import UnidadFuncional.UnidadFuncional;
import UnidadFuncional.TipoDeUnidadFuncional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainConsorcio {
    public static void main(String[] args) {

        List<UnidadFuncional> listaUFs = new ArrayList<UnidadFuncional>();

        Persona p1 = new Persona("Pablo", "Rubini");
        Persona p2 = new Persona("Camila", "Olivo");

        List<Persona> listaPersonas1 = new ArrayList<>();
        List<Persona> listaPersonas2 = new ArrayList<>();

        listaPersonas1.add(p1);
        listaPersonas2.add(p2);

        UnidadFuncional uf1 = new UnidadFuncional(1,36, listaPersonas1, null ,  (float)0.0, TipoDeUnidadFuncional.DEPARTAMENTO );
        UnidadFuncional uf2 = new UnidadFuncional(2,36, listaPersonas2, null ,  (float)0.0, TipoDeUnidadFuncional.COCHERA );

        listaUFs.add(uf1);
        CuentaCorriente ctaCte = new CuentaCorriente();
        List<Expensa> listaExpensas = new ArrayList<Expensa>();


        Date fecha = new Date();
        List<Gasto> listaGastos = new ArrayList<Gasto>();
        Administrador administrador = new Administrador();

        Criterios.pagoCompleto criterio = new pagoCompleto();

        Expensa e1 = new Expensa(fecha, listaGastos, criterio, TipoDeExpensas.ORDINARIAS, administrador);

        Consorcio c = new Consorcio(listaUFs, ctaCte, listaExpensas);

        ControladorUnidadesFuncionales cuf = new ControladorUnidadesFuncionales();

        ControladorConsorcio cc = new ControladorConsorcio();

        cc.agregarExpensas(c, e1);
        cc.agregarUnidadFuncional(c, uf2);
        System.out.println(c.getExpensas().get(0).getFecha());
        System.out.println(c.getUnidadesFuncionales().get(1).getTipoDeUnidadFuncional());

    }
}
