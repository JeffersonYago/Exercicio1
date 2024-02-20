package controller;

public class SNController {

	public SNController() {
		super();
	}
	public int sN (int n) {
		if (n == 0) {
//quando n chega a zero, a chamada da recursiva é interrompida para que sejam contabilizados apenas os numeros naturais
			return n;
		}else {
			return n + sN(n - 1);
//n é somado com seu antecessor a cada chamada da função
		}
	}
}
