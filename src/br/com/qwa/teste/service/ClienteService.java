package br.com.qwa.teste.service;

import java.util.Collection;

import br.com.qwa.teste.domain.Cliente;
import br.com.qwa.teste.domain.Risco;

public interface ClienteService {

	/**
	 * Converte uma lista de Strings posicionais para uma lista de objetos do tipo Cliente.
	 * 
	 * A entrada desse método irá receber uma collection de Strings, onde cada String é composta por informações posicionais de um cliente.
	 *
	 * Cada String da lista é composta por:
	 * 
	 * 1) Nome - 20 posições
	 * 2) CPF OU CNPJ - 14 posições
	 * 3) Idade - 2 posições
	 * 
	 * Ex: "JOAO DE SOUZA       06745178964   57"
	 * 
	 * A informação "risco" do objeto Cliente deverá ser calculada através da regra abaixo:  
	 * 
	 * [Risco]
	 * 		NAO_APLICAVEL: Para idade até 17 anos.
	 *      RISCO_MODERADO: Entre 18 e 23 anos.
	 *      RISCO_BAIXO: A partir de 24 anos.
	 *      
	 * @param lista - lista de Strings posicionais
	 * @return Uma lista de clientes
	 */
	public Collection<Cliente> converterStringParaCliente(final Collection<String> lista);
	
	/**
	 * Filtrar a lista de clientes de acordo com o parâmetro risco
	 * 
	 * @param clientes - lista de clientes
	 * @param risco - risco solicitado
	 * @return Uma lista filtrada contendo apenas os clientes que possuem o risco solicitado
	 */
	public Collection<Cliente> filtrarClientesPorRisco(Collection<Cliente> clientes, Risco risco);
	
}
