package aulapoo.sistemamensagem;

/*
 * Simula��o do uso da classe MSNMessenger
 */
public class ComputadorPedrinho {
	public static void main(String[] args) {
		ServicoMensagemInstantanea smi = null;

		/*
		 * N�O SE SABE QUAL APP MAS QUALQUER UM DEVER� ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido = "???";

		if (appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if (appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if (appEscolhido.equals("tlg"))
			smi = new Telegram();

		smi.enviarMensagem();
		smi.receberMensagem();
	}
}
