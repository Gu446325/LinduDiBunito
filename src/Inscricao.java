public class Inscricao {

    private int id;
    private Participantes participante;
    private Organizador organizador;
    private double valor;

    // Construtores, getters e setters

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	Participantes getParticipante() {
		return participante;
	}

	void setParticipante(Participantes participante) {
		this.participante = participante;
	}

	Organizador getOrganizador() {
		return organizador;
	}

	void setOrganizador(Organizador organizador) {
		this.organizador = organizador;
	}

	double getValor() {
		return valor;
	}

	void setValor(double valor) {
		this.valor = valor;
	}

	public void exibirInformacoes() {
        System.out.println("ID da Inscrição: " + id);
        System.out.println("Participante: " + participante.getNome());
        System.out.println("Organizador: " + organizador.getNome());
        System.out.println("Valor: " + valor);
    }
}