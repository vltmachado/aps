package abstractFactory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TelaProjetoTest {

	@Test
	void CriaTelaWindows() {
		TelaProjeto t = new TelaProjeto();
		t.setFabrica(new FabricaWindows());
		t.montar();
		assertEquals("Janela Windows{Menu Windows,Bot�o Windows}", t.desenhar());

	}
	
	@Test
	void CriaTelaAndroid() {
		TelaProjeto t = new TelaProjeto();
		t.setFabrica(new FabricaAndroid());
		t.montar();
		assertEquals("Janela Android{Menu Android,Bot�o Android}", t.desenhar());

	}


}
