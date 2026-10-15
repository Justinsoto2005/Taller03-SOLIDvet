package clinicaveterinaria.interfaces;

public interface ITratamiento {
    int getId();
    double getCosto();
    double calcularCostoFinal();
    String obtenerIndicaciones();
    String prepararSala();
    double calcularConImpuestos();
}
