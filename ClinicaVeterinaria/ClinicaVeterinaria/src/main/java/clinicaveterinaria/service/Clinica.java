package clinicaveterinaria.service;

import clinicaveterinaria.interfaces.IBaseDatos;
import clinicaveterinaria.interfaces.IVeterinarioService;
import clinicaveterinaria.model.Cita;
import clinicaveterinaria.model.Factura;
import clinicaveterinaria.model.Mascota;
import clinicaveterinaria.model.Tratamiento;
import clinicaveterinaria.model.Veterinario;
import java.time.LocalDate;
import java.util.List;


public class Clinica implements IVeterinarioService, IBaseDatos {
    private final IVeterinarioService veterinarioService;
    private final IBaseDatos baseDatos;

    public Clinica(IVeterinarioService veterinarioService, IBaseDatos baseDatos) {
            this.veterinarioService = veterinarioService;
            this.baseDatos = baseDatos;
    }

    public Cita agendarConsultaRapida(Mascota mascota, Veterinario veterinario) {
        baseDatos.conectar();
        Cita cita = veterinarioService.reservarCita(mascota, veterinario, LocalDate.now());
        baseDatos.getCitas().add(cita);
        return cita;
    }

    @Override
    public List<Mascota> getMascotas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMascotas'");
    }

    @Override
    public List<Veterinario> getVeterinarios() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVeterinarios'");
    }

    @Override
    public List<Cita> getCitas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCitas'");
    }

    @Override
    public List<Tratamiento> getTratamientos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTratamientos'");
    }

    @Override
    public List<Factura> getFacturas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFacturas'");
    }

    @Override
    public Cita reservarCita(Mascota mascota, Veterinario veterinario, LocalDate fecha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reservarCita'");
    }

    @Override
    public void diagnosticar(Cita cita, String diagnostico) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'diagnosticar'");
    }

    @Override
    public void crearVeterinario(Veterinario veterinario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearVeterinario'");
    }

    @Override
    public Veterinario obtenerVeterinario(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerVeterinario'");
    }

    @Override
    public void actualizarVeterinario(Veterinario veterinario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarVeterinario'");
    }

    @Override
    public void eliminarVeterinario(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarVeterinario'");
    }

    @Override
    public void conectar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'conectar'");
    }
}
