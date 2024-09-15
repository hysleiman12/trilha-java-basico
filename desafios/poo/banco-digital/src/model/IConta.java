package model;

public interface IConta {

	void sacar(double valor);
	void depositar(double valor);
	double saldo();
	void transferencia(double valor, IConta contaDesctino);
	void imprimir();
	
}
