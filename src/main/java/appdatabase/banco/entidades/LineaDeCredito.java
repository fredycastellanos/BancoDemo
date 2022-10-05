package appdatabase.banco.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lineasdecredito")
public class LineaDeCredito {
    @Id
    private int codigoLinea;
    @Column(nullable = false,unique = false,length = 30)
    private String nombrelinea;
    private int montomaximo;
    private  int plazo;

    public LineaDeCredito(int codigoLinea, String nombrelinea, int montomaximo, int plazo) {
        this.codigoLinea = codigoLinea;
        this.nombrelinea = nombrelinea;
        this.montomaximo = montomaximo;
        this.plazo = plazo;
    }

    public LineaDeCredito() {
    }

    public int getCodigoLinea() {
        return codigoLinea;
    }

    public void setCodigoLinea(int codigoLinea) {
        this.codigoLinea = codigoLinea;
    }

    public String getNombrelinea() {
        return nombrelinea;
    }

    public void setNombrelinea(String nombrelinea) {
        this.nombrelinea = nombrelinea;
    }

    public int getMontomaximo() {
        return montomaximo;
    }

    public void setMontomaximo(int montomaximo) {
        this.montomaximo = montomaximo;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
}
