package abstractFactory;

public class FabricaAndroid implements FabricaAbstrata {

	@Override
	public Janela criarJanela() {
		return new JanelaAndroid();
	}

	@Override
	public Menu criarMenu() {
		return new MenuAndroid();
	}

	@Override
	public Botao criarBotao() {
		return new BotaoAndroid();
	}

}
