/**
 * Neste exemplo será demonstrado um algoritmo de substituição simples. Utilizaremos, inicialmente, o método da Cifra de Cesar. A proposta final é desenvolver uma interface Gráfica onde seja possível que o usuário insira um arquivo .txt com o TEXTO PLANO e o sistema devolva outro arquivo .txt com o TEXTO CIFRADO. Também deverá ser possível efetuar o caminho reverso, ou seja: Inserir o texto cifrado e recebe-lo descriptografado 
 */

package criptografia;

/**
 *
 * @author Danilo
 */
public class JAVACriptografia {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Codificador c1 = new Codificador();
        c1.cifrarVoid("Arroz com Cebola");
        
        
    }
    
}
