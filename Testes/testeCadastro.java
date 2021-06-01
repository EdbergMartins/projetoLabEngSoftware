import static org.junit.Assert.assertThat;


import org.junit.jupiter.api.Test;
import org.hamcrest.CoreMatchers.*;

import view.ViewCadastro;

class testeCadastro {

	@Test
	void test() {
		assertThat(ViewCadastro.checkEmail("edberg@hotmail.com.br"), is("1"));
	}

}
