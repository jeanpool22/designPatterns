package SistemaPago3.src.com.sistemapago.service;

import SistemaPago3.src.com.sistemapago.model.Pago;

public class Service {
    public boolean aplicarPagoTC(Pago pagotc) {

        return pagotc.procesarPagoTC(pagotc);
    }

    public boolean aplicarPagoPayPal(Pago pagopp) {
        return pagopp.procesarPagoPP(pagopp);

    }

    public boolean aplicarPagoNuevoMetodo(Pago pagonm) {
        return pagonm.procesarPagoNM(pagonm);
    }
}
