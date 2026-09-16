
import java.util.ArrayList;

public class Animal {
    private final long id;
    private String nome;
    private int idade;
    private double peso;
    ArrayList<String> habilidades;

    public Animal(long id, String nome, int idade, double peso) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.habilidades = new ArrayList<>();
    }
    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public String emitirSom() {
        return "som desconhecido";
    }

    public String realizarHabilidade(String habilidade) {
        if (habilidades.contains(habilidade)) {
            return nome + " consegue " + habilidade;
        } else {
            return nome + " não consegue " + habilidade;
        }
    }

    @Override
    public String toString() {
        return "\nNome: " + nome
                + "\nIdade: " + idade
                + "\nPeso: " + peso + "\n";
    }
}