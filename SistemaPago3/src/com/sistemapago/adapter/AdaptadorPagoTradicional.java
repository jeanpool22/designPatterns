package com.sistemapago.adapter;

import com.sistemapago.SistemaPago;
import com.sistemapago.model.Pago;

public class AdaptadorPagoTradicional implements SistemaPago {
    private Pago tipoPago;

    public boolean procesarPago(Pago valor) {
        return true;
    }

    public boolean procesarPagoNew(Pago valor) {
        return true;
    }
}
