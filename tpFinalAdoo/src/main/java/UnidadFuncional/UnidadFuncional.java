package UnidadFuncional;

import Expensa.Expensa;
import Externos.Persona;

import java.util.List;


/**
 * 
 */
public class UnidadFuncional   {


    public UnidadFuncional(int id, int tamaño, List<Persona> propietario, List<Persona> inquilino, float deuda, TipoDeUnidadFuncional tipoDeUnidadFunciona) {
        this.id = id;
        this.tamaño = tamaño;
        this.propietario = propietario;
        this.inquilino = inquilino;
        this.deuda = deuda;
        this.tipoDeUnidadFunciona = tipoDeUnidadFunciona;
    }

    public int id;

    public int tamaño;

    public List<Persona> propietario;

    public List<Persona>  inquilino;

    public float deuda;

    public TipoDeUnidadFuncional tipoDeUnidadFunciona;

    public int obtenerPorcentaje() {
        // TODO implement here
        return 0;
    }



    public float calcularGastosUnidad(UnidadFuncional unidad, Expensa expensas) {
        // TODO implement here
        return 0.0f;
    }


    public void confirmarPago( int deuda , int Pago) {

    }

}