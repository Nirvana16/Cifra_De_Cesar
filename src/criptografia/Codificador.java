/*
 * Esta Classe sera a Engine de todo código, nela deixarei todos os metodos de Criptografar e Descriptografar.
 */
package criptografia;

import java.util.ArrayList;


/**
 *
 * @author Danilo
 */
public class Codificador {
    
    /*
    Precisei definir aqui o alfabeto a ser utilizado como um atributo, eu sei que não esta nem perto de ficar bonito, contudo a ideia é jogar tudo que for    referente ao alfabeto em uma classe própria.
    */
    private final String AlfabetoASCII = " çABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789Ç+-_/!@#$%¨&*()";
    private final int tamanhoDoAlfabeto = AlfabetoASCII.length();
        
    
    //Belo exemplo de que, em sistemas de função simples o construtor não tem quase nenhuma utilidade
    Codificador (){}
    
    /*
    Bom se voce não manja de Collections em java ou de, pelo menos, Array de Strings vai ficar complicado pra ovce entender esse código... Esse método        pega uma string e separar caractere por caractere devolvendo-a na forma de um ArrayLIst
    */
    public ArrayList<String> separarString(String StringAserSeparada){
        /**
         * Defini uma variavel local para armazenar o inteiro com o tamanho da String recebida, isso poderia ser feito diretamente dentro do FOR, mas                codigo tem fins didaticos é melhor fazer bem mastigado
         */
        int tamanhoDaString = StringAserSeparada.length();     
        
        // Iniciado a pripria arrayList que ira receber a string separda
        ArrayList<String> stringSeparada = new ArrayList<>();        
        
        // Laço for que ira varrer toda a string a ser separada
        for (int i = 1; i <= tamanhoDaString; i++){
            //Use o método .add para adicionar uma string dentro de uma ArrayList, e o Substring para pegar somente um caractere especifico da string
            stringSeparada.add(StringAserSeparada.substring(i-1, i));     
        }   
        return stringSeparada;
    }
   
     /**
      * Principal método da Classe
      */
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

