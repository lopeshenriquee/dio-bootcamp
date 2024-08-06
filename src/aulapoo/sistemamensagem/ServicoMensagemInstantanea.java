package aulapoo.sistemamensagem;

public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();

	public abstract void receberMensagem();

	// mais um m�todo que todos os filhos dever�o implementar
	public abstract void salvarHistoricoMensagem();

	// somente os filhos conhecem este m�todo
	protected void validarConectadoInternet() {
		System.out.println("Validando se est� conectado a internet");
	}

}
