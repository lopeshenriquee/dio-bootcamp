package aulaenums.sistemaIbge;

public class SistemaIbge {
	public static void main(String[] args) {
		//imprimindo os estados existentes no enum
		for(EstadoBrasileiro uf: EstadoBrasileiro.values() ) {
		   System.out.println(uf.getSigla() + "-" + uf.getNomeMaiusculo());
		}
		
		//selecionando um estado a partir das op��es dispon�veis
		EstadoBrasileiro ufSelecionado = EstadoBrasileiro.CEARA;
		
		System.out.println("O estado selecionado foi: " + ufSelecionado.getNome() + " de c�digo: " + ufSelecionado.getIbge());
	}
}
