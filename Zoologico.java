import java.util.ArrayList;

public class Zoologico {

    private ArrayList<Animal> animais = new ArrayList<>();
//obj animal
    public Zoologico() {
    }
// metodo
    public boolean adicionarAnimal(Animal animal) {
        if (buscarAnimal(animal.getId()) == null) {
            animais.add(animal);
            return true;
        } else {
            return false;
        }
    }
// lista os animais
    public ArrayList<Animal> listarAnimais() {
        return animais;
    }

    public Animal buscarAnimal(long id) {
        for (Animal animal : animais) {
            if (id == animal.getId()) {
                return animal;
            }
        }

        return null;
    }

    public boolean removerAnimal(long id) {
        Animal animalEncontrado = buscarAnimal(id);

        if (animalEncontrado != null) {
            animais.remove(animalEncontrado);
            return true;
        } else {
            return false;
        }
    }
}