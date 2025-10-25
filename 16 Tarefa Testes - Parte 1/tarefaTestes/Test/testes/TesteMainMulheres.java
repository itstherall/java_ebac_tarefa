package testes;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import tarefaTestes.Pessoa;
import tarefaTestes.Main;



public class TesteMainMulheres {
	

	@Test
    public void deveFiltrarSomenteMulheres() {

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", "Feminino"));
        pessoas.add(new Pessoa("João", "Masculino"));
        pessoas.add(new Pessoa("Maria", "Feminino"));

        List<Pessoa> mulheres = Main.filtrarMulheres(pessoas);

        // Verifica se só há mulheres
        for (Pessoa p : mulheres) {
            Assert.assertEquals("Feminino", p.genero);
        }

        // Verifica se a quantidade de mulheres está correta
        Assert.assertEquals(2, mulheres.size());
    }
}
