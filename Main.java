import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Zoologico zoologico = new Zoologico();

        int opcao;

        do {
            System.out.println();
            System.out.println("1. Adicionar Animal");
            System.out.println("2. Listar todos os Animais");
            System.out.println("3. Remover Animal");
            System.out.println("4. Emitir som de um animal");
            System.out.println("5. Testar habilidade de um animal");
            System.out.println("6. Sair");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("\n adicionar animal");

                    System.out.println("1. Gato");
                    System.out.println("2. Cachorro");
                    System.out.println("3. Passaro");
                    System.out.print("Escolha o tipo: ");

                    int tipo = sc.nextInt();

                    System.out.print("Digite o ID: ");
                    long id = sc.nextLong();

                    sc.nextLine();

                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite a idade: ");
                    int idade = sc.nextInt();

                    System.out.print("Digite o peso: ");
                    double peso = sc.nextDouble();

                    Animal animal;

                    if (tipo == 1) {
                        animal = new Gato(id, nome, idade, peso);
                    } else if (tipo == 2) {
                        animal = new Cachorro(id, nome, idade, peso);
                    } else if (tipo == 3) {
                        animal = new Passaro(id, nome, idade, peso);
                    } else {
                        System.out.println("Tipo de animal inválido.");
                        break;
                    }

                    if (zoologico.adicionarAnimal(animal)) {
                        System.out.println("Animal adicionado com sucesso!");
                    } else {
                        System.out.println("Já existe um animal com esse ID.");
                    }

                    break;

                case 2:
                    System.out.println("\n animais cadastrados");

                    if (zoologico.listarAnimais().isEmpty()) {
                        System.out.println("Nenhum animal cadastrado.");
                    } else {
                        for (Animal animalLista : zoologico.listarAnimais()) {
                            System.out.println(animalLista);
                            System.out.println("Som: " + animalLista.emitirSom());
                        }
                    }

                    break;

                case 3:
                    System.out.print("\nDigite o ID do animal que deseja remover: ");
                    long idRemover = sc.nextLong();

                    if (zoologico.removerAnimal(idRemover)) {
                        System.out.println("Animal removido com sucesso!");
                    } else {
                        System.out.println("Animal não encontrado.");
                    }

                    break;

                case 4:
                    System.out.print("\nDigite o ID do animal: ");
                    long idSom = sc.nextLong();

                    Animal animalSom = zoologico.buscarAnimal(idSom);

                    if (animalSom != null) {
                        System.out.println(
                                animalSom.getNome()
                                        + " diz "
                                        + animalSom.emitirSom()
                        );
                    } else {
                        System.out.println("Animal não encontrado.");
                    }

                    break;

                case 5:
                    System.out.print("\nDigite o ID do animal: ");
                    long idHabilidade = sc.nextLong();

                    sc.nextLine();

                    Animal animalHabilidade =
                            zoologico.buscarAnimal(idHabilidade);

                    if (animalHabilidade != null) {
                        System.out.print("Digite a habilidade: ");
                        String habilidade = sc.nextLine();

                        System.out.println(
                                animalHabilidade.realizarHabilidade(habilidade)
                        );
                    } else {
                        System.out.println("Animal não encontrado.");
                    }

                    break;

                case 6:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 6);

        sc.close();
    }
}