public class Gato extends Animal {
    public Gato(long id, String nome, int idade, double peso) {
        super(id, nome, idade, peso);
        realizarHabilidade("agilidade");
    }

    @Override
    public String emitirSom() {
        return "miaau";
    }
}
