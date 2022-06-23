import java.util.Scanner;
/**
 * Escreva uma descrição da classe Main aqui.
 *
 * @author (seu nome)
 * @version (um número da versão ou uma data)
 */
public class FontanaApp{
    public static void catalogo(Ave []p1,Ave []p2, Ave []p3, Ave []p4, Ave[]p5){
        System.out.println("\f");
        System.out.println("\n\t        CATÁLOGO");
        System.out.println("\t        --------");
        System.out.println("\tPássaro 1:");
        for(int i=0; i<p1.length;i++){
            show(i);
            System.out.printf(p1[i].mostrar());
            System.out.printf("%n");
        }

        System.out.println("----------------------------");
        System.out.println("\tPássaro 2:");
        for(int i=0; i<p2.length;i++){
            show(i);
            System.out.printf(p2[i].mostrar());
            System.out.printf("%n");
        }
        System.out.println("----------------------------");

        System.out.println("\tPássaro 3:");
        for(int i=0; i<p3.length;i++){
            show(i);
            System.out.printf(p3[i].mostrar());
            System.out.printf("%n");
        }
        System.out.println("----------------------------");

        System.out.println("\tPássaro 4:");
        for(int i=0; i<p4.length;i++){
            show(i);
            System.out.printf(p4[i].mostrar());
            System.out.printf("%n");
        }
        System.out.println("----------------------------");

        System.out.println("\tPássaro 5:");
        for(int i=0; i<p5.length;i++){
            show(i);
            System.out.printf(p5[i].mostrar());
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

    public static void comparacao(int op, Ave []p1, Ave []p2, Ave []p3, Ave []p4, Ave[]p5){
        String []aves={"-","-","-","-","-"};
        if(p1[op].equals(p2[op])){
            aves[0]="Passaro 1";
            aves[1]="Passaro 2";
        }
            

        if(p1[op].mostrar().equals(p3[op].mostrar())){
                aves[0]="Passaro 1";
                aves[2]="Passaro 3";
        }
            

        if(p1[op].mostrar().equals(p4[op].mostrar())){
            aves[0]="Passaro 1";
            aves[3]="Passaro 4";
        }
            

        if(p1[op].mostrar().equals(p5[op].mostrar())){
            aves[0]="Passaro 1";
            aves[4]="Passaro 5";
        }
            

        if(p2[op].mostrar().equals(p3[op].mostrar())){
            aves[1]="Passaro 2";
            aves[2]="Passaro 3";
        }

        if(p2[op].mostrar().equals(p4[op].mostrar())){
            aves[1]="Passaro 2";
            aves[3]="Passaro 4";
        }

        if(p2[op].mostrar().equals(p5[op].mostrar())){
            aves[1]="Passaro 2";
            aves[4]="Passaro 5";
        }

        if(p3[op].mostrar().equals(p4[op].mostrar())){
            aves[2]="Passaro 3";
            aves[3]="Passaro 4";
        }

        if(p3[op].mostrar().equals(p5[op].mostrar())){
            aves[2]="Passaro 3";
            aves[4]="Passaro 5";
        }

        if(p4[op].mostrar().equals(p5[op].mostrar())){
            aves[3]="Passaro 4";
            aves[4]="Passaro 5";
        }
        
        for(int i=0;i<aves.length;i++){
            if(!aves[i].equals("-"))
                System.out.println(aves[i]);
        }
    }

    public static void main(String[] args){
        Ave []p1={new Ave("8"), new Ave("1"), new Ave("1"),
                new Ave("João-grande"), new Ave("Maguari Stork"), new Ave("Ciconia maguari"),
                new Ave("Ciconiidae"), new Ave("85cm")};

        Ave []p2={new Ave("8"), new Ave("1"), new Ave("2"),
                new Ave("Cabeça-seca"), new Ave("Wood Stork"), new Ave("Mycteria americana"),
                new Ave("Ciconiidae"), new Ave("65cm")}; 

        Ave []p3={new Ave("8"), new Ave("2"), new Ave("1"),
                new Ave("Cisne-de-pescoço-preto"), new Ave("Black-necked-swan"), new Ave("Cygnus melancoryphus"),
                new Ave("Anatidae"), new Ave("80cm")};         

        Ave []p4={new Ave("8"), new Ave("2"), new Ave("2"),
                new Ave("Capororoca"), new Ave("Coscoroba Swan"), new Ave("Cosocoroba coscoroba"),
                new Ave("Anatidae"), new Ave("65cm")};

        Ave []p5={new Ave ("8"), new Ave("3"), new Ave("1"), 
                new Ave("Garça-branca-grande"), new Ave("Great Egret"), new Ave("Ardea alba"),
                new Ave("Ardeidae"), new Ave("65cm")};

        int op;
        Anotacao[] notas = new Anotacao[10];

        Scanner in = new Scanner(System.in);
        do{
            op=0;          
            System.out.println("\n\t        MENU");
            System.out.println("\t        ----");
            System.out.println("\t1 - Consultar catálogo");
            System.out.println("\t2 - Anotar");
            System.out.println("\t3 - Consultar por campos");
            System.out.println("\t4 - ");
            System.out.println("\t9 - Sair");
            op = in.nextInt();

            switch(op){
                case 1:
                    catalogo(p1,p2, p3, p4, p5);
                    break;

                case 2:
                    int j = 0;
                    String escolha;
                    do{
                        System.out.println("Data");
                        notas[j]=new Anotacao(in.next(),0);

                        System.out.println("Ave");
                        System.out.println("Deseja abrir o catalogo?(s/n)");
                        escolha=in.next();
                        if(escolha.equals("s")){
                            catalogo(p1,p2, p3, p4, p5);
                            System.out.println("Data: " + notas[j].mostrarData());
                        }

                        notas[j]=new Anotacao(in.next(),1);
                        j++;

                        System.out.println("Deseja anotar de novo?(s/n)");
                        escolha="";
                        escolha=in.next();
                    }while(j<9 && !escolha.equals("n"));
                    break;

                case 3:
                    System.out.println("\n\t        Qual campo quer comparar?");
                    System.out.println("\t        -------------------------");
                    System.out.println("\t1 - Pagina");
                    System.out.println("\t2 - Linha");
                    System.out.println("\t3 - Coluna");
                    System.out.println("\t4 - Familia");
                    System.out.println("\t5 - Tamanho");
                    System.out.println("\t6 - Habitat");
                    
                    op=in.nextInt();

                    switch(op){
                        case 1:
                            op=0;
                            System.out.println("\t Passaros nas mesmas paginas:");
                            comparacao(op, p1,p2, p3, p4, p5);
                            break;
                            
                        case 2:
                            op=1;
                            System.out.println("\t Passaros na mesma linha:");
                            comparacao(op, p1,p2, p3, p4, p5);
                            break;
                            
                        case 3:
                            op=2;
                            System.out.println("\t Passaros na mesma coluna:");
                            comparacao(op, p1,p2, p3, p4, p5);
                            break;
                            
                        case 4:
                            op=6;
                            System.out.println("\t Passaros da mesma familia:");
                            comparacao(op, p1,p2, p3, p4, p5);
                            break;
                            
                        case 5:
                            op=7;
                            System.out.println("\t Passaros com tamanhos iguais:");
                            comparacao(op, p1,p2, p3, p4, p5);
                            break;
                            
                        case 6:
                            //TODO
                            //op=7;
                            //comparacao(op, p1,p2, p3, p4, p5);
                            break;
                    }
                    break;
            }

        }while(op!=9);

    }
}