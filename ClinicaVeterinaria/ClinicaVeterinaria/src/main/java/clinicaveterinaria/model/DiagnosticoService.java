package clinicaveterinaria.model;

public class DiagnosticoService{
    public void diagnosticar(Cita cita, String diagnostico) {
        cita.setDiagnostico(diagnostico);
        cita.setEstado(EstadoCita.ATENDIDA);
    }
}