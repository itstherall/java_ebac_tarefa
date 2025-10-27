package main.service;

/**
 * @author rodrigo.pires
 */
public interface IContratoService {
    String salvar();

    /*
     * todos os metodos implementados retornar uma strig verbo(inf) + com Sucesso
     * imlementado de forma simles para focar nos testes!
     * */
    
    String buscarContrato();
    String excluirContrato();
    String atualizarContrato();
}
