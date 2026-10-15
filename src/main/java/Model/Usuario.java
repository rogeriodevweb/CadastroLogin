/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class Usuario {
    /* Primeira regra de segurança:
    - Todos os atributos sao declarados como privados
    - Private informa que somente a classe pode acessar*/
   private String nome, dataNascimento, cpf, email;
   private String  senha, telefone, endereco, sexo;
   
   public void Usuario(){
       
       
   } 
   //SETTER E UTILIZADO PARA CADASTRAR E ATUALIZAR DADOS
   //MÉTODOS COM PARAMETRO - QUEM CHAMAR TEM QUE PASSAR O TEXTO
   
   public void setNome(String valor){
       this.nome = valor; 
    }//Fim do setNome
    public void setCpf(String valor){
       this.cpf = valor; 
    }//Fim do setCpf
    public void setDataNascimento(String valor){
       this.dataNascimento = valor; 
    }//Fim do setDataNascimento                                                                                                                                
    public void setEmail(String email) {
        this.email = email;
    }//Fim do setEmail
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }//Fim do setTelefone
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }//Fim do setEndereco
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }//Fim do setSexo
    public void setSenha(String senha) {
        this.senha = senha;
    }
   
   
    //GETTER - Possibilita ler o dado que tem na variavel
    //Metodo com retorno do tipo String
    //this - Serve para indicar que a variavel esta dentro da classe
   public String getNome(){
       return this.nome;
   }//fim do getNome
    public String getDataNascimento() {
        return this.dataNascimento;
    }//fim do getDataNascimento
    public String getCpf() {
        return this.cpf;
    }//fim do getCpf
    public String getEmail() {
        return this.email;
    }//fim do getEmail
    public String getTelefone() {
        return this.telefone;
    }//fim do gettelefone
    public String getEndereco() {
        return this.endereco;
    }//fim do getEndereco
    public String getSexo() {
        return this.sexo;
    }
    public String getSenha() {
        return this.senha;
    }
    
    
  
}
    
    
