package model;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEGUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta (Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEGUENCIAL ++;
		this.cliente = cliente;	
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		
	}

	@Override
	public double saldo() {
		
		return this.saldo;
	}

	@Override
	public void transferencia(double valor, IConta contaDesctino) {
		this.sacar(valor);
		contaDesctino.depositar(valor);
		
	}

	@Override
	public void imprimir() {
		System.out.println(String.format("Titular %s %s \nCPF: %s", this.cliente.getNome(),this.cliente.getSobreNome(),this.cliente.getCpf()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Número: %d",this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo()));
		
	}
	

}
