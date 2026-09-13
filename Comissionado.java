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
public class Comissionado extends Funcionario {
    public double totalVendas, percentualComissao;

    public Comissionado(double totalVendas, double percentualComissao, String nome, int matricula) {
        super(nome, matricula);
        this.totalVendas = totalVendas;
        this.percentualComissao = percentualComissao;
    }
    
    @Override
    public double calcularPagamento(){
        double pagamento = totalVendas*(percentualComissao/100);
        
        return pagamento;
    }
    @Override
    public void exibirDados(){
        System.out.println("-- DADOS DO FUNCIONARIO --");
        System.out.println("Nome do funcionario: " + this.nome);
        System.out.println("matricula: " + this.matricula);
        if (percentualComissao < 0 || totalVendas < 0) {
            System.out.println("percentual Comissao ou total de vendas invalido!");
        } else {
            System.out.println("salario comissionado: " + calcularPagamento());
        }
    }
    
}
