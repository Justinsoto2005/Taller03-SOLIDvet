package clinicaveterinaria.model;

import clinicaveterinaria.interfaces.ICaminador;

public class Gato extends Animal implements ICaminador {
    public Gato(int id, String nombre) {
        super(id, nombre, TipoAnimal.GATO);
    }

    @Override
    public void camina() {
        System.out.println(getNombre()+"Esta caminando");
    }


}
