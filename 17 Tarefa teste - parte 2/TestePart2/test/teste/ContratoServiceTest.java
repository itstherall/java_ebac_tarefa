package teste;

import org.junit.Assert;
import org.junit.Test;

import main.dao.ContratoDao;
import main.dao.IContratoDao;
import main.dao.mocks.ContratoDaoMock;
import main.service.*;


public class ContratoServiceTest {

	// TESTE DE SALVAR
    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    // TESTE DE BUSCAR
    @Test
    public void buscarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscarContrato();
        Assert.assertEquals("Buscar com Sucesso", retorno);
    }
    
    @Test (expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscarContrato();
        Assert.assertEquals("Buscar com Sucesso", retorno);
    }
    
 // TESTE DE EXCLUIR
    @Test
    public void excluirTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluirContrato();
        Assert.assertEquals("Excluir com Sucesso", retorno);
    }
    
    @Test (expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluirContrato();
        Assert.assertEquals("Excluir com Sucesso", retorno);
    }
    
    
    // TESTE DE ATUALIZAR
    @Test
    public void atualizarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizarContrato();
        Assert.assertEquals("Atualizar com Sucesso", retorno);
    }
    
    @Test (expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizarContrato();
        Assert.assertEquals("Atualizar com Sucesso", retorno);
    }
}
    
   
