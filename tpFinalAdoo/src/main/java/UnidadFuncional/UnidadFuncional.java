package UnidadFuncional;


import java.util.ArrayList;
import java.util.List;


/**
 * 
 */
public class UnidadFuncional   {

    private int id;
    private int tamaño;
    private List<Persona> propietario;
    private List<Persona>  inquilino;
    private float deuda;
    private TipoDeUnidadFuncional tipoDeUnidadFuncional;
    private List<Pago> listaPagos = new ArrayList<>() ;
    public UnidadFuncional(int id, int tamaño, List<Persona> propietario, List<Persona> inquilino, float deuda, TipoDeUnidadFuncional tipoDeUnidadFuncional) {
        this.id = id;
        this.tamaño = tamaño;
        this.propietario = propietario;
        this.inquilino = inquilino;
        this.deuda = deuda;
        this.tipoDeUnidadFuncional = tipoDeUnidadFuncional;
    }

    public float obtenerPorcentaje(int TamañoTotal) {
        return (getTamaño() * 100)/TamañoTotal;
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

    public void agregarFactura (Pago p) {
        this.listaPagos.add(p);
    }
}