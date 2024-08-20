import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scannerPessoa = new Scanner(System.in);
        ArrayList<Pessoa> listaPessoas = new ArrayList<>(); // Lista para armazenar as pessoas

        String opcao;
        do {
            Pessoa pessoa = new Pessoa();
            Endereco endereco = new Endereco();

            // Coletando dados da pessoa
            System.out.print("Informe o nome da pessoa: ");
            pessoa.setNomePessoa(scannerPessoa.nextLine());
            System.out.print("Informe a idade da pessoa: ");
            pessoa.setIdadePessoa(scannerPessoa.nextInt());
            scannerPessoa.nextLine(); // Consumir a nova linha pendente

            // Coletando dados do endereço
            System.out.print("Informe a rua da casa da pessoa: ");
            String rua = scannerPessoa.nextLine();
            System.out.print("Informe o número da casa da pessoa: ");
            String numero = scannerPessoa.nextLine();
            System.out.print("Informe a cidade em que reside a pessoa: ");
            String cidade = scannerPessoa.nextLine();

            endereco.setEnderecoPessoa(rua, numero, cidade);
            pessoa.setEnderecoPessoa(endereco);

            // Adicionando a pessoa à lista
            listaPessoas.add(pessoa);

            // Perguntar se deseja adicionar outra pessoa
            System.out.print("Deseja adicionar outra pessoa? (s/n): ");
            opcao = scannerPessoa.nextLine();
        } while (opcao.equalsIgnoreCase("s"));

        // Exibindo todas as pessoas e seus endereços
        System.out.println("\n--- Dados das Pessoas Cadastradas ---");
        for (Pessoa p : listaPessoas) {
            System.out.println("Nome: " + p.getNomePessoa());
            System.out.println("Idade: " + p.getIdadePessoa());
            System.out.println("Endereço: " + p.getEnderecoPessoa().getEnderecoCompletoPessoa());
            System.out.println("-----------------------------");
        }

        // Fechamento do Scanner
        scannerPessoa.close();
    }
}