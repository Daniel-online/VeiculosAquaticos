/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author danie
 */
public class Java_POO {

    package com.mycompany.trabalhoav1;

/**
 *
 * @author digos
 */
import java.util.Scanner;
public class TrabalhoAv1 {

    public static void main(String[] args) {
        int escolha, escolhaInterno=0, escolhaItem = 0;
        Scanner sc = new Scanner(System.in);
        Menu menuI = new Menu();
        
        //Objetos JetSkis
        JetSkis jet1 = new JetSkis("Wake PRO 230");
        JetSkis jet2 = new JetSkis(142.99, 10);
        JetSkis jet3 = new JetSkis("Honda", "GTI SE 130", "963258", "Amarelo");
        JetSkis jet4 = new JetSkis("Sea-Doo", "RXP-X 300", "1472586");
        JetSkis jet5 = new JetSkis();
        jet1.setReboque(1);
        jet2.cadastrar("Yamaha", "Wake 170", "Branco", "841205", 2, 95, 106.990, 50, 5, "Reto",1);
        jet3.cadastrar(jet3.marca, jet3.modelo, jet3.cor, jet3.identificacao, 3, 85, 91.990, 65, 5, "Ondulado", 2);
        jet4.cadastrar(jet4.marca, jet4.modelo, "Cinza", jet4.identificacao, 1, 110, 80.799, 65, 3, "Reto", 2);
        //Objetos Iates
        Iates iat1 = new Iates("Azimut Grande 32");
        Iates iat2 = new Iates(100,50);
        Iates iat3 = new Iates("Fulk Al Salamah", "Mariotti Yachts", "Dourado", "951357456", 200, 90, 34000, 400, 100, 50, 15, 1);
        Iates iat4 = new Iates("Eclipse", "Blohm + Voss", "159357369");
        Iates iat5 = new Iates();
        iat2.cadastrar("Azzam", "Lürssen", "Branco", "8946527", iat2.numeroPassageiros, 80, 385000, 150, 30, iat2.numeroTripulantes, iat2.numeroCabines, 2);
        iat4.cadastrar(iat4.marca, iat4.modelo, iat4.cor, iat4.modelo, 250, 95, 750000, 650, 150, 70, 100, 1);
        //Objetos Lanchas
        Lanchas lan1 = new Lanchas("Virtual Boats", "Pro Boats 5000", 80, 150000);
        Lanchas lan2 = new Lanchas("Jet Boats", 1);
        Lanchas lan3 = new Lanchas("Pioner 17");
        Lanchas lan4 = new Lanchas("Phoenix/Flypper", "Coral 16", "Laranja", "471528693", 10, 150, 120000, 125.50, 15.75, "Retangular", 1);
        Lanchas lan5 = new Lanchas();
        
        lan2.cadastrar(lan2.marca, "Arth 240", "Preto", "471528396", 25, 85, 70000, 750, 20, "Boleado", 1);
        
        menuI.imprimirPrincipal();
        escolha=Integer.parseInt(sc.next());
        while (escolha>0) {
                switch (escolha){
                case 1:
                    do{
                        menuI.imprimirLanchas(lan1.modelo, lan2.modelo, lan3.modelo, lan4.modelo, lan5.modelo);
                        escolhaInterno=Integer.parseInt(sc.next());
                        switch(escolhaInterno){
                            case 1:
                                do{
                                    menuI.imprimirItens(lan1.modelo);
                                    escolhaItem=Integer.parseInt(sc.next());
                                    switch(escolhaItem){
                                        case 1:
                                            lan1.entradaDados();
                                            break;
                                        case 2:
                                            lan1.imprimir();
                                            break;
                                        case 3:
                                            lan1.valorDesconto();
                                            break;
                                        case 0:
                                            break;
                                    }
                                }while(escolhaItem != 0);
                                break;
                            case 2:
                                do{
                                    menuI.imprimirItens(lan2.modelo);
                                    escolhaItem=Integer.parseInt(sc.next());
                                    switch(escolhaItem){
                                        case 1:
                                            lan2.entradaDados();
                                            break;
                                        case 2:
                                            lan2.imprimir();
                                            break;
                                        case 3:
                                            lan2.valorDesconto();
                                            break;
                                        case 0:
                                            
                                            break;
                                    }
                                }while(escolhaItem != 0);
                                break;
                            case 3:
                                do{
                                    menuI.imprimirItens(lan3.modelo);
                                    escolhaItem=Integer.parseInt(sc.next());
                                    switch(escolhaItem){
                                        case 1:
                                            lan3.entradaDados();
                                            break;
                                        case 2:
                                            lan3.imprimir();
                                            break;
                                        case 3:
                                            lan3.valorDesconto();
                                            break;
                                        case 0:
                                            
                                            break;
                                    }
                                }while(escolhaItem != 0);
                            break;
                            case 4:
                                do{
                                    menuI.imprimirItens(lan4.modelo);
                                    escolhaItem=Integer.parseInt(sc.next());
                                    switch(escolhaItem){
                                        case 1:
                                            lan4.entradaDados();
                                            break;
                                        case 2:
                                            lan4.imprimir();
                                            break;
                                        case 3:
                                            lan4.valorDesconto();
                                            break;
                                        case 0:
                                            
                                            break;
                                    }
                                }while(escolhaItem != 0);
                             break;
                            case 5:
                                do{
                                    menuI.imprimirItens(lan5.modelo);
                                    escolhaItem=Integer.parseInt(sc.next());
                                    switch(escolhaItem){
                                        case 1:
                                            lan5.entradaDados();
                                            break;
                                        case 2:
                                            lan5.imprimir();
                                            break;
                                        case 3:
                                            lan5.valorDesconto();
                                            break;
                                        case 0:
                                            
                                            break;
                                    }
                                }while(escolhaItem != 0);
                            break;
                            }
                    }while(escolhaInterno<=5);
                    escolha = 6;
                    break;
                case 2:
                    do{
                        menuI.imprimirIates(iat1.modelo, iat2.modelo, iat3.modelo, iat4.modelo, iat5.modelo);
                        escolhaInterno=Integer.parseInt(sc.next());              
                            switch (escolhaInterno){
                                case 1:
                                do{
                                    menuI.imprimirItens(iat1.modelo);
                                    escolhaItem=Integer.parseInt(sc.next());
                                    switch(escolhaItem){
                                        case 1:
                                            iat1.entradaDados();
                                            break;
                                        case 2:
                                            iat1.imprimir();
                                            break;
                                        case 3:
                                            iat1.valorDesconto();
                                            break;    
                                        case 0:
                                            
                                            break;
                                    }
                                }while(escolhaItem != 0);
                                break;
                                case 2:
                                do{
                                    menuI.imprimirItens(iat2.modelo);
                                    escolhaItem=Integer.parseInt(sc.next());
                                    switch(escolhaItem){
                                        case 1:
                                            iat2.entradaDados();
                                            break;
                                        case 2:
                                            iat2.imprimir();
                                            break;
                                        case 3:
                                            iat2.valorDesconto();
                                            break; 
                                        case 0:
                                            
                                            break;
                                    }
                                }while(escolhaItem != 0);
                                break;    
                                case 3:
                                do{
                                    menuI.imprimirItens(iat3.modelo);
                                    escolhaItem=Integer.parseInt(sc.next());
                                    switch(escolhaItem){
                                        case 1:
                                            iat3.entradaDados();
                                            break;
                                        case 2:
                                            iat3.imprimir();
                                            break;
                                        case 3:
                                            iat3.valorDesconto();
                                            break;
                                        case 0:
                                            
                                            break;
                                    }
                                }while(escolhaItem != 0);
                                break;
                                case 4:
                                do{
                                    menuI.imprimirItens(iat4.modelo);
                                    escolhaItem=Integer.parseInt(sc.next());
                                    switch(escolhaItem){
                                        case 1:
                                            iat4.entradaDados();
                                            break;
                                        case 2:
                                            iat4.imprimir();
                                            break;
                                        case 3:
                                            iat4.valorDesconto();
                                            break;
                                        case 0:
                                            
                                            break;
                                    }
                                }while(escolhaItem != 0);
                                break;
                                case 5:
                                do{
                                    menuI.imprimirItens(iat5.modelo);
                                    escolhaItem=Integer.parseInt(sc.next());
                                    switch(escolhaItem){
                                        case 1:
                                            iat5.entradaDados();
                                            break;
                                        case 2:
                                            iat5.imprimir();
                                            break;
                                        case 3:
                                            iat5.valorDesconto();
                                            break;
                                        case 0:
                                            
                                            break;
                                    }
                                }while(escolhaItem != 0);    
                                break;
                            }           
                        }while(escolhaInterno<=5);
                        escolha=6;
                        break;
                       
                case 3:
                    do{    
                        menuI.imprimirJetskis(jet1.modelo, jet2.modelo, jet3.modelo, jet4.modelo, jet5.modelo);
                        escolhaInterno=Integer.parseInt(sc.next());                   
                        switch(escolhaInterno){
                            case 1:
                                do{
                                    menuI.imprimirItens(jet1.modelo);
                                    escolhaItem=Integer.parseInt(sc.next());
                                    switch(escolhaItem){
                                        case 1:
                                            jet1.entradaDados();
                                            break;
                                        case 2:
                                            jet1.imprimir();
                                            break;
                                        case 3:
                                            jet1.valorDesconto();
                                            break;
                                        case 0:
                                            
                                            break;
                                    }
                                }while(escolhaItem != 0);
                                break;
                            case 2:
                                do{
                                    menuI.imprimirItens(jet2.modelo);
                                    escolhaItem=Integer.parseInt(sc.next());
                                    switch(escolhaItem){
                                        case 1:
                                            jet2.entradaDados();
                                            break;
                                        case 2:
                                            jet2.imprimir();
                                            break;
                                        case 3:
                                            jet2.valorDesconto();
                                            break;
                                        case 0:
                                            
                                            break;
                                    }
                                }while(escolhaItem != 0);
                                break;
                        
                            case 3:
                                do{
                                    menuI.imprimirItens(jet3.modelo);
                                    escolhaItem=Integer.parseInt(sc.next());
                                    switch(escolhaItem){
                                        case 1:
                                            jet3.entradaDados();
                                            break;
                                        case 2:
                                            jet3.imprimir();
                                            break;
                                        case 3:
                                            jet3.valorDesconto();
                                            break;
                                        case 0:
                                            
                                            break;
                                    }
                                }while(escolhaItem != 0);
                                break;
                            case 4:
                                do{
                                    menuI.imprimirItens(jet4.modelo);
                                    escolhaItem=Integer.parseInt(sc.next());
                                    switch(escolhaItem){
                                        case 1:
                                            jet4.entradaDados();
                                            break;
                                        case 2:
                                            jet4.imprimir();
                                            break;
                                        case 3:
                                            jet4.valorDesconto();
                                            break;
                                        case 0:
                                            
                                            break;
                                    }
                                }while(escolhaItem != 0);
                                break;
                            case 5:
                                do{
                                    menuI.imprimirItens(jet5.modelo);
                                    escolhaItem=Integer.parseInt(sc.next());
                                    switch(escolhaItem){
                                        case 1:
                                            jet5.entradaDados();
                                            break;
                                        case 2:
                                            jet5.imprimir();
                                            break;
                                        case 3:
                                            jet5.valorDesconto();
                                            break;
                                        case 0:
                                            
                                            break;
                                    }
                                }while(escolhaItem != 0);
                                break;
                        }          
                    }while(escolhaInterno<=5);
                    escolha=6;
                    break;
                case 6:
                    menuI.imprimirPrincipal();
                    escolha=Integer.parseInt(sc.next());
                    break;
            }
        }
    }
}
}
