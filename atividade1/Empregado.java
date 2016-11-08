/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.atividade1;

/**
 *
 * @author Tiago Boeing
 */
public class Empregado extends Pessoa {

    private String setorEmpregado;
    private Double impostoEmpregado;
    private Double salarioBase;

    public String getSetorEmpregado() {
        return setorEmpregado;
    }

    public void setSetorEmpregado(String setorEmpregado) {
        this.setorEmpregado = setorEmpregado;
    }

    public Double getImpostoEmpregado() {
        return impostoEmpregado;
    }

    public void setImpostoEmpregado(Double impostoEmpregado) {
        this.impostoEmpregado = impostoEmpregado;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Empregado(String nomePessoa, String enderecoPessoa, String telefonePessoa, String setorEmpregado, Double impostoEmpregado, Double salarioBase) {
        
        super(nomePessoa, enderecoPessoa, telefonePessoa);
        
        this.setSetorEmpregado(setorEmpregado);
        this.setImpostoEmpregado(impostoEmpregado);
        this.setSalarioBase(salarioBase);
        
    }
    
    public void calculaSalario(){
        
        Double valorDescontos = getImpostoEmpregado()/100;
        Double salarioDescontado = getSalarioBase() * valorDescontos;
        Double salarioFinal = getSalarioBase() - salarioDescontado;
                
    }

}
