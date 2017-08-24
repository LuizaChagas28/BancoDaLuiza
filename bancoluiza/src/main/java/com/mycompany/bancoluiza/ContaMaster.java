/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancoluiza;

/**
 *
 * @author aluno
 */
public class ContaMaster extends Conta {

    /**
     * @return the saldo_investimento
     */
    public float getSaldo_investimento() {
        return saldo_investimento;
    }

    /**
     * @param saldo_investimento the saldo_investimento to set
     */
    public void setSaldo_investimento(float saldo_investimento) {
        this.saldo_investimento = saldo_investimento;
    }

    /**
     * @return the limite_extra
     */
    public float getLimite_extra() {
        return limite_extra;
    }

    /**
     * @param limite_extra the limite_extra to set
     */
    public void setLimite_extra(float limite_extra) {
        this.limite_extra = limite_extra;
    }
    private float saldo_investimento;
    private float limite_extra;
}
