import java.util.Scanner;
/**
 * Escreva uma descrição da classe Main aqui.
 *
 * @author (seu nome)
 * @version (um número da versão ou uma data)
 */
public class Main{
    public static void main(String[] args){
        Ave []P1={new Ave("Página 8"), new Ave("Linha 1"), new Ave("Coluna 1"),
        new Ave("João-Grande"), new Ave("Maguari Stork"), new Ave("Ciconia maguari"),
        new Ave(" Família Ciconiidae"), new Ave("85cm")};
       
        System.out.println(P1[0].mostrar());
        System.out.println(P1[1].mostrar());
       
        Scanner in = new Scanner(System.in);
       

       
       
        System.out.println("ANOTAÇÕES:");

        System.out.println("Data:");
       

        System.out.println("Hora:");
       

        System.out.println("Local:");
       

        System.out.println("Ave:");
       
    }
}