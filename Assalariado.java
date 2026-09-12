/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacatolica;

/**
 *
 * @author rikel
 */
public class Assalariado extends Funcionario{
    public double salarioMensal;

    public Assalariado(double salarioMensal, String nome, int matricula) {
        super(nome, matricula);
        this.salarioMensal = salarioMensal;
    }
    
    @Override
    public double calcularPagamento(){
        
        return salarioMensal;
    }
     @Override
     public void exibirDados(){
        System.out.println("-- DADOS DO FUNCIONARIO --");
        System.out.println("Nome do funcionario: "+this.nome);
        System.out.println("Matricula: "+ this.matricula);
        System.out.println("Salario mensal "+ calcularPagamento() );
    }
}
