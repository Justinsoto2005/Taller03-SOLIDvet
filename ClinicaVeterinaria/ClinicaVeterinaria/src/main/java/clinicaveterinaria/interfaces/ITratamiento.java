package clinicaveterinaria.interfaces;

import clinicaveterinaria.model.Tratamiento;

public interface ITratamiento {
    int getId();
    double getCosto();
    double calcularCostoFinal();
    String obtenerIndicaciones();

    void crearTratamiento(Tratamiento tratamiento);

    double calcularTratamiento(Tratamiento tratamiento);

    double calcularIngresosMensual();

    String prepararSala();
    double calcularConImpuestos();

}
