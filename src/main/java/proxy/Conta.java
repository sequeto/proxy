package proxy;

public class Conta {
	private float saldo;
	
	public Conta(float saldo) {
		this.saldo = saldo;
	}

	
	public float retirarValor(float valor) {
		this.saldo = saldo - valor;
		return this.saldo;
	}
}
