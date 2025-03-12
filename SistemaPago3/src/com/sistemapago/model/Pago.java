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

    public Pago(Date date, int i, String tarjetaCredito, Object nombre, Object apellido, TarjetaCredito tarjeta) {
    }
    public Pago(Date date, int i, String tarjetaCredito, Object nombre, Object apellido, PayPal payPal) {
    }
    public Pago(Date date, int i, String tarjetaCredito, Object nombre, Object apellido, MetodoNuevo metodoNuevo) {
    }
}
