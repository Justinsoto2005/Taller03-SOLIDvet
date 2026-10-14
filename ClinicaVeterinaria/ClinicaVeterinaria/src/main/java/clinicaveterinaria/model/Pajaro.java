package clinicaveterinaria.model;

import clinicaveterinaria.interfaces.IVolador;

public class Pajaro extends Animal implements IVolador {
    public Pajaro(int id, String nombre) {
        super(id, nombre, TipoAnimal.PAJARO);
    }

    @Override
    public void vuela() {
        System.out.println("Puede Volar :)");
    }

}
