package exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Exercicio02 {

    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new AuxiliarEscritorio("Nery Pumpido", 2500.0, 500.0));
        funcionarios.add(new AuxiliarEscritorio("Sergio Batista", 2300.0, 500.0));
        funcionarios.add(new AuxiliarEscritorio("José Brown", 2000.0, 500.0));
        funcionarios.add(new AuxiliarEscritorio("José Burruchaga", 2000.0, 500.0));
        funcionarios.add(new TecnicoManutencao("José Cuciuffo", 3500.0, 10.0, 500.0));
        funcionarios.add(new TecnicoManutencao("Diego Maradona", 3300.0, 10.0, 500.0));
        funcionarios.add(new TecnicoManutencao("Jorge Valdano", 3300.0, 10.0, 500.0));
        funcionarios.add(new TecnicoManutencao("Hector Enrique", 3000.0, 10.0, 500.0));
        funcionarios.add(new TecnicoManutencao("Ricardo Giusti", 3000.0, 10.0, 500.0));
        funcionarios.add(new TecnicoManutencao("Julio Olarticoechea", 3000.0, 10.0, 500.0));
        funcionarios.add(new TecnicoManutencao("Oscar Ruggeri", 3000.0, 10.0, 500.0));
        funcionarios.add(new Gerente("Carlos Bilardo", 5000.0, 150.0));

        System.out.println("O valor do orçamento anual do departamento 1986 da empresa é: "+calculaOrcamentoAnual(funcionarios));

    }

    private static double calculaOrcamentoAnual(List<Funcionario> funcionarios) {
        // TODO: implemente o código deste método
        return 0.0;
    }
}
