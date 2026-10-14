package clinicaveterinaria.model;

public class ReporteService{
    public String crearReporte(Cita cita) {
        return "Reporte: " + cita.getVeterinario().getNombre() + " atendio a " +
                cita.getMascota().getNombre() + " con diagnostico " + cita.getDiagnostico();
    }
}