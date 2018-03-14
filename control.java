/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * * @author Carlos Perez 
 * * @author Carlos Perez 
 * * @author Carlos Perez 
 * * @author Carlos Perez 
 */
package Coches;

import java.util.ArrayList;
import java.util.Scanner;
public class control {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        
        boolean con=true;
        boolean con2=false;
        
        
        Coches almacen1 = new Coches("Purpura",true,"RX-7 Mazda","mml-455-67",2,34567);
        Coches almacen2 = new Coches("Dorado",false,"Camaro SS Chevrolet","jr-re-97",5,33214);
        Coches almacen3 = new Coches("Plateado",true,"Civic Honda","hf-t98-3",2,23000);
        Coches almacen4 = new Coches("Gris",false,"Jetta VW","15-98-rem",8,40213);
        Coches almacen5 = new Coches("Negro",true,"Q5 Audi","kam-we-3",5,55023);
        
        ArrayList<Coches>Bodega=new ArrayList();
        
        Bodega.add(almacen1);
        Bodega.add(almacen2);
        Bodega.add(almacen3);
        Bodega.add(almacen4);
        Bodega.add(almacen5);
        
        

        
   do{
         try{
             System.out.println("*******************************");
        System.out.println("++++  PRINCIPAL MENU  ++++");
        System.out.println("*******************************");
        System.out.println("1.- Vehiculos Disponibles");
        System.out.println("2.- Editar Algun Vehiculo");
        System.out.println("3.-Diseñar nuevo auto");
        System.out.println("4.- Salir de Programa");
        System.out.println("5.-Elim|inar auto");
        System.out.println("R=");
        int des=Entrada.nextInt();
        
        
        switch(des){
            case 1:
                System.out.println("\n");
                System.out.println("**********************");
                System.out.println("Vehiculos Disponibles");
                System.out.println("***********************");
                int i=1;
                for(Coches temp:Bodega)
                    {
                        System.out.println(i+".- "+temp.getMarca());
                        i=i+1;
                    }
                System.out.println("\n");
                System.out.println("*******************************************");
                System.out.println("Seleccione Vehiculo Para Ver Detalles\n R=");
                
                int vehi=Entrada.nextInt();
                switch(vehi)
                {
                    case 1:
                        System.out.println(almacen1+"\n");
                        con2 = true;
                    break;
                    case 2:
                        System.out.println(almacen2+"\n");
                        con2 = true;
                    break;
                    case 3:
                        System.out.println(almacen3);
                        con2 = true;
                    break;
                    case 4:
                        System.out.println(almacen4+"\n");
                        con2 = true;
                    break;
                    case 5:
                        System.out.println(almacen5+"\n");
                        con2 = true;
                    break;
                }
                 if(vehi>5 || vehi<1){
                         System.out.println("ERROR DE SELECCION--INTENTELO DE NUEVO \n");
                         System.out.println("******************************************");
                         con2 = true;
                    }
            break;
                
            case 2:
                System.out.println("\n");
                System.out.println("*********************************");
                System.out.println("NUMERO DE VEHICULO PARA MODIFICAR");
                System.out.println("*********************************");
                int j=1;
                for(Coches temp:Bodega)
                    {
                        System.out.println(j+".- "+temp.getMarca());
                        j=j+1;
                    }
                System.out.println("->");
                int vehiculo=Entrada.nextInt();
                
                    switch(vehiculo)
                        {
                        case 1:
                            System.out.println(almacen1+"\n");
                            System.out.println("El Nuevo color: ");
                            String ncolor=Entrada.next();
                            System.out.println("La Nueva Matricula: ");
                            String nplaca=Entrada.next();
                            System.out.println("EPersonas que estan Arriba: ");
                            int nperson=Entrada.nextInt();
                            almacen1.setColor(ncolor);
                            almacen1.setPlacas(nplaca);
                            almacen1.setPersonas(nperson);
                            System.out.println("\n");
                            con2 = true;
                        break;
                            
                         case 2:
                             System.out.println(almacen2+"\n");
                             System.out.println("Nuevo color: ");
                            String ncolorc=Entrada.next();
                            System.out.println("Nueva Matricula: ");
                            String nplacac=Entrada.next();
                            System.out.println("Personas que estan Arriba: ");
                            int npersonc=Entrada.nextInt();
                            almacen2.setColor(ncolorc);
                            almacen2.setPlacas(nplacac);
                            almacen2.setPersonas(npersonc);
                            System.out.println("\n");
                            con2 = true;
                        break;
                             
                        case 3:
                            System.out.println(almacen3+"\n");
                            System.out.println("Nuevo color: ");
                            String ncolorca2=Entrada.next();
                            System.out.println("Nueva Matricula: ");
                            String nplacaca2=Entrada.next();
                            System.out.println("Personas que estan Arriba: ");
                            int npersonca2=Entrada.nextInt();
                            almacen3.setColor(ncolorca2);
                            almacen3.setPlacas(nplacaca2);
                            almacen3.setPersonas(npersonca2);
                            System.out.println("\n");
                            con2 = true;
                        break;
                            
                        case 4:
                            System.out.println(almacen4+"\n");
                            System.out.println("Nuevo color: ");
                            String ncolorco2=Entrada.next();
                            System.out.println("Nueva Matricula: ");
                            String nplacaco2=Entrada.next();
                            System.out.println("Personas que estan Arriba: ");
                            int npersonco2=Entrada.nextInt();
                            almacen4.setColor(ncolorco2);
                            almacen4.setPlacas(nplacaco2);
                            almacen4.setPersonas(npersonco2);
                            System.out.println("\n");
                            con2 = true;
                        break;
                            
                        case 5:
                            System.out.println(almacen5+"\n");
                            System.out.println("Nuevo color: ");
                            String ncolorcam=Entrada.next();
                            System.out.println("Nueva Matricula: ");
                            String nplacacam=Entrada.next();
                            System.out.println("Personas que estan Arriba");
                            int npersoncam=Entrada.nextInt();
                            almacen5.setColor(ncolorcam);
                            almacen5.setPlacas(nplacacam);
                            almacen5.setPersonas(npersoncam);
                            System.out.println("\n");
                            con2 = true;
                        break;
                        }//end of switch
                    if(vehiculo>5 || vehiculo<1){
                         System.out.println("No Existente\n");
                         con2 = true;
                    }
            break; 
            
             case 3:
                    System.out.println("*************************");
                    System.out.println("**** CREAR VEHICULO ****");
                    System.out.println("*************************");
                    System.out.println("Color del Vehiculo: ");
                    String colorM=Entrada.next();
                    System.out.println("Marca del Vehiculo: ");
                    String marcaM=Entrada.next();
                    System.out.println("Placas del Vehiculo:  ");
                    String placasM=Entrada.next();
                    System.out.println("Pasajeros que Soporta el Vehiculo: ");
                    int pasajerosM=Entrada.nextInt();
                    System.out.println("el Precio:  ");
                    float precioM=Entrada.nextFloat();
                    Coches aux = new Coches(colorM,false,marcaM,placasM,pasajerosM,precioM);
                    Bodega.add(aux);
                    
                    con2=true;
                    System.out.println("\n");
            break;
            

            case 4:
                    con2 = false;
                    con = false;
            break;
               case 5:
                    System.out.println("\n");
                System.out.println("******************************");
                System.out.println("**** Vehiculos en Almacen ****");
                System.out.println("*******************************");
                int l=1;
                for(Coches temp:Bodega)
                    {
                        System.out.println(".-"+l+" "+temp.getMarca());
                        l=l+1;
                    }
                System.out.println("\n");
                System.out.println("Nunero de Coche que se Eliminara");
                System.out.println("*********************************");
                int var=Entrada.nextInt();
                int resu=var-1;
                
                
                Bodega.remove(resu);
                System.err.println("****BORRADO!****");
                con2=true;
                
            break;
        }//end of switch
         if(des>4 || des<1){
                         System.out.println("INTENTELO DE NUEVO!^_^*");
                         con2 = true;
                    }
                } catch (Exception ex) {
                    System.err.println("No Valido^_^");
                    con2 = true;
                }
            } while (con2);
        
        
        
        
        
    }
    
    
}