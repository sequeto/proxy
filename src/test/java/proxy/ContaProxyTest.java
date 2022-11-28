package proxy;

import static org.junit.Assert.*;

import org.junit.Test;


public class ContaProxyTest {


	    @Test
	    public void deveRetornarConfirmacaoDePagamento() {
	        ContaProxy conta = new ContaProxy(20000);

	        assertEquals("Compra realizada com sucesso. Seu novo saldo é 19800.0.", conta.realizarPagamento(200));
	    }

	    @Test
	    public void deveRetornarConfirmacaoDeRetiradaDeValor() {
	        ContaProxy conta = new ContaProxy(20000);

	        assertEquals("Valor retirado com sucesso. Seu novo saldo é 19200.0.", conta.realizarRetiradaDeValor(800));
	    }


	    @Test
	    public void deveRetonarPagamentoNaoPermitido() {
	        try {
	        	ContaProxy conta = new ContaProxy(20000);

	            conta.realizarPagamento(10000);
	            fail();
	        }
	        catch (IllegalArgumentException e) {
	            assertEquals("Valor acima do permitido para compra.", e.getMessage());
	        }
	    }
	    
	    @Test
	    public void deveRetonarRetiradaNaoPermitida() {
	        try {
	        	ContaProxy conta = new ContaProxy(20000);

	            conta.realizarRetiradaDeValor(2000);
	            fail();
	        }
	        catch (IllegalArgumentException e) {
	            assertEquals("Valor acima do permitido para retirada.", e.getMessage());
	        }
	    }

}
