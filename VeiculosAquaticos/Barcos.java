/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author danie
 */


    package com.mycompany.Java_POO;

/**
 *
 * @author daniel
 */
import java.util.Scanner;

public class Barcos {
    //Atributos
    String marca, modelo, cor, identificacao;
    int numeroPassageiros, velocidadeMaxima;
    double preco, peso, alturaCalado;

    //Setters
    public void setMarca(String m){
        marca = m;
    }
    public void setModelo(String m){
        modelo = m;
    }
    public void setCor(String c){
        cor = c;
    }    
    public void setIdentificacao(String i){
        identificacao = i;
    }
      public void setNumeroPassageiros(int p){
        numeroPassageiros = p;
    }
    public void setVelocidadeMaxima(int v){
        velocidadeMaxima = v;
    }
    public void setPreco(double p){
        preco = p;
    }
    public void setPeso (double p){
        peso = p;
    }
    public void setAlturaCalado (double p){
        alturaCalado = p;
    }
    
    //Getters
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getCor(){
        return cor;
    }
    public String getIdentificacao(){
        return identificacao;
    }

    public int getNumeroPassageiros(){
        return numeroPassageiros;
    }
    public int getVelocidadeMaxima(){
        return velocidadeMaxima;
    }

    public double getPreco(){
        return preco;
    }
    public double getPeso(){
        return peso;
    }
    public double getAlturaCalado(){
        return alturaCalado;
    }
    
    //Cadastrar
    public void cadastrar(String marca, String modelo, String cor, String identificacao, int numeroPassageiros, int velocidadeMaxima, double preco, double peso, double alturaCalado ){
        setMarca(marca);
        setModelo(modelo);
        setCor(cor);
        setIdentificacao(identificacao);
        setNumeroPassageiros(numeroPassageiros);
        setVelocidadeMaxima(velocidadeMaxima);
        setPreco(preco);
        setPeso(peso);
        setAlturaCalado(alturaCalado);
    }
    
    //Imprimir
    public void imprimir(){
        System.out.println("==================================");
        System.out.println("==================================\n");
        System.out.println("Marca                 :" + getMarca());
        System.out.println("Modelo                :" + getModelo());
        System.out.println("Cor                   :" + getCor());
        System.out.println("Identificação         :" + getIdentificacao());
        System.out.println("Numero de passageiros :" + getNumeroPassageiros());
        System.out.println("Velocidade Máxima     :" + getVelocidadeMaxima());
        System.out.println("Preço                 :" + getPreco());
        System.out.println("Peso                  :" + getPeso());
        System.out.println("Altura Calado         :" + getAlturaCalado());
        
    }
    
    //Valor com desconto
    
    public void valorDesconto(double preco, double desc){
        setPreco(preco*desc);
    }
    
    //Entrada de Dados
    public void entradaDados(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Marca                 :");
        setMarca(entrada.nextLine());
        System.out.println("Modelo                :");
        setModelo(entrada.nextLine());
        System.out.println("Cor                   :");
        setCor(entrada.nextLine());
        System.out.println("Identificação         :");
        setIdentificacao(entrada.nextLine());
        System.out.println("Numero de passageiros :");
        setNumeroPassageiros(Integer.parseInt(entrada.nextLine()));
        System.out.println("Velocidade Máxima     :");
        setVelocidadeMaxima(Integer.parseInt(entrada.nextLine()));
        System.out.println("Preço                 :");
        setPreco(Float.parseFloat(entrada.nextLine()));
        System.out.println("Peso                  :");
        setPeso(Float.parseFloat(entrada.nextLine()));
        System.out.println("Altura Calado         :");
        setAlturaCalado(Float.parseFloat(entrada.nextLine()));
    }
    
    //Construtores
    public Barcos(){}
    public Barcos(String marca, String modelo, String cor, String id, int n, int vel, double p, double peso, double alt){
       setMarca(marca);
       setModelo(modelo);
       setCor(cor);
       setIdentificacao(id);
       setNumeroPassageiros(n);
       setVelocidadeMaxima(vel);
       setPreco(p);
       setPeso(peso);
       setAlturaCalado(alt);
    }
    public Barcos(String marca, String modelo, String id){
        this.marca=marca;
        this.modelo=modelo;
        this.cor="";
        this.identificacao=id;
    }  
    public Barcos(String marca, String modelo, String id, String cor) {
        setMarca(marca);
        setModelo(modelo);
        setIdentificacao(id);
        setCor(cor);
    }
    public Barcos(String marca, String modelo, String id, String cor, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.identificacao = id;
        this.cor = cor;
        this.numeroPassageiros = numPassageiros;
    }
    public Barcos(String marca, String modelo, String id, String cor, int numPassageiros, int velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.identificacao = id;
        this.cor = cor;
        this.numeroPassageiros = numPassageiros;
        this.velocidadeMaxima = velocidade;
    }
    public Barcos(String marca, String modelo, String id, String cor, int numPassageiros, int velocidade, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.identificacao = id;
        this.cor = cor;
        this.numeroPassageiros = numPassageiros;
        this.velocidadeMaxima = velocidade;
        this.preco = preco;
    }
    public Barcos(String marca, String modelo, String id, String cor, int numPassageiros, int velocidade, double preco, double peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.identificacao = id;
        this.cor = cor;
        this.numeroPassageiros = numPassageiros;
        this.velocidadeMaxima = velocidade;
        this.preco = preco;
        this.peso = peso;
    }
    public Barcos(String marca, String modelo, String id, int numPassageiros, int velocidade, double preco, double peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.identificacao = id;
        this.numeroPassageiros = numPassageiros;
        this.velocidadeMaxima = velocidade;
        this.preco = preco;
        this.peso = peso;
    }
    public Barcos(String marca, String modelo, int numPassageiros, int velocidade, double preco, double peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPassageiros = numPassageiros;
        this.velocidadeMaxima = velocidade;
        this.preco = preco;
        this.peso = peso;
    }
    
}
    

