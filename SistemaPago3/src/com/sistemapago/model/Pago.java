package com.sistemapago.model;

import java.util.Date;
import com.sistemapago.paymentmethods.PayPal;
import com.sistemapago.paymentmethods.TarjetaCredito;
import com.sistemapago.paymentmethods.MetodoNuevo;

public class Pago {
    private Date fechaPago;
    private int valor;
    private String metodoPago;
    private String nombreCliente;
    private String apellidoCliente;
    private PayPal payPal;
    private TarjetaCredito tarjeta;
    private MetodoNuevo metodoNuevo;

    public Pago(Date date, int i, String tarjetaCredito, String nombre, String apellido, TarjetaCredito tarjeta) {
        this.fechaPago = date;
        this.valor = i;
        this.metodoPago = tarjetaCredito;
        this.nombreCliente = nombre;
        this.apellidoCliente = apellido;
        this.tarjeta= tarjeta;

    }
    public Pago(Date date, int i, String paypal, String nombre, String apellido, PayPal payPal) {
        this.fechaPago = date;
        this.valor = i;
        this.metodoPago = paypal;
        this.nombreCliente = nombre;
        this.apellidoCliente = apellido;
        this.payPal = payPal;

    }
    public Pago(Date date, int i, String metodNuevo,String nombre, String apellido, MetodoNuevo metodoNuevo) {

        this.fechaPago = date;
        this.valor = i;
        this.metodoPago = metodNuevo;
        this.nombreCliente = nombre;
        this.apellidoCliente = apellido;
        this.metodoNuevo = metodoNuevo;
    }
    public boolean procesarPagoPP(Pago pagopp) {
        System.out.println(pagopp.payPal);
        return pagopp.payPal.procesarPago();
    }
    public boolean procesarPagoTC(Pago pagotc) {
        System.out.println(pagotc.tarjeta);
        return pagotc.tarjeta.procesarPago();
    }
    public boolean procesarPagoNM(Pago pagonm) {
        System.out.println(pagonm.metodoNuevo);
        return pagonm.metodoNuevo.ejecutarPago();
    }

    public String getFechaPago() {
        return this.fechaPago.toString();
    }

    public String getTipoPago() {
        return this.metodoPago.toString();
    }
}
