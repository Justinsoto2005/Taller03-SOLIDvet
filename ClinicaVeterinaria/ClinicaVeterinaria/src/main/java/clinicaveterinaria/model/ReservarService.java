package clinicaveterinaria.model;
import java.time.LocalDate;

public class ReservarService{

    public Cita reservarCita(int citaId, Mascota mascota,Veterinario veterinario, LocalDate fecha) {
        veterinario.setDisponible(false);
        return new Cita(citaId, mascota, veterinario, fecha, "Pendiente", EstadoCita.PROGRAMADA);
    }
}