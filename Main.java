import java.util.Scanner;
/**
 * Escreva uma descrição da classe Main aqui.
 *
 * @author (seu nome)
 * @version (um número da versão ou uma data)
 */
public class Main{
    public static void catalogo(Ave []p1,Ave []p2){
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
                     System.out.println("----------------------------");
    }
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
            System.out.println("\t2 - Anotar");
            System.out.println("\t3 - ");
            System.out.println("\t4 - ");
            System.out.println("\t9 - Sair");
            op = in.nextInt();

            switch(op){
                case 1:
                    catalogo(p1,p2);
                    break;

                case 2:
                    int j = 0;
                    String escolha;
                    do{
                        System.out.println("Data");
                        datas[j]=new Anotacao(in.next());
                        
                        System.out.println("Ave");
                        System.out.println("Deseja abrir o catalogo?(s/n)");
                        escolha=in.next();
                        if(escolha.equals("s")){
                            catalogo(p1,p2);
                            System.out.println("Data: " + datas[j].mostrar());
                        }
                        
                        aves[j]=new Anotacao(in.next());
                        j++;
                        
                        System.out.println("Deseja anotar de novo?(s/n)");
                        escolha="";
                        escolha=in.next();
                    }while(j<9 && !escolha.equals("n"));
                    break;

            }

        }while(op!=9);
        
    }
}