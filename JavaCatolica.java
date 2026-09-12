
package javacatolica;


public class JavaCatolica {

    
    public static void main(String[] args) {

        Comissionado comissionado = new Comissionado(48.000000, 6.50, "Carla", 103);
        Horista h = new Horista(172, 35.50, "Bruno", 102);
        Assalariado assalariado = new Assalariado(4.500, "Ana", 101);

        assalariado.calcularPagamento();
        assalariado.exibirDados();
        comissionado.calcularPagamento();
       
         comissionado.exibirDados();
       
       h.calcularPagamento();
       h.exibirDados();
    }
    
}
