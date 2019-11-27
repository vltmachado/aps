package abstractFactory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TelaProjetoTest {

	@Test
	void CriaTela() {
		TelaProjeto t = new TelaProjeto();
		t.setFabrica(new FabricaWindows());
		t.montar();
		assertEquals("Janela Windows(MenuWindows, BotãoWindows)", t.desenhar());

	}

}
