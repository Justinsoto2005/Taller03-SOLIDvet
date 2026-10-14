package clinicaveterinaria.model;

public class CirugiaTratamiento extends Tratamiento{
    public CirugiaTratamiento(int id, String descripcion, double costo){
        super(id, TipoTratamiento.CIRUGIA, descripcion, costo);
    }

    public CirugiaTratamiento(double costo){
        super(0, TipoTratamiento.CIRUGIA, "Cirugia", costo);
    }

    @Override
    public double calcularCostoFinal(){
        return getCosto() * 1.25 + 80.0;
    }

    @Override
    public String obtenerIndicaciones(){
        return "Ayuno previo y control postoperatorio.";
    }

    @Override
    public String prepararSala(){
        return "Preparar quirofano y anestesia.";
    }

    @Override
    public double calcularConImpuestos(){
        return getCosto() * 1.35;
    }
}