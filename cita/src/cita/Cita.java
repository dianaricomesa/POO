/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cita;

public class Cita {

   private int numero;
   private int tipo;
   private double tarifa;
   private double valorFinal=0;
   
   public Cita (int numero, int tipo, double tarifa){
        this.numero=numero;
        this.tipo=tipo;
        this.tarifa=tarifa;
        
   }

        
    public int getNumero(){
        return numero;
        
    }
       
    
    public String getTipo(){
      if(tipo ==1)
        return "Revision";
      else 
        return "Tratamiento";
    } 
    
    
       
    public double getTarifa(){
       return tarifa;
   }
    
    public double calcularValorFinal(){
         

    		 
     if (tipo==1){
        valorFinal= tarifa-tarifa*0.3;  
     }
     else{
        valorFinal=tarifa+tarifa*0.3;
           
    }
    return valorFinal;
       
}
       
}
