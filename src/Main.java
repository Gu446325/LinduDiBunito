import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Participantes> participantesList = new ArrayList<>();
        List<Organizador> organizadoresList = new ArrayList<>();
        List<Eventos> eventosList = new ArrayList<>();
        List<Inscricao> inscricoesList = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Participante");
            System.out.println("2. Adicionar Organizador");
            System.out.println("3. Adicionar Evento");
            System.out.println("4. Adicionar Inscricao");
            System.out.println("5. Exibir Informacoes do Participante");
            System.out.println("6. Exibir Informacoes do Organizador");
            System.out.println("7. Exibir Informacoes do Evento");
            System.out.println("8. Exibir Informacoes da Inscricao");
            System.out.println("9. Atualizar Informacoes do Participante");
            System.out.println("10. Atualizar Informacoes do Organizador");
            System.out.println("11. Atualizar Informacoes do Evento");
            System.out.println("12. Atualizar Informacoes da Inscricao");
            System.out.println("13. Excluir Participante");
            System.out.println("14. Excluir Organizador");
            System.out.println("15. Excluir Evento");
            System.out.println("16. Excluir Inscricao");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    participantesList.add(criarParticipante(scanner));
                    System.out.println("Participante adicionado com sucesso!");
                    break;

                case 2:
                    organizadoresList.add(criarOrganizador(scanner));
                    System.out.println("Organizador adicionado com sucesso!");
                    break;

                case 3:
                    eventosList.add(criarEvento(scanner));
                    System.out.println("Evento adicionado com sucesso!");
                    break;

                case 4:
                    inscricoesList.add(criarInscricao(scanner));
                    System.out.println("Inscricao adicionada com sucesso!");
                    break;

                case 5:
                    exibirInformacoes(participantesList);
                    break;

                case 6:
                    exibirInformacoes(organizadoresList);
                    break;

                case 7:
                    exibirInformacoes(eventosList);
                    break;

                case 8:
                    exibirInformacoes(inscricoesList);
                    break;

                case 9:
                    atualizarInformacoes(participantesList, scanner);
                    break;

                case 10:
                    atualizarInformacoes(organizadoresList, scanner);
                    break;

                case 11:
                    atualizarInformacoes(eventosList, scanner);
                    break;

                case 12:
                    atualizarInformacoes(inscricoesList, scanner);
                    break;

                case 13:
                    excluirElemento(participantesList, "Participante");
                    break;

                case 14:
                    excluirElemento(organizadoresList, "Organizador");
                    break;

                case 15:
                    excluirElemento(eventosList, "Evento");
                    break;

                case 16:
                    excluirElemento(inscricoesList, "Inscricao");
                    break;

                case 0:
                    System.out.println("Saindo do programa. Ate mais!");
                    break;

                default:
                    System.out.println("Opcao invalida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    // Métodos de adição para cada classe
    private static Participantes criarParticipante(Scanner scanner) {
        System.out.print("Nome do Participante: ");
        String nome = (scanner.next());
        System.out.print("Idade do Participante: ");
        int idade = (scanner.nextInt());
        Participantes participante = new Participantes(nome, idade);
        return participante;
    }

    public static Organizador criarOrganizador(Scanner scanner) {
        System.out.print("Nome do Organizador: ");
        String nome = (scanner.next());
        System.out.print("Idade do Organizador: ");
        int idade = (scanner.nextInt());
        Organizador organizador = new Organizador(nome, idade);
        return organizador;
    }

    private static Eventos criarEvento(Scanner scanner) {
        System.out.print("Nome do Evento: ");
        String nome = (scanner.next());
        System.out.print("Data do Evento: ");
        String data = (scanner.next());
        System.out.print("Hora do Evento: ");
        String datahora = (scanner.next());
        System.out.print("Localizacao do Evento: ");
        String localizacao = (scanner.next());
        System.out.print("Limite de Participantes do Evento: ");
        int limite = (scanner.nextInt());        
        Eventos evento = new Eventos(nome,data, datahora, localizacao, limite);
        return evento;
    }

    private static Inscricao criarInscricao(Scanner scanner) {
        System.out.print("Nome do Participante: ");
        String nomeParticipante = (scanner.next());
        System.out.print("Nome do Organizador: ");
        String nomeOrganizador = (scanner.next());
        System.out.print("Valor da Inscricao: ");
        double valor = (scanner.nextDouble());
        Inscricao inscricao = new Inscricao(nomeParticipante, nomeOrganizador, valor);
        return inscricao;   
    }

    // Método para exibir informações de uma lista de objetos
    private static <T> void exibirInformacoes(List<T> lista) {
        for (T elemento : lista) {
             System.out.println("---------------------");
            if (elemento instanceof Participantes) {
                ((Participantes) elemento).exibirInformacoes();
            } else if (elemento instanceof Organizador) {
                ((Organizador) elemento).exibirInformacoes();
            } else if (elemento instanceof Eventos) {
                ((Eventos) elemento).exibirInformacoes();
            } else if (elemento instanceof Inscricao) {
                ((Inscricao) elemento).exibirInformacoes();
            }
            System.out.println("---------------------");
        }
    }

    // Método para atualizar informações de uma lista de objetos
    private static <T> void atualizarInformacoes(List<T> lista, Scanner scanner) {
        System.out.print("Digite o ID do elemento a ser atualizado: ");
        int idAtualizar = scanner.nextInt();

        for (T elemento : lista) {
            if (elemento instanceof Participantes && ((Participantes) elemento).getId() == idAtualizar) {
                atualizarElemento((Participantes) elemento, scanner);
            } else if (elemento instanceof Organizador && ((Organizador) elemento).getId() == idAtualizar) {
                atualizarElemento((Organizador) elemento, scanner);
            } else if (elemento instanceof Eventos && ((Eventos) elemento).getIdEvento() == idAtualizar) {
                atualizarElemento((Eventos) elemento, scanner);
            } else if (elemento instanceof Inscricao && ((Inscricao) elemento).getId() == idAtualizar) {
                atualizarElemento((Inscricao) elemento, scanner);
            }
        }
    }

    // Método para atualizar informações de um objeto específico
    private static void atualizarElemento(Participantes participante, Scanner scanner) {
        System.out.print("Novo Nome do Participante: ");
        participante.setNome(scanner.next());
        System.out.print("Nova Idade do Participante: ");
        participante.setIdade(scanner.nextInt());
        System.out.println("Informações do Participante atualizadas com sucesso!");
    }

    private static void atualizarElemento(Organizador organizador, Scanner scanner) {
        System.out.print("Novo Nome do Organizador: ");
        organizador.setNome(scanner.next());
        System.out.print("Nova Idade do Organizador: ");
        organizador.setIdade(scanner.nextInt());
        System.out.println("Informações do Organizador atualizadas com sucesso!");
    }

    private static void atualizarElemento(Eventos evento, Scanner scanner) {
        System.out.print("Novo Nome do Evento: ");
        evento.setNome(scanner.next());
        System.out.print("Nova Data e Hora do Evento: ");
        evento.setDataHora(scanner.next());
        System.out.print("Nova Localizacaoo do Evento: ");
        evento.setLocalizacao(scanner.next());
        System.out.println("Informacoes do Evento atualizadas com sucesso!");
    }

    private static void atualizarElemento(Inscricao inscricao, Scanner scanner) {
        System.out.print("Novo Nome do Participante: ");
        inscricao.setNomeParticipante(scanner.next());
        System.out.print("Novo Nome do Organizador: ");
        inscricao.setNomeOrganizador(scanner.next());
        System.out.print("Novo Valor da Inscrição: ");
        inscricao.setValor(scanner.nextDouble());
        System.out.println("Informações da Inscricao atualizadas com sucesso!");
    }

    // Método para excluir um elemento de uma lista
    private static <T> void excluirElemento(List<T> lista, String tipoElemento) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ID do " + tipoElemento + " a ser excluido: ");
        int idExcluir = scanner.nextInt();

        for (T elemento : lista) {
            if (elemento instanceof Participantes && ((Participantes) elemento).getId() == idExcluir) {
                lista.remove(elemento);
                System.out.println(tipoElemento + " excluido com sucesso!");
                return;
            } else if (elemento instanceof Organizador && ((Organizador) elemento).getId() == idExcluir) {
                lista.remove(elemento);
                System.out.println(tipoElemento + " excluido com sucesso!");
                return;
            } else if (elemento instanceof Eventos && ((Eventos) elemento).getIdEvento() == idExcluir) {
                lista.remove(elemento);
                System.out.println(tipoElemento + " excluido com sucesso!");
                return;
            } else if (elemento instanceof Inscricao && ((Inscricao) elemento).getId() == idExcluir) {
                lista.remove(elemento);
                System.out.println(tipoElemento + " excluido com sucesso!");
                return;
            }
        }

        System.out.println(tipoElemento + " nao encontrado.");
    }
}
