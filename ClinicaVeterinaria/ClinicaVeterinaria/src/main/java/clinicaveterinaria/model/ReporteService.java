package clinicaveterinaria.model;

public class ReporteService extends Veterinario{
    public ReporteService(int id, String nombre, String especialidad, boolean disponible){
        super(id, nombre, especialidad, disponible);
    }
    public String crearReporte(Cita cita) {
        return "Reporte: " + nombre + " atendio a " +
                cita.getMascota().getNombre() + " con diagnostico " + cita.getDiagnostico();
    }
}