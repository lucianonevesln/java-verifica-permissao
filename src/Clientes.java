public class Clientes {
    // Declaração de características do cliente
    String nomeOuRazaoSocial;
    String cpfOuCnpj;
    byte idadeOuTempoDeFuncionamento;

    // Declaração de método que apresenta dados do cliente
    byte retornaIdade () {
        return this.idadeOuTempoDeFuncionamento;
    }
}
