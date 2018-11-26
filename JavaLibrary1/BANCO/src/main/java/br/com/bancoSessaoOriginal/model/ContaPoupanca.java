/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bancoSessaoOriginal.model;

/**
 *
 * @author mario.agjunior
 */
public class ContaPoupanca extends Conta{
    
    private double taxaRendimento;
    
    public ContaPoupanca(int numConta, int numAgencia){
        super(numConta, numAgencia);        
    }

    @Override
    public Double saldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double saque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void depositar(double valorDep) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
