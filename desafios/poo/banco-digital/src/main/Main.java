package main;

import model.Cliente;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		
		Cliente cliente01 = new Cliente();
		ContaCorrente cc01 = new ContaCorrente(cliente01);
		ContaPoupanca cp01 = new ContaPoupanca(cliente01);
		cliente01.setNome("Hysleiman");
		cliente01.setSobreNome("Gladistone Lima Oliveira");
		cliente01.setCpf("010101010-01");
		
		cc01.depositar(4500);
		cc01.transferencia(250, cp01);
		
		cp01.depositar(4500);
		cp01.depositar(1500);
		
		cc01.imprimir();
		cp01.imprimir();
		
		

	}

}
