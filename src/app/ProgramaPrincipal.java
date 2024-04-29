package app;

import domain.Pessoa;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProgramaPrincipal {
    public static void main(String[] args) {

    }

    public static class teste {
        public static void main(String[] args) {
            Pessoa Beltrano = new Pessoa();
            Beltrano.nome = "Beltrano da Silva";
            Beltrano.endereco = "SC";
            Beltrano.nascimento = LocalDate.now();
            Beltrano.salario = new BigDecimal("123.45");

            System.out.println(Beltrano.nome);
            System.out.println(Beltrano.endereco);
            System.out.println(Beltrano.nascimento);
            System.out.println(Beltrano.salario);


        }
    }
}
