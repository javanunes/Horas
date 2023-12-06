/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javanunes.horas;

/**
 *
 * @author ricardo
 */

public class ConsoleController {
    
    public static void acertaHora(String horas){
       try{
           if(!horas.isEmpty())
             Runtime.getRuntime().exec("sudo date -s "+horas);
       }
       catch(Exception ex){
           
       }
    }
    
    public static void main(String[] args){
       SiteDeHoras sdh = new SiteDeHoras();
       acertaHora(sdh.getHorasSite());
       System.out.printf("São %s horas\n",sdh.getHorasSite());
       
    }    
}
