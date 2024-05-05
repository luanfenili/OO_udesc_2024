package app;

import domain.Pessoa;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProgramaPrincipal {

        public static void main(String[] args) {
            Pessoa Beltrano = new Pessoa();
            Beltrano.setNome("Beltrano da Silva");
            Beltrano.setEndereço("SC");
            Beltrano.setNascimento(LocalDate.now());
            Beltrano.setSalario(new BigDecimal("123.45"));

            Beltrano.apresentarse();
        }

}
