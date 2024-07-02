package com.cumple.gsc.model.retail;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

@Entity
@Table(name ="RECIBO_POS")
@Data
public class ReciboPos {

    @Id
    @Setter(AccessLevel.NONE)
    @Column(name = "RPO_CODIGO")
    private Long codigo;

    @Column(name = "RPO_EMPRESA")
    private Long empresa;

    @Column(name = "RPO_USR_LIQUIDA")
    private Long usuarioLiquida;

    @Column(name = "RPO_CCO_COMPROBA")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigInteger ccoComproba;

    @Column(name = "RPO_SUBTOTAL_0")
    private BigDecimal subtotal0;

    @Column(name = "RPO_SUBTOTAL")
    private BigDecimal subtotal;

    @Column(name = "RPO_DESCUENTO")
    private int descuento;

    @Column(name = "RPO_IMPUESTO")
    private int impuesto;

    @Column(name = "RPO_PORC_IMPUESTO")
    private BigDecimal porcImpuesto;

    @Column(name = "RPO_VAL_IMPUESTO")
    private BigDecimal valImpuesto;

    @Column(name = "RPO_CLIENTE")
    private int cliente;

    @Column(name = "RPO_TARJETAHABIENTE")
    private String targetJetaHabiente;

    @Column(name = "RPO_NUM_APROB")
    private String numAprobado;

    @Column(name = "RPO_NOM_EMISOR")
    private String nomEmisor;

    @Column(name = "PRO_REFEENCIA")
    private String refereencia;

    @Column(name = "RPO_LOTE")
    private String lote;

    @Column(name = "RPO_COD_ADQUIRIENTE")
    private String codAdquiriente;

    @Column(name = "RPO_NOM_ADQUIRIENTE")
    private String nomAdquiriente;

    @Column(name = "RPO_NUM_TARJETA")
    private String numTajeta;

    @Column(name = "RPO_FECHA")
    private String fecha;

    @Column(name = "RPO_HORA")
    private String hora;

    @Column(name = "RPO_RESULTADO")
    private String resultado;

    @Column(name = "RPO_ALMACEN")
    private int almacen;

    @Column(name = "RPO_PVENTA")
    private int pventa;

    @Column(name = "RPO_CCO_RECIBO")
    private Long ccoRecibo;

    @Column(name = "CREA_USR")
    private String creaUsr;

    @Column(name = "CREA_FECHA")
    private LocalDate creaFecha;

    @Column(name = "MOD_USR")
    private String modUsr;

    @Column(name = "MOD_FECHA")
    private LocalDate modFecha;
}
