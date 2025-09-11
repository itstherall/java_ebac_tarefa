package main;

import javax.swing.JOptionPane;
import main.dao.ClienteMapDAO;
import main.dao.IClienteDAO;
import main.domain.Cliente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 14the
 */
public class Main {
    
     public static void main(String[] args) {
     
         TelaPrincipal tela = new TelaPrincipal();
         tela.setVisible(true);
     
     }
     
    /** 
     private static IClienteDAO IClienteDAO;

    public static void main(String[] args) {
	
	IClienteDAO = new ClienteMapDAO();

	String opcao = JOptionPane.showInputDialog(null,
		"Digite 1 - Cadastro, " + "2 - Consulta, " + "3 - Excluir, 4 - Alterar, 5 - Sair", "CADASTRO",
		JOptionPane.INFORMATION_MESSAGE);

	while (!isOpcaoValida(opcao)) {
	    if ("".equals(opcao)) {
		sair();
	    }
	    opcao = JOptionPane.showInputDialog(
			    null, "Opção inválida, por favor" + "digite 1 - Cadastro, 2 - "
				    + "Consulta, 3 - Excluir,4 - " + "Alterar, 5 - Sair",
			    "Digita Opcao Valida", JOptionPane.INFORMATION_MESSAGE);
	}
	
	while(isOpcaoValida(opcao)) {
	    
	    if(isOpcaoSair(opcao)) {
		sair();
		
	    } else if (isCadastro(opcao)) {
		
		//CADASTRAR
		String dados = JOptionPane.showInputDialog(null,"Digite os dados separados por vírgula conforme o exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade, Estado", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
		cadastrar(dados);
		
	    } else if (isConsultar(opcao)) {
		String cpf = JOptionPane.showInputDialog(null, "Digite o cpf: ", "Consultar", JOptionPane.INFORMATION_MESSAGE);
		 
		consultar(cpf);
	    }
	    
	    opcao = JOptionPane.showInputDialog(
		    null, "Opção inválida, por favor" + "digite 1 - Cadastro, 2 - "
			    + "Consulta, 3 - Excluir,4 - " + "Alterar, 5 - Sair",
		    "Digita Opcao Valida", JOptionPane.INFORMATION_MESSAGE);
	    
	}
    }

    

    private static void consultar(String cpf) {
	// TODO Auto-generated method stub
	Cliente cliente = IClienteDAO.consultar(Long.parseLong(cpf));
	
	if(cliente != null) {
	    JOptionPane.showMessageDialog(null, "Cliente encontrado: " + cliente.toString(), "sucesso", JOptionPane.INFORMATION_MESSAGE);
	} else {
	    JOptionPane.showMessageDialog(null, "Cliente encontrado não encontrado." , "sucesso", JOptionPane.INFORMATION_MESSAGE);
	}
    }



    private static boolean isConsultar(String opcao) {
	if("2".equals(opcao)) {
	    return true;
	}
	return false;
    }



    private static void cadastrar(String dados) {
	String[] dadosSeparados = dados.split(",");
	
	String nome = toNullIfEmpty(dadosSeparados[0]);
	Long cpf = toLongOrNull(dadosSeparados[1]);
	Long telefone = toLongOrNull(dadosSeparados[2]);
	String endereco = toNullIfEmpty(dadosSeparados[3]);
	Integer numero = toIntegerOrNull(dadosSeparados[4]);
	String cidade = toNullIfEmpty(dadosSeparados[5]);
	String estado = toNullIfEmpty(dadosSeparados[6]);
	
	
	Cliente cliente = new Cliente(nome, cpf, telefone, endereco, numero, cidade, estado);
	Boolean isCadastrado = IClienteDAO.cadastrar(cliente);
	
	if(isCadastrado) {
	    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso", "sucesso", JOptionPane.INFORMATION_MESSAGE);
	} else {
	    JOptionPane.showMessageDialog(null, "Cliente JÁ SE ENCONTRA cadastrado com sucesso", "ja cadastrado", JOptionPane.INFORMATION_MESSAGE);
	}
    }

    
    private static String toNullIfEmpty(String valor) {
	return (valor == null || "".equals(valor)) ? "N/A" : valor.trim();
    }

    private static Integer toIntegerOrNull(String valor) {
	return (valor == null ||  "".equals(valor)) ? 0 : Integer.parseInt(valor.trim());
    }

    private static Long toLongOrNull(String valor) {
	return (valor == null ||  "".equals(valor)) ? 0 : Long.parseLong(valor.trim());
    }

    private static boolean isCadastro(String opcao) {
	if("1".equals(opcao)) {
	    return true;
	}
	return false;
    }

    private static boolean isOpcaoSair(String opcao) {
	// TODO Auto-generated method stub
	if("5".equals(opcao)) {
	    return true;
	}
	
	return false;
    }

    private static void sair() {
	JOptionPane.showMessageDialog(null, "Até logo", "mensagem de sair", JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao) {
	// TODO Auto-generated method stub

	if ("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)) {

	    return true;
	}

	return false;
    }
     **/
}
