/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stock;
/**
 *
 * @author Natanael Duarte
 */
public class Produto {
    //atributos
    private int codigo;
    private String nome;
    private int valor;
    private int validade;
    private String marca;
    private int quantidade;

    // construtores 
    public Produto(int codigo, String nome, int valor, int validade, String marca, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.validade = validade;
        this.marca = marca;
        this.quantidade = quantidade;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }


    public void setValidade(int validade) {
        this.validade = validade;
    }

    public int getValidade() {
        return this.validade;
    }


    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }
    
     public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return this.quantidade;
    }


    //método
//  void aplicaImposto(double imposto) {
//   double impostoCalculado = this.valor * imposto;
//   this.valor = this.valor + impostoCalculado;


// public class CriaProduto {

//  public static void main(String[] args) {

//   // objeto do tipo Produto
//   Produto produto = new Produto(11, "Agua", 22.0, 12, "PURAGUA");


//   // o gerente pode modificando conteúdo desse objeto
//     // produto.codigo   
//     //produto.setNome() 
//     // produto.valor  
//     // produto.validade
//     // produto.marca  

// o gerente pode imprimindo informações do objeto
//  System.out.println("Nome do produto: " + produto.getNome());
//  System.out.println("codigo do produto: " + produto.getCodigo());
//  System.out.println("valor do produto: " + produto.getValor());
//  System.out.println("data de validade do produto: " + produto.getData());
//  System.out.println("marca do produto: " + produto.getMarca());

//  }
//}

}
 

