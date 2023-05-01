public class Calculo {
    // Declaração de constantes
    String NAO_PERMITIDO = "Não permitido!";
    String PERMITIDO_PARCIALMENTE = "Permitido Parcialmente!";
    String PERMITIDO = "Permitido!";

    // Declaração de variável
    String retorno;

    // Declaração de método que retorna status de permissão
    String retornaStatusPermissao (byte idade) {
        if (idade <= 17) {
            retorno = NAO_PERMITIDO;
        } else if (idade > 17 && idade <= 23) {
            retorno = PERMITIDO_PARCIALMENTE;
        } else {
            retorno = PERMITIDO;
        }
        return retorno;
    }
}
