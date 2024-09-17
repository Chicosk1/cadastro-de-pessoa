class Endereco {
    private String ruaEndereco;
    private String numeroEndereco;
    private String cidadeEndereco;

    // Construtor para definir os dados do endereço
    public void setEnderecoPessoa(String ruaEndereco, String numeroEndereco, String cidadeEndereco) {
        this.ruaEndereco = ruaEndereco;
        this.numeroEndereco = numeroEndereco;
        this.cidadeEndereco = cidadeEndereco;
    }

    // Getter para obter os dados do endereço
    public String getRuaEndereco() {
        return ruaEndereco;
    }

    public String getNumeroEndereco() {
        return numeroEndereco;
    }

    public String getCidadeEndereco() {
        return cidadeEndereco;
    }

    // Getter para obter o endereço completo
    public String getEnderecoCompletoPessoa() {
        return ruaEndereco + ", " + numeroEndereco + " - " + cidadeEndereco;
    }
}
