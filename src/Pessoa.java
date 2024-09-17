class Pessoa {
    private String nomePessoa;
    private int idadePessoa;
    private Endereco enderecoPessoa;

    // Setters
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    
    public void setIdadePessoa(int idadePessoa) {
        this.idadePessoa = idadePessoa;
    }
    
    public void setEnderecoPessoa(Endereco enderecoPessoa) {
        this.enderecoPessoa = enderecoPessoa;
    }

    // Getters
    public String getNomePessoa() {
        return nomePessoa;
    }
    
    public int getIdadePessoa() {
        return idadePessoa;
    }

    public Endereco getEnderecoPessoa() {
        return enderecoPessoa;
    }
}
