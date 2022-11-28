package proxy;

public interface IPagamento {
	String realizarPagamento(float valor);
	String realizarRetiradaDeValor(float valor);
}
