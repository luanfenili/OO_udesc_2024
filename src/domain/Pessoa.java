package domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pessoa {

    public String endereco;

    public String nome;
    
    public LocalDate nascimento;

    public BigDecimal salario;

    public void apresentarse(){
        System.out.println("Nome........:" + this.nome);
        System.out.println("Endereço.......:" + this.endereco);
        System.out.println("Nascimento.......:" + this.nascimento);
        System.out.println("Salario......:" + this.salario);
    }
}
