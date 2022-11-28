package proxy;

public class ContaProxy implements IPagamento{
	
	private Conta conta;
	
	public ContaProxy(float saldo) {
		this.conta = new Conta(saldo);
	}
	
	public String realizarPagamento(float valor) {
		if(valor > 5000.00) {
			throw new IllegalArgumentException("Valor acima do permitido para compra.");
		}
		
		float novoSaldo = this.conta.retirarValor(valor);
		String retorno = "Compra realizada com sucesso. Seu novo saldo é " + String.valueOf(novoSaldo) + ".";
		return retorno;
	}
	
	public String realizarRetiradaDeValor(float valor) {
		if(valor > 1000.00) {
			throw new IllegalArgumentException("Valor acima do permitido para retirada.");
		}
		
		float novoSaldo = this.conta.retirarValor(valor);
		String retorno = "Valor retirado com sucesso. Seu novo saldo é " + String.valueOf(novoSaldo) + ".";
		return retorno;
 	}
}
