package com.sistemapago;

public interface SistemaPago {
    boolean procesarPago(com.sistemapago.model.Pago pago);
    boolean procesarPagoNew(com.sistemapago.model.Pago pago);
}
