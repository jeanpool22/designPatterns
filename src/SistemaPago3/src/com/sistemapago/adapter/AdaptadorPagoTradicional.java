package SistemaPago3.src.com.sistemapago.adapter;

import SistemaPago3.src.com.sistemapago.SistemaPago;
import SistemaPago3.src.com.sistemapago.model.Pago;

public class AdaptadorPagoTradicional implements SistemaPago {
    private Pago tipoPago;

    public boolean procesarPago(Pago valor) {
        return true;
    }

    public boolean procesarPagoNew(Pago valor) {
        return true;
    }
}
