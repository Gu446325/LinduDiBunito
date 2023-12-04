public class Eventos {

    private int idEvento;
    private String nome;
    private String data;
    private Organizador organizador;
    private int limiteParticipante;
    private String dataHora;
    private String localizacao;

    // Construtores, getters e setters

	int getIdEvento() {
		return idEvento;
	}

	void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}

	String getNome() {
		return nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	String getData() {
		return data;
	}

	void setData(String data) {
		this.data = data;
	}

	Organizador getOrganizador() {
		return organizador;
	}

	void setOrganizador(Organizador organizador) {
		this.organizador = organizador;
	}

	int getLimiteParticipante() {
		return limiteParticipante;
	}

	void setLimiteParticipante(int limiteParticipante) {
		this.limiteParticipante = limiteParticipante;
	}

	String getDataHora() {
		return dataHora;
	}

	void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	String getLocalizacao() {
		return localizacao;
	}

	void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public void exibirInformacoes() {
        System.out.println("ID do Evento: " + idEvento);
        System.out.println("Nome: " + nome);
        System.out.println("Data: " + data);
        System.out.println("Organizador: " + organizador.getNome());
        System.out.println("Limite de Participantes: " + limiteParticipante);
        System.out.println("Data e Hora: " + dataHora);
        System.out.println("Localização: " + localizacao);
    }
}