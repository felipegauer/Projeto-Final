import java.util.Scanner;
/**
 * Escreva uma descrição da classe Main aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Main{
    public static void main(String[] args){
        Ave []joao={new Ave("joao"), new Ave("branco")};
        
        System.out.println(joao[0].mostrar());
        System.out.println(joao[1].mostrar());
        
        Scanner in = new Scanner(System.in);
        Anotacao nota1 = new Anotacao();

        
        
        System.out.println("ANOTAÇÕES:");

        System.out.println("Data:");
        nota1.anotar(0,in.next());

        System.out.println("Hora:");
        nota1.anotar(1,in.next());

        System.out.println("Local:");
        nota1.anotar(2,in.nextLine());

        System.out.println("Ave:");
        nota1.anotar(3,in.nextLine());


        
        
        System.out.println(nota1.mostrar(0));
        System.out.println(nota1.mostrar(1));
        System.out.println(nota1.mostrar(2));
        System.out.println(nota1.mostrar(3));
    }
}
