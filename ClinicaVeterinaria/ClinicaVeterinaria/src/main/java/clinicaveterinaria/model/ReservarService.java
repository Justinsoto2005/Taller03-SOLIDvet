package clinicaveterinaria.model;
import java.time.LocalDate;

public class ReservarService extends Veterinario{

    public ReservarService(int id, String nombre, String especialidad, boolean disponible){
        super(id,nombre,especialidad,disponible);
    }

    public Cita reservarCita(int citaId, Mascota mascota, LocalDate fecha) {
        disponible = false;
        return new Cita(citaId, mascota, this, fecha, "Pendiente", EstadoCita.PROGRAMADA);
    }
}