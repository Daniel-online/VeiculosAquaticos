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

public class VeiculosAquaticos extends Barcos {
    //Atributos
    String tipoCasco;
    
    //Setters
    public void setTipoCasco(String t){
        tipoCasco = t;
    }
    
    //Getters
    public String getTipoCasco(){
        return tipoCasco;
    }
    
    //Cadastrar
    public void cadastrar(String marca, String modelo, String cor, 
            String identificacao, int numeroPassageiros, int velocidadeMaxima, 
            double preco, double peso, double alturaCalado, String tipoCasco){
    
        super.cadastrar(marca, modelo, cor, identificacao, 
                numeroPassageiros, velocidadeMaxima, preco, peso, alturaCalado);
        setTipoCasco(tipoCasco);
    }
    
    //Imprimir
    public void imprimir(){
        super.imprimir();
        System.out.println("Tipo de Casco         :" + getTipoCasco());
    }
    
    //Entrada dados
    public void entradaDados(){
        super.entradaDados();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Tipo de casco         :");
        setTipoCasco(entrada.nextLine());
    }
    
    //Construtores
    public VeiculosAquaticos(){}
    public VeiculosAquaticos(String marca, String modelo, String id){
        super(marca, modelo, id);
    }
    public VeiculosAquaticos(String marca, String modelo, String cor, String identificacao, 
            int numPassageiros, int vel, double preco, double peso, double alt, String tipoCasco){
        super(marca, modelo, cor, identificacao, numPassageiros, vel, preco, peso, alt);
        setTipoCasco(tipoCasco);
    }
    public VeiculosAquaticos(String marca, String modelo, String id, String cor){
        super(marca, modelo, id, cor);
    }
    public VeiculosAquaticos(String marca, String modelo, int numPassageiros, int velocidade, double preco, double peso){
        super(marca, modelo, numPassageiros, velocidade, preco, peso);  
    }
    
    
    
    
}
