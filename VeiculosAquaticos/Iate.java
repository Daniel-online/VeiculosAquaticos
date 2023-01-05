/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.Java_POO;
/**
 *
 * @author daniel
 */

    
    import java.util.Scanner;
public class Iate extends Barcos {
    //Atributos
    int numeroTripulantes, numeroCabines;
    boolean piscina;
   
    
    
    //Setters
    public void setNumeroTripulantes(int n){
        numeroTripulantes = n;
    }
    public void setNumeroCabines(int n){
        numeroCabines = n;
    }
    public void setPiscina(int n){
        if (n==1){
            piscina = true;
        }else{
            piscina = false;
        }
    }
    
    //Getters
    public int getNumeroTripulantes (){
        return numeroTripulantes;
    }
    public int getNumeroCabines(){
        return numeroCabines;
    }
    public boolean getPiscina(){
        return piscina;
    }
    
    
    //Cadastrar
    public void cadastrar(String marca, String modelo, String cor, String identificacao, int numeroPassageiros, int velocidadeMaxima, double preco, double peso, double alturaCalado, 
            int numeroTripulantes, int numeroCabines, int piscina){
        super.cadastrar(marca, modelo, cor, identificacao, numeroPassageiros, velocidadeMaxima, preco, peso, alturaCalado);
        setNumeroTripulantes(numeroTripulantes);
        setNumeroCabines(numeroCabines);
        setPiscina(piscina);
    }
    
    //Imprimir
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Numero de tripulantes  :" + getNumeroTripulantes());
        System.out.println("Numero de cabines      :" + getNumeroCabines());
        if (piscina){
            System.out.println("Piscinas disponível: sim" );
        } else {
            System.out.println("Piscinas disponível: não" );
        }
        
    }
    
    //Valor desconto
    public void valorDesconto(){

        valorDesconto(preco, 0.92);
        System.out.println("Valor com desconto: " + this.getPreco());
        System.out.println("--------------------------------------");
    }
    
    //Entrada Dados
    @Override
    public void entradaDados(){
        Scanner entrada = new Scanner(System.in);
        super.entradaDados();
        System.out.println("Numero de Tripulantes :");
        setPreco(Integer.parseInt(entrada.nextLine()));
        System.out.println("Numero de Cabines     :");
        setPreco(Integer.parseInt(entrada.nextLine()));
        System.out.println("Possui piscina? [1]Sim [2]Não");
        setPreco(Integer.parseInt(entrada.nextLine()));
    }
    
    //Construtores
    public Iate(){}
    public Iate(String marca, String modelo, String id){
        super(marca, modelo, id);
    }
    public Iate(String marca, String modelo, String cor, String id, 
            int n, int vel, double p, double peso, double alt, 
            int numTrip, int numCabines, int pisc){
        super(marca, modelo, cor, id, n, vel, p, peso, alt);
        setNumeroTripulantes(numTrip);
        setNumeroCabines(numCabines);
        setPiscina(pisc);
    }
    public Iate(int numeroTripulantes, int numeroCabines, boolean piscina, String marca, String modelo, String cor, String id, int n, int vel, double p, double peso, double alt) {
        super(marca, modelo, cor, id, n, vel, p, peso, alt);
        this.numeroTripulantes = numeroTripulantes;
        this.numeroCabines = numeroCabines;
        this.piscina = piscina;
    }

    public Iate(String marca, String modelo, int numPassageiros, int velocidade, double preco, double peso) {
        super(marca, modelo, numPassageiros, velocidade, preco, peso);
    }

    public Iate(String marca, String modelo, String id, String cor) {
        super(marca, modelo, id, cor);
    }

    public Iate(int numeroTripulantes, int numeroCabines, boolean piscina) {
        this.numeroTripulantes = numeroTripulantes;
        this.numeroCabines = numeroCabines;
        this.piscina = piscina;
    }

    public Iate(int numeroTripulantes, int numeroCabines) {
        this.numeroTripulantes = numeroTripulantes;
        this.numeroCabines = numeroCabines;
    }

    public Iate(int numeroTripulantes, String marca, String modelo, String cor, String id, int n, int vel, double p, double peso, double alt) {
        super(marca, modelo, cor, id, n, vel, p, peso, alt);
        this.numeroTripulantes = numeroTripulantes;
    }

    public Iate(String modelo) {
        setModelo(modelo);
        setCor("Dourado");
        setMarca("Austin");
        setIdentificacao("8456023");
        setNumeroPassageiros(64);
        setVelocidadeMaxima(95);
        setPreco(1000000);
        setPeso(500);
        setAlturaCalado(80);
        setNumeroTripulantes(10);
        setPiscina(1);
    }
}
