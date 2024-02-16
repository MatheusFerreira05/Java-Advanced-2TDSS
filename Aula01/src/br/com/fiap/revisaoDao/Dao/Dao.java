package br.com.fiap.revisaoDao.Dao;

import java.util.List;

import br.com.fiap.revisao.model.Produto;

//Interface: o contrato que define os métodos que as classes devem implementar
//Interfaces servem para diminuir o acomplamento entre os objetos


public interface Dao {
	
	void cadastrar(Produto produto);
	
	List<Produto> listar();

}
