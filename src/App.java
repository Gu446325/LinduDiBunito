import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Participantes participante = new Participantes();
        participante.setId(1);
        participante.setNome("João");
        participante.setIdade(25);

        Organizador organizador = new Organizador();
        organizador.setId(1);
        organizador.setNome("Maria");
        organizador.setIdade(30);

        Eventos evento = new Eventos();
        evento.setIdEvento(1);
        evento.setNome("Conferência Java");
        evento.setData("2023-01-01");
        evento.setOrganizador(organizador);
        evento.setLimiteParticipante(100);
        evento.setDataHora("2023-01-01 10:00");
        evento.setLocalizacao("Local X");

        Inscricao inscricao = new Inscricao();
        inscricao.setId(1);
        inscricao.setParticipante(participante);
        inscricao.setOrganizador(organizador);
        inscricao.setValor(50.0);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Exibir Informações do Participante");
            System.out.println("2. Exibir Informações do Organizador");
            System.out.println("3. Exibir Informações do Evento");
            System.out.println("4. Exibir Informações da Inscrição");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    participante.exibirInformacoes();
                    break;

                case 2:
                    organizador.exibirInformacoes();
                    break;

                case 3:
                    evento.exibirInformacoes();
                    break;

                case 4:
                    inscricao.exibirInformacoes();
                    break;

                case 0:
                    System.out.println("Saindo do programa. Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
