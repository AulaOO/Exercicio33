/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio33;

/**
 *
 * @author Luis Guilherme
 */
public class Cliente {
    private String nome;
    private String idade;
    private String cpf;

    public Cliente() {
    }

    public Cliente(String nome, String idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome (String nome) throws Exception {
        if(nome != null){
            throw new DadoInvalidoException();
        } else {
            this.nome = nome;
        }
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String dados(){
        String dados = "Nome: " + nome + "\nIdade: " + idade + "\nCPF: " + cpf;
        return dados;
    }
}
