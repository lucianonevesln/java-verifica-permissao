package br.com.qwa.teste.service;

import java.util.Collection;

import br.com.qwa.teste.domain.Cliente;
import br.com.qwa.teste.domain.Risco;

public interface ClienteService {

	/**
	 * Converte uma lista de Strings posicionais para uma lista de objetos do tipo Cliente.
	 * 
	 * A entrada desse m�todo ir� receber uma collection de Strings, onde cada String � composta por informa��es posicionais de um cliente.
	 *
	 * Cada String da lista � composta por:
	 * 
	 * 1) Nome - 20 posi��es
	 * 2) CPF OU CNPJ - 14 posi��es
	 * 3) Idade - 2 posi��es
	 * 
	 * Ex: "JOAO DE SOUZA       06745178964   57"
	 * 
	 * A informa��o "risco" do objeto Cliente dever� ser calculada atrav�s da regra abaixo:  
	 * 
	 * [Risco]
	 * 		NAO_APLICAVEL: Para idade at� 17 anos.
	 *      RISCO_MODERADO: Entre 18 e 23 anos.
	 *      RISCO_BAIXO: A partir de 24 anos.
	 *      
	 * @param lista - lista de Strings posicionais
	 * @return Uma lista de clientes
	 */
	public Collection<Cliente> converterStringParaCliente(final Collection<String> lista);
	
	/**
	 * Filtrar a lista de clientes de acordo com o par�metro risco
	 * 
	 * @param clientes - lista de clientes
	 * @param risco - risco solicitado
	 * @return Uma lista filtrada contendo apenas os clientes que possuem o risco solicitado
	 */
	public Collection<Cliente> filtrarClientesPorRisco(Collection<Cliente> clientes, Risco risco);
	
}
