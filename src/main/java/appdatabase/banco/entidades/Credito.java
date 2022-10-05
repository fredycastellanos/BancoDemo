package appdatabase.banco.entidades;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="creditos")

public class Credito {
    @Id
    private int codigocredito;
    @Column(nullable = false)
    private int montoprestado;
    @Column(nullable = false)
    private int plazo;
    @Column(nullable = false)
    private Date fecha;

    @ManyToOne
    @JoinColumn(name="Docliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name="codigolinea", nullable = false)
    private LineaDeCredito linea;

}
