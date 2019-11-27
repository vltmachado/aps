package abstractFactory;

public class TelaProjeto {

	private FabricaWindows fabricaWindows;

	public void setFabrica(FabricaWindows fabricaWindows) {
		this.setFabricaWindows(fabricaWindows);

		
	}

	public void montar() {
		// TODO Auto-generated method stub
		
	}

	public String desenhar() {
		// TODO Auto-generated method stub
		return null;
	}

	public FabricaWindows getFabricaWindows() {
		return fabricaWindows;
	}

	public void setFabricaWindows(FabricaWindows fabricaWindows) {
		this.fabricaWindows = fabricaWindows;
	}



	

}
