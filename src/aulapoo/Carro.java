package aulapoo;

public class Carro extends Veiculo{
	public void ligar() {
		confereCambio();
		confereCombustivel();
		System.out.println("Carro ligado");
	}
	
	private void confereCombustivel() {
		System.out.println("Conferindo combust�vel");
	}
	
	private void confereCambio() {
		System.out.println("Conferindo c�mbio em P");
	}
}
