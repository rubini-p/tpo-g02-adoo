package UnidadFuncional;

import Consorcio.ControladorConsorcio;
import UnidadFuncional.Persona;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ControladorUnidadesFuncionalesTest {

    @Test
    void realizarPago() {
        Pago pago = new Pago(new Date(), (float)10);
        Persona p1 = new Persona("Pablo", "Rubini");

        List<Persona> listaPersonas1 = new ArrayList<>();

        listaPersonas1.add(p1);

        UnidadFuncional uf1 = new UnidadFuncional(1,36, listaPersonas1, null ,  (float)0.0, TipoDeUnidadFuncional.DEPARTAMENTO );

        ControladorUnidadesFuncionales controladorConsorcio = new ControladorUnidadesFuncionales();

        try {
            System.out.print(uf1.getDeuda());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}