/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author klz
 */

import models.CrudClientes;
import models.Cliente;

public class Main {

  public static void main(String[] args) {
    
    CrudClientes crudClientes = new CrudClientes();
    
    // Inserir cliente
    Cliente cliente = new Cliente();
    cliente.setNome("João");
    cliente.setNumero("999999999");
    
    crudClientes.salvar(cliente);
    
    // Listar clientes
    for(Cliente c : crudClientes.listar()) {
      System.out.println(c.getNome());
    }
    
    // Buscar cliente pelo ID
    Cliente clienteEncontrado = crudClientes.buscarPorId(1);
    System.out.println(clienteEncontrado.getNome());
    
    // Atualizar cliente
    clienteEncontrado.setNome("José");
    crudClientes.atualizarPorId(clienteEncontrado);
    
    // Excluir cliente
    crudClientes.excluirPorId(2);
    
  }

}