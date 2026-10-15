/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Connection.Conexao;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author RogerioSilva
 */
public class UsuarioController {
//usuario user - e o objeto da classe usuario
       public void CadastrarUsuario(Usuario user) throws SQLException{
         //criando codigo sql para cadastrar informacoes na tabela  
         String sql = "INSERT INTO Usuario (nome, cpf, sexo, email, senha, telefone, endereco, dataNascimento) VALUES (?, ?, ?, ?, ?, ?, ?, ?)"; 
           
         //criando um try catch para lidar com erro
          try(Connection conexao = Conexao.conectar();
                  PreparedStatement comando = conexao.prepareStatement(sql)){
                  comando.setString(1, user.getNome());
                  comando.setString(2, user.getCpf());
                  comando.setString(3, user.getSexo());                  
                  comando.setString(4, user.getEmail());
                  comando.setString(5, user.getSenha());
                  comando.setString(6, user.getTelefone());
                  comando.setString(7, user.getEndereco());
                  comando.setString(8, user.getDataNascimento());
                  //executando o comando dentro do sql
                  comando.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Usuário  cadastrado!");
              
                  
          }catch(SQLException e){
              JOptionPane.showMessageDialog(null, "Usuário não cadastrado!");
              
              }
         
       } //fim do cadastrar usuario
 
}
