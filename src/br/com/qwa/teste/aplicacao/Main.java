package br.com.qwa.teste.aplicacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import br.com.qwa.teste.domain.Cliente;
import br.com.qwa.teste.domain.Risco;
import br.com.qwa.teste.service.ClienteService;

public class Main {

	/**
	 * Exerc�cio: Criar uma implementa��o da interface {@link ClienteService} e incluir o m�todo abaixo para 
	 */
	public static void main(String[] args) {

		ClienteService clienteService = null; // TODO criar uma inst�ncia da implementa��o do ClienteService (Ex: ClienteServiceImpl)
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente();

		Collection<String> strings = new ArrayList<String>();
		strings.add("JOAO DE SOUZA       06745178964   57");
		strings.add("ROBSON MARTINS      47856712309   17");
		strings.add("RODRIGO DA SILVA    32745874165   21");

		ArrayList<String> listaClientes = new ArrayList<>();
		listaClientes = List.of(strings.toArray());

		for (int elemento = 0; elemento < listaClientes.size(); elemento++) {
			String cliente = (String) listaClientes.get(elemento);
			System.out.println(cliente);
		}

		Collection<Cliente> clientes = clienteService.converterStringParaCliente(strings);
		imprimirClientes(clientes);
		
		Collection<Cliente> clientesRiscoNaoAplicavel = clienteService.filtrarClientesPorRisco(clientes, Risco.NAO_APLICAVEL);
		imprimirClientes(clientesRiscoNaoAplicavel);
		
		Collection<Cliente> clientesRiscoBaixo = clienteService.filtrarClientesPorRisco(clientes, Risco.RISCO_BAIXO);
		imprimirClientes(clientesRiscoBaixo);
		
		Collection<Cliente> clientesRiscoModerado = clienteService.filtrarClientesPorRisco(clientes, Risco.RISCO_MODERADO);
		imprimirClientes(clientesRiscoModerado);
	}
	
	private static void imprimirClientes(Collection<Cliente> clientes) {
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
	}
}
