/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoav1;

/**
 *
 * @author digos
 */
import java.util.Scanner;
public class Lanchas extends VeiculosAquaticos {
    boolean banheiro;
    
    //setters
    public void setBanheiro(int b){
        if(b==1){
            banheiro=true;
        } else {
            banheiro=false;
        }
    }
    
    //Getters
    public boolean getBanheiro(){
        return banheiro;
    }
    
    //Cadastar
    public void cadastrar(String marca, String modelo, String cor, 
            String identificacao, int numeroPassageiros, int velocidadeMaxima, 
            double preco, double peso, double alturaCalado, String tipoCasco,
            int banheiro){
        
        super.cadastrar(marca, modelo, cor, identificacao, numeroPassageiros, velocidadeMaxima, preco, peso, alturaCalado, tipoCasco);
        setBanheiro(banheiro);
    }
    
    //Imprimir
    public void imprimir(){
        super.imprimir();
        if(banheiro==true){
            System.out.println("Possui banheiro:    Sim");  
        } else {
            System.out.println("Possui banheiro:    Não");
        }
    
    }
    
    //Entrada
    public void entradaDados(){
        super.entradaDados();
        Scanner entrada = new Scanner (System.in);
        System.out.println("Possui banheiro [1]Sim [2]Não:");
        setBanheiro(Integer.parseInt(entrada.nextLine()));
    }
    
    //Valor com Desconto
    public void valorDesconto(){
        super.valorDesconto(preco, 0.90);
        System.out.println("Valor com desconto: " + this.getPreco());
        System.out.println("--------------------------------------");
    }
    
    //Construtores
    public Lanchas(){}
    
    public Lanchas(String marca, String modelo, String id){
        super(marca, modelo, id);
    }
    
    public Lanchas(String marca, String modelo, String cor, String identificacao, 
            int numPassageiros, int vel, double preco, double peso, double alt, String tipoCasco, 
            int banheiro){
        super(marca, modelo, cor, identificacao, numPassageiros, vel, preco, peso, alt, tipoCasco);
        setBanheiro(banheiro);
    }

    public Lanchas(String marca, String modelo, String cor, String identificacao, int numPassageiros, int vel, double preco, double peso, double alt, String tipoCasco) {
        super(marca, modelo, cor, identificacao, numPassageiros, vel, preco, peso, alt, tipoCasco);
    }

    public Lanchas(boolean banheiro, String marca, String modelo, String id, String cor) {
        super(marca, modelo, id, cor);
        this.banheiro = banheiro;
    }

    public Lanchas(boolean banheiro, String marca, String modelo, int numPassageiros, int velocidade, double preco, double peso) {
        super(marca, modelo, numPassageiros, velocidade, preco, peso);
        this.banheiro = banheiro;
    }
    
    public Lanchas(int banheiro, String tipoCasco, double alturaCalado ){
        setBanheiro(banheiro);
        setTipoCasco(tipoCasco);
        setAlturaCalado(alturaCalado);
    }
    
    public Lanchas(String modelo){
        setModelo(modelo);
        setCor("Purpura");
        setMarca("Fibrafort");
        setIdentificacao("159753");
        setNumeroPassageiros(5);
        setVelocidadeMaxima(110);
        setPreco(100);
        setPeso(85);
        setAlturaCalado(5);
        setBanheiro(2);
    }
    
    public Lanchas (String marca, String modelo, int numeroPassageiros, double preco){
        setMarca(marca);
        setModelo(modelo);
        setCor("Azul");
        setIdentificacao("147258");
        setNumeroPassageiros(numeroPassageiros);
        setVelocidadeMaxima(150);
        setPreco(preco);
        setPeso(147.78);
        setAlturaCalado(654.45);
        setTipoCasco("Titanio");
        setBanheiro(1);
    }
    
    public Lanchas (String Marca, int banheiro){
        setMarca(marca);
        setBanheiro(banheiro);
    }
    
}

