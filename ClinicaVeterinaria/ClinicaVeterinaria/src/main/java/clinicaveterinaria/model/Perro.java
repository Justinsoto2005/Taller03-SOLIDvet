package clinicaveterinaria.model;

import clinicaveterinaria.interfaces.ICaminador;

public class Perro extends Animal implements ICaminador {
    public Perro(int id, String nombre) {
        super(id, nombre, TipoAnimal.PERRO);
    }

    @Override
    public void camina() {
        System.out.println(getNombre()+"Esta caminando");
    }

}
