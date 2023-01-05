/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.Java_POO;
/**
 *
 * @author daniel
 */
public class JetSkis {

    package com.mycompany.trabalhoav1;

/**
 *
 * @author digos
 */
import java.util.Scanner;

public class JetSkis extends VeiculosAquaticos {
    //atributos
    boolean reboque;
    
    //Setters
    public void setReboque(int r){
        if (r==1){
            reboque = true;
        } else {
            reboque = false;
        }
    }
    
    //Getters
    public boolean getReboque(){
        return reboque;
    }
    
    //Cadastar
    public void cadastrar(String marca, String modelo, String cor, 
            String identificacao, int numeroPassageiros, int velocidadeMaxima, 
            double preco, double peso, double alturaCalado, String tipoCasco,
            int reboque){
        
        super.cadastrar(marca, modelo, cor, identificacao, numeroPassageiros, velocidadeMaxima, preco, peso, alturaCalado, tipoCasco);
        setReboque(reboque);
    }
    
    //Imprimir
    public void imprimir(){
        super.imprimir();
        if(reboque==true){
            System.out.println("Reboque disponível:    Sim");  
        } else {
            System.out.println("Reboque disponível:    Não");
        }
        System.out.println("==================================");
        System.out.println("==================================");
    }
    
    //Entrada
    public void entradaDados(){
        super.entradaDados();
        Scanner entrada = new Scanner (System.in);
        System.out.println("Reboque disponível [1]Sim [2]Não:");
        setReboque(Integer.parseInt(entrada.nextLine()));
    }
    
    //Valor com Desconto
    public void valorDesconto(){
        super.valorDesconto(preco, 0.85);
        System.out.println("Valor com desconto: " + this.getPreco());
        System.out.println("--------------------------------------");
    }
    
    //Construtores
    public JetSkis(){}
    public JetSkis(String marca, String modelo, String id){
        super(marca, modelo, id);
    }
    public JetSkis(String marca, String modelo, String cor, String identificacao, int numPassageiros, int vel, double preco, double peso, double alt, String tipoCasco, int reboque){
        super(marca, modelo, cor, identificacao, numPassageiros, vel, preco, peso, alt, tipoCasco);
        setReboque(reboque);
    }
    public JetSkis(String marca, String modelo, String cor, String identificacao, 
            int numPassageiros, int vel, double preco, double peso, double alt, String tipoCasco){
        super(marca, modelo, cor, identificacao, numPassageiros, vel, preco, peso, alt, tipoCasco);
    }
    public JetSkis(String marca, String modelo, String id, String cor){
        super(marca, modelo, id, cor);
    }
    public JetSkis(String marca, String modelo, int numPassageiros, int velocidade, double preco, double peso){
        super(marca, modelo, numPassageiros, velocidade, preco, peso);  
    }
    public JetSkis(int reboque){
        setReboque(reboque);
    }
    
    public JetSkis(int velocidade, int numPassageiros){
        setVelocidadeMaxima(velocidade);
        
    }
    public JetSkis(double preco, double peso){
        setPreco(preco);
        setPeso(peso);
        
    }
    
    public JetSkis(String modelo){
        setModelo(modelo);
        setCor("Azul");
        setMarca("Roland");
        setIdentificacao("AGEX-5000");
        setNumeroPassageiros(2);
        setVelocidadeMaxima(98);
        setPreco(25300);
        setPeso(50);
        setAlturaCalado(3);
        setReboque(1);
    }
   
}
