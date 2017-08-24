/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancoluiza;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Cliente extends Conta {

    /**
     * @return the RG
     */
    public int getRG() {
        return RG;
    }

    /**
     * @param RG the RG to set
     */
    public void setRG(int RG) {
        this.RG = RG;
    }

    /**
     * @return the CPF
     */
    public int getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the dt_nasc
     */
    public Date getDt_nasc() {
        return dt_nasc;
    }

    /**
     * @param dt_nasc the dt_nasc to set
     */
    public void setDt_nasc(Date dt_nasc) {
        this.dt_nasc = dt_nasc;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    private String nome;
    private int RG;
    private int CPF;
    private Date dt_nasc;    
}
