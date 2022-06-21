package UnidadFuncional;

import Expensa.Expensa;
import Externos.Persona;

import java.util.List;


/**
 * 
 */
public class UnidadFuncional   {


    public UnidadFuncional(int id, int tamaño, List<Persona> propietario, List<Persona> inquilino, float deuda, TipoDeUnidadFuncional tipoDeUnidadFuncional) {
        this.id = id;
        this.tamaño = tamaño;
        this.propietario = propietario;
        this.inquilino = inquilino;
        this.deuda = deuda;
        this.tipoDeUnidadFuncional = tipoDeUnidadFuncional;
    }

    public int id;

    public int tamaño;

    public List<Persona> propietario;

    public List<Persona>  inquilino;

    public float deuda;

    public TipoDeUnidadFuncional tipoDeUnidadFuncional;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public List<Persona> getPropietario() {
        return propietario;
    }

    public void setPropietario(List<Persona> propietario) {
        this.propietario = propietario;
    }

    public List<Persona> getInquilino() {
        return inquilino;
    }

    public void setInquilino(List<Persona> inquilino) {
        this.inquilino = inquilino;
    }

    public float getDeuda() {
        return deuda;
    }

    public void setDeuda(float deuda) {
        this.deuda = deuda;
    }

    public TipoDeUnidadFuncional getTipoDeUnidadFuncional() {
        return tipoDeUnidadFuncional;
    }

    public void setTipoDeUnidadFuncional(TipoDeUnidadFuncional tipoDeUnidadFuncional) {
        this.tipoDeUnidadFuncional = tipoDeUnidadFuncional;
    }
}