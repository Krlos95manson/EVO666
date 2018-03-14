

/**
 ** @author Carlos Perez
 ** @author Carlos Perez
 ** @author Carlos Perez
 ** @author Carlos Perez
 */
package Coches;

import java.util.Iterator;

public class Coches {
    
    private String color;
    private boolean status;
    private String marca;
    private String placas;
    private int personas;
    private float precio;
    
    public Coches(String color,boolean status,String marca,String placas,int personas,float precio)
    {
        this.color=color;
        this.status=status;
        this.marca=marca;
        this.placas=placas;
        this.personas=personas;
        this.precio=precio;
    }
    
    public void encender(boolean a)
    {
        this.status=a;
    }
    
    public String getColor()
    {
        System.out.println("Color:"+color);
        return color;
    }
    
    public void setColor(String ncolor)
    {
        this.color=ncolor;
    }
    public boolean getPrender()
    {
        if(status)
        {
            System.out.println("Prendido");
        }
        else
        {
            System.out.println("Apagado");
        }
        return status;
    }
    public String getMarca()
    {
        return marca;
    }
    public String getPlacas()
    {
        System.out.println("Numero de placa:"+placas);
        return placas;
    }
     public void setPlacas(String nplacas)
    {
        this.placas=nplacas;
    }
    public int getPersonas()
    {
        System.out.println("Arriba Hay:"+" "+personas+" "+"personas");
        return personas;
    }
    public float getPrecio()
    {
        System.out.println("El precio es "+"$"+precio+" "+"DOLARES");
        return precio;
    }
     public void setPersonas(int npersonas)
    {
        this.personas=npersonas;
    }
     public void setPrecio(float nprecio)
     {
         this.precio=nprecio;
     }
    
     @Override
     public String toString(){
    String aux="";
    aux="Color de vehiculo:"+" "+color+"\n"+"La marca es: "+" "+marca+"\n"+"Numero de placas"+" "+placas+"\n"+"Hay"+" "+personas+" "+"personas\n"+"El precio es de"+"$"+precio+" "+"DOLARES\n"+"El Coche esta ";
        if(status){
       aux=aux+"Encendido";
       //+"El auto esta "
        }else{
       aux=aux+"Apagado";
        }
   return aux;
}

    Iterator<String> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean contains(String next) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}