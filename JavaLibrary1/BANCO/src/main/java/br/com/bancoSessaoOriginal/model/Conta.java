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
public abstract class Conta implements ITransacao{
    private int numConta;
    private int numAgencia;
    
    public Conta(int numConta, int numAgencia){
        this.numAgencia = numAgencia;
        this.numConta = numConta;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

}
