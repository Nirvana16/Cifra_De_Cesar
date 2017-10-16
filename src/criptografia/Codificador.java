/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criptografia;

import java.util.ArrayList;


/**
 *
 * @author Danilo
 */
public class Codificador {
    private final String AlfabetoASCII = " çABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789Ç+-_/!@#$%¨&*()";
    private final int tamanhoDoAlfabeto = AlfabetoASCII.length();
        
    
    
    Codificador (){}
    
    public ArrayList<String> separarString(String StringAserSeparada){
        int tamanhoDaString = StringAserSeparada.length();       
        ArrayList<String> stringSeparada = new ArrayList<>();        
        
        for (int i = 1; i <= tamanhoDaString; i++){
            stringSeparada.add(StringAserSeparada.substring(i-1, i));     
        }   
        return stringSeparada;
    }
   
     public void cifrarVoid(String textoAserCifrado){
         int tamanhoDaString = textoAserCifrado.length();
         
         ArrayList<String> textoSeparado = separarString(textoAserCifrado);
         ArrayList<String> alfabetoSeparado = separarString(AlfabetoASCII);
         ArrayList<String> textoCifrado = new ArrayList<>();  
                  
         for (int i = 1; i <= tamanhoDaString; i++){
             for (int j = 1; j <= tamanhoDoAlfabeto; j++){
                 if (textoSeparado.get(i-1).equals(alfabetoSeparado.get(j-1))){
                   
                   textoCifrado.add(alfabetoSeparado.get(j));
//                           textoSeparado.set(i-1,alfabetoSeparado.get(j));  
                 }
            }
            
        }
        System.out.println("Texto cifrado: " + textoCifrado);
        System.out.println("Texto Plano: " + textoSeparado);
        
     }

}

