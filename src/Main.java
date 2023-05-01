import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Declaração de objetos
        Scanner leitura = new Scanner(System.in);
        Clientes cliente = new Clientes();
        Calculo calculo = new Calculo();

        // Input e armazenamento de dados do objeto
        System.out.println("\nCadastre o nome ou razão social do cliente: ");
        cliente.nomeOuRazaoSocial = leitura.nextLine();
        System.out.println("Cadastre o CPF ou CNPJ do cliente: ");
        cliente.cpfOuCnpj = leitura.nextLine();
        System.out.println("Insira a idade da pessoa ou tempo de funcionamento da empresa: ");
        cliente.idadeOuTempoDeFuncionamento = leitura.nextByte();

        // Declaração de variável e validação de permissão
        String status = calculo.retornaStatusPermissao(cliente.retornaIdade());

        // Exibição de mensagem genéria ao usuário
        String mensagem = """
                          \n##################################################
                          O cliente: %s;
                          Cujo documento é: %s;
                          Com idade/funcionamento de: %s anos;
                          Possui status permissional de: %s.
                          ##################################################""".formatted(cliente.nomeOuRazaoSocial,
                                                                                          cliente.cpfOuCnpj,
                                                                                          cliente.idadeOuTempoDeFuncionamento,
                                                                                          status);

        System.out.println(mensagem);
    }
}