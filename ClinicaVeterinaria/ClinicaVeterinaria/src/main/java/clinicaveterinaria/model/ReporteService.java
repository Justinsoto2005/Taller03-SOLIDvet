package clinicaveterinaria.model;

import clinicaveterinaria.repository.BaseDatos;

public class ReporteService{
    private BaseDatos baseDatos;
    public ReporteService(BaseDatos baseDatos){
        this.baseDatos = baseDatos;
    }
    public String crearReporte(Cita cita) {
        return "Reporte: " + cita.getVeterinario().getNombre() + " atendio a " +
                cita.getMascota().getNombre() + " con diagnostico " + cita.getDiagnostico();
    }
}