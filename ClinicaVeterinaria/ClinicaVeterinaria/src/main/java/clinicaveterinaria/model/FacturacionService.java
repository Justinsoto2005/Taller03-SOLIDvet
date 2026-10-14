package clinicaveterinaria.model;

import java.time.LocalDate;

public class FacturacionService{
    public Factura generarFactura(int facturaId, Cita cita, double monto, LocalDate fecha) {
        return new Factura(facturaId, cita, monto, fecha, false);
    }
}