public class Participantes {

    private int id;
    private String nome;
    private int idade;

    // Construtores

	public Participantes(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	// Getters e Setters
	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getNome() {
		return nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	int getIdade() {
		return idade;
	}

	void setIdade(int idade) {
		this.idade = idade;
	}

	public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}