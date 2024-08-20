// Class Pessoa para encapsular os dados da pessoa
class Pessoa {
    private String nomePessoa;
    private int idadePessoa;
    private Endereco enderecoPessoa;

    // Setter para definir o nome da pessoa
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    // Getter para obter o nome da pessoa
    public String getNomePessoa() {
        return nomePessoa;
    }

    // Setter para definir a idade da pessoa
    public void setIdadePessoa(int idadePessoa) {
        this.idadePessoa = idadePessoa;
    }

    // Getter para obter a idade da pessoa
    public int getIdadePessoa() {
        return idadePessoa;
    }

    // Setter para definir o endereço da pessoa
    public void setEnderecoPessoa(Endereco enderecoPessoa) {
        this.enderecoPessoa = enderecoPessoa;
    }

    // Getter para obter o endereço da pessoa
    public Endereco getEnderecoPessoa() {
        return enderecoPessoa;
    }
}