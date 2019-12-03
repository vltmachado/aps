package abstractFactory;

public class TelaProjeto {

	private FabricaAbstrata fabricaAbstrata;
	private Janela janela;
	private Menu menu;
	private Botao botao;

	public void setFabrica(FabricaAbstrata fabrica) {
		this.fabricaAbstrata = fabrica;

		
	}

	public void montar() {
		janela=this.fabricaAbstrata.criarJanela();
		menu=this.fabricaAbstrata.criarMenu();
		botao=this.fabricaAbstrata.criarBotao();
		

		
	}

	public String desenhar() {
		
		return janela.desenhar()+"{"+menu.desenhar()+","+botao.desenhar()+"}";
	}



	

}
