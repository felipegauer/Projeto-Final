import java.util.Scanner;
/**
 * Escreva uma descrição da classe Main aqui.
 *
 * @author (seu nome)
 * @version (um número da versão ou uma data)
 */
public class Main{
    public static void show(int i){
        switch(i){
            case 0:
                System.out.print("Página: ");
                break;
            case 1:
                System.out.print("Linha: ");
                break;
            case 2:
                System.out.print("Coluna: ");
                break;
            case 3:
                System.out.print("Nome(pt): ");
                break;
            case 4:
                System.out.print("Nome(ing): ");
                break;
            case 5:
                System.out.print("Nome(latin): ");
                break;
            case 6:
                System.out.print("Família: ");
                break;
            case 7:
                System.out.print("Tamanho: ");
                break;
        }
    }

    public static void main(String[] args){
        Ave []p1={new Ave("8"), new Ave("1"), new Ave("1"),
                new Ave("João-Grande"), new Ave("Maguari Stork"), new Ave("Ciconia maguari"),
                new Ave("Ciconiidae"), new Ave("85cm")};

        Ave []p2={new Ave("8"), new Ave("1"), new Ave("1"),
                new Ave("João-Grande"), new Ave("Maguari Stork"), new Ave("Ciconia maguari"),
                new Ave("Ciconiidae"), new Ave("85cm")};       

        int op;
        Anotacao[] datas = new Anotacao[10];
        Anotacao[] aves = new Anotacao[10];
       
        Scanner in = new Scanner(System.in);
        do{
            op=0;          
            System.out.println("\n\t        MENU");
            System.out.println("\t        ----");
            System.out.println("\t1 - Consultar catálogo");
            System.out.println("\t2 - Depositar");
            System.out.println("\t3 - Retirar");
            System.out.println("\t4 - Transferir");
            System.out.println("\t9 - Sair");
            op = in.nextInt();

            switch(op){
                case 1:
                    System.out.println("\f");
                    System.out.println("\n\t        CATÁLOGO");
                    System.out.println("\t        --------");
                    System.out.println("\tPássaro1:");
                    for(int i=0; i<p1.length;i++){
                        show(i);
                        System.out.printf(p1[i].mostrar());
                        System.out.printf("%n");
                    }

                    System.out.println("----------------------------");
                    System.out.println("\tPássaro2:");
                    for(int i=0; i<p2.length;i++){
                        show(i);
                        System.out.printf(p1[i].mostrar());
                        System.out.printf("%n");
                    }
                    break;

                case 2:
                    String nota="";
                    int j = 0;
                    
                    do{
                        System.out.println("Data");
                        datas[j]=new Anotacao(in.next());
                        System.out.println("Ave");
                        aves[j]=new Anotacao(in.next());
                        j++;
                    }while(j<2);
                    break;

            }

        }while(op!=9);

        System.out.println("ANOTAÇÕES:");

        System.out.println("Data:");

        System.out.println("Hora:");

        System.out.println("Local:");

        System.out.println("Ave:");
    }
}