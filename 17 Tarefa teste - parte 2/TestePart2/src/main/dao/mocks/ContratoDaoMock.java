package main.dao.mocks;

import main.dao.IContratoDao;

public class ContratoDaoMock implements IContratoDao {

	/*
	 * objeto nullo apenas para poder implementar os testes unitarios simples para nao utilizar ContratoDAO
	 * só para simular 
	 * 
	 * a  interface fica com as duas implemetações (uma para testes e outra para o código devido)
	 */
	
    @Override
    public void salvar() {
    	return;
    }

	@Override
	public void buscar() {	
		return;
	}

	@Override
	public void excluir() {
		return;
	}

	@Override
	public void atualizar() {
		return;
	}
}
