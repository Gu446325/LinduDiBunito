public class Inscricao {
	private static int idAtual = 0;
	private String nomeParticipante;
	private String nomeOrganizador;
    private int id;
    private double valor;


    // Construtores
	public Inscricao(String nomeParticipante, String nomeOrganizador, double valor) {
		this.id = idAtual++;
		this.nomeParticipante = nomeParticipante;
		this.nomeOrganizador = nomeOrganizador;
		this.valor = valor;
	}
	
	//getters e setters
	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getNomeParticipante() {
		return nomeParticipante;
	}

	void setNomeParticipante(String nomeParticipante) {
		this.nomeParticipante = nomeParticipante;
	}

	String getNomeOrganizador() {
		return nomeOrganizador;
	}

	void setNomeOrganizador(String nomeOrganizador) {
		this.nomeOrganizador = nomeOrganizador;
	}

	double getValor() {
		return valor;
	}

	void setValor(double valor) {
		this.valor = valor;
	}

	public void exibirInformacoes() {
        System.out.println("ID da Inscrição: " + id);
        System.out.println("Participante: " + nomeParticipante);
        System.out.println("Organizador: " + nomeOrganizador);
        System.out.println("Valor: " + valor);
    }
}