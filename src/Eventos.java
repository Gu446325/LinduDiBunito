public class Eventos {

    private int idEvento = 0;
    private String nome;
    private String data;
    private Organizador organizador;
    private int limiteParticipante;
    private String dataHora;
    private String localizacao;

    // Construtores
	public Eventos(String nome, String data,String dataHora, String localizacao, int limiteParticipante) {
		this.nome = nome;
		this.data = data;
		this.dataHora = dataHora;
		this.localizacao = localizacao;
		this.limiteParticipante = limiteParticipante;
	}

	// getters e setters
	Integer getIdEvento() {
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
		if (getIdEvento() != 0){
			System.out.println("ID do Evento: " + getIdEvento());
		}
		if (getNome() != null){
			System.out.println("Nome do Evento: " + getNome());
		}
		if (getData() != null){
			System.out.println("Data do Evento: " + getData());
		}
		if (getOrganizador() != null){
			System.out.println("Organizador do Evento: " + getOrganizador().getNome());
		}
		if (getLimiteParticipante() != 0){
			System.out.println("Limite de Participantes do Evento: " + getLimiteParticipante());
		}
		if (getDataHora() != null){
			System.out.println("Data e Hora do Evento: " + getDataHora());
		}
		if (getLocalizacao() != null){
			System.out.println("Localizacao do Evento: " + getLocalizacao());
		}

    }
}