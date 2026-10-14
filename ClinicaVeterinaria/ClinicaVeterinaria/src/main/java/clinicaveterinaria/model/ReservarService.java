package clinicaveterinaria.model;

import java.time.LocalDate;

import clinicaveterinaria.repository.BaseDatos;

public class ReservarService{
    private BaseDatos baseDatos;

    public ReservarService(BaseDatos baseDatos){
        this.baseDatos = baseDatos;
    }

    public Cita reservarCita(int citaId, Mascota mascota,Veterinario veterinario, LocalDate fecha) {
        veterinario.setDisponible(false);
        return new Cita(citaId, mascota, veterinario, fecha, "Pendiente", EstadoCita.PROGRAMADA);
    }
}