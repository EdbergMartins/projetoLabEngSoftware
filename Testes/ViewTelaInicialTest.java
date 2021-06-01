

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import view.ViewCadastro;

@SuppressWarnings("unused")
class ViewTelaInicialTest {
	
	@Test
	void testNome() {
		ViewCadastro cad = new ViewCadastro();
		boolean nome = cad.checkNome2("Edberg Nóbrega de Medeiros Martins");
		assertTrue(nome);
	}
	
	@Test
	void testCPF() {
		ViewCadastro cad = new ViewCadastro();
		boolean cpf = cad.checkCpf("05402055408");
		assertTrue(cpf);
	}
	
	@Test
	void testSenha() {
		ViewCadastro cad = new ViewCadastro();
		boolean senha = cad.checkSenha("12345");
		assertTrue(senha);
	}

	@Test
	void testEmail() {
		ViewCadastro cad = new ViewCadastro();
		boolean email = cad.checkEmail("Edberg@gmail.com");
		assertTrue(email);
	}


}
