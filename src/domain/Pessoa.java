package domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pessoa {

    private String endereco;

    private String nome;
    
    private LocalDate nascimento;

    private BigDecimal salario;

 /*   public Pessoa(String name,
                  String endereco,
                  LocalDate nascimento,
                  BigDecimal salario){
    }
*/
    public void apresentarse(){
        System.out.println("Nome........:" + this.nome);
        System.out.println("Endereço.......:" + this.endereco);
        System.out.println("Nascimento.......:" + this.nascimento);
        System.out.println("Salario......:" + this.salario);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public void setEndereço(String endereco){
        this.endereco = endereco;
    }
    public LocalDate getNascimento(){
        return this.nascimento;
    }

    public void setNascimento(LocalDate nascimento){
        this.nascimento = nascimento;
    }

    public BigDecimal getSalario(){
        return this.salario;
    }

    public void setSalario(BigDecimal salario){
        this.salario = salario;
    }
}
