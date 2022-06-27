/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stock;

/**
 *
 * @author Natanael Duarte
 */
public class User {
    private String nome;
    private int idade;
    private String email;
    private int id;
    private String password;
    private String userType;

 public User(String nome, int idade, String email, int id, String password, String userType) 
     {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.id = id;
        this.password = password;
        this.userType = userType;
    }

    public boolean login(int id, String password){
        if(id == this.id && password.equals(this.password)){
            System.out.println("Login com sucesso");
            return true;
        }
        return false;
    }
    
    public boolean ust(){
        if(this.userType.equals("admin")){
            return true;
        }
        return false;
        
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public String getUserType() {
        return this.userType;
    }
}
