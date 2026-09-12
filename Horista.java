
package javacatolica;

public class Horista extends Funcionario {
    public int horasTrabalhadas;
    public double valorHora;

    public Horista(int horasTrabalhadas, double valorHora, String nome, int matricula) {
        super(nome, matricula);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }
    /*pagamento = horasTrabalhadas × valorHora
*/
    @Override
    public double calcularPagamento(){
       
        double pagamento = horasTrabalhadas*valorHora;
        return pagamento;
    }
    @Override
     public void exibirDados(){
        System.out.println("-- DADOS DO FUNCIONARIO --");
        System.out.println("Nome do funcionario: "+this.nome);
        System.out.println("Matricula: "+ this.matricula);
        System.out.println("Pagamento do Horista: "+ calcularPagamento() );
        
    }
}
