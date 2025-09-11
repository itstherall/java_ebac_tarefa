/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.dao;

import java.util.Collection;
import main.domain.Cliente;

/**
 *
 * @author 14the
 */
public interface IClienteDAO {
	
	public Boolean cadastrar(Cliente cliente);
	
	public void excluir(Long cpf);
	
	public void alterar(Cliente cliente);
	
	public Cliente consultar(Long cpf);
	
	public Collection<Cliente> buscarTodos();

        public void alterar(Cliente teste, String nome, Long tel, String end, Integer num, String cidade, String estado);
}
