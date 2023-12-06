/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javanunes.horas;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author JavaNunes 
 * Usando o Jsoup rival do soup do Python
 * 
 */
public class SiteDeHoras {
    
    private final String siteHoras = "https://www.horariodebrasilia.org/";
    private final String idHTMLHoras = "#relogio";

    private String getSiteHoras() {
        return siteHoras;
    }

    private String getIdHTMLHoras() {
        return idHTMLHoras;
    }
    
    /**
     * 
     * @return o titulo do site onde buscou pegar as horas 
     */
    private String getTitleSite(){
        try{
             Document doc = Jsoup.connect("https://www.horariodebrasilia.org/").get();
             return doc.title();
        }
        catch(Exception ex){
             System.out.println("Houve um erro ao pegar title do site pois "+ex);
        } 
        return "";
    }
    
    /**
     * 
     * @return retorna a hora do site no formato hh:mm:ss 
     */
    public String getHorasSite(){
        try{
            Document doc = Jsoup.connect(getSiteHoras()).get();
            //Pegar a tag que leva id = relogio
            Elements tags = doc.select(getIdHTMLHoras());
            for (Element tagValor : tags) {
              return tagValor.html();
            }
        }
        catch(Exception ex){
            System.out.println("Houve um erro ao pegar hora do site pois "+ex);
        }
        return "";
    }
    
}
