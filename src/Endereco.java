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

    // Getters
    public String getRuaEndereco() {
        return ruaEndereco;
    }

    public String getNumeroEndereco() {
        return numeroEndereco;
    }

    public String getCidadeEndereco() {
        return cidadeEndereco;
    }

    public String getEnderecoCompletoPessoa() {
        return ruaEndereco + ", " + numeroEndereco + " - " + cidadeEndereco;
    }
}
