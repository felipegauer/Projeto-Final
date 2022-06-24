import java.util.Scanner;
/**
 * Escreva uma descrição da classe Main aqui.
 *
 * @author (seu nome)
 * @version (um número da versão ou uma data)
 */
public class FontanaApp{
    public static void catalogo(Ave []p1){
        for(int i=0; i<p1.length;i++){
            show(i);
            System.out.printf(p1[i].mostrar());
            System.out.printf("%n");
        }

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

    public static void showcatalogo( Ave []p1, Ave []p2, Ave []p3, Ave []p4, Ave[]p5){
        System.out.println("\f");
        System.out.println("\n\t        CATÁLOGO");
        System.out.println("\t        --------");
        System.out.println("\tPássaro 1:");
        catalogo(p1);
        System.out.println("----------------------------");
        System.out.println("\tPássaro 2:");
        catalogo(p2);
        System.out.println("----------------------------");
        System.out.println("\tPássaro 3:");
        catalogo(p3);
        System.out.println("----------------------------");
        System.out.println("\tPássaro 4:");
        catalogo(p4);
        System.out.println("----------------------------");
        System.out.println("\tPássaro 5:");
        catalogo(p5);
    }

    public static void comparacao(int op, Ave []p1, Ave []p2, Ave []p3, Ave []p4, Ave[]p5){
        String []aves={"-","-","-","-","-"};
        if(p1[op].mostrar().equals(p2[op].mostrar()) || p1[op].mostrar().equals(p3[op].mostrar()) || p1[op].mostrar().equals(p4[op].mostrar())||p1[op].mostrar().equals(p5[op].mostrar())){
            System.out.println("\tPássaro 1:");
            catalogo(p1);
            System.out.println("----------------------------");
        }


        if(p2[op].mostrar().equals(p3[op].mostrar()) || p2[op].mostrar().equals(p1[op].mostrar())||p2[op].mostrar().equals(p4[op].mostrar())||p2[op].mostrar().equals(p5[op].mostrar())){
            System.out.println("\tPássaro 2:");
            catalogo(p2);
            System.out.println("----------------------------");
        }

        if(p3[op].mostrar().equals(p4[op].mostrar())||p3[op].mostrar().equals(p5[op].mostrar())||p3[op].mostrar().equals(p2[op].mostrar())||p3[op].mostrar().equals(p1[op].mostrar())){
            System.out.println("\tPássaro 3:");
            catalogo(p3);
            System.out.println("----------------------------");
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
    public static void meses(Anotacao[] notas,String p){
        for(int i=0;i<notas.length;i++){
            if(notas[i]==null)break;
            else if(notas[i].mostrarMes().equals(p))
                System.out.println(notas[i].mostrarAve());
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
        int j = 0;
        Anotacao[] notas = new Anotacao[10];
        for (int k=0;j>notas.length;j++){
            notas[j]= new Anotacao();
        }

        Scanner in = new Scanner(System.in);
        do{
            op=0;          
            System.out.println("\n\t        MENU");
            System.out.println("\t        ----");
            System.out.println("\t1 - Consultar catálogo");
            System.out.println("\t2 - Anotar");
            System.out.println("\t3 - Consultar por campos(TODO)");
            System.out.println("\t4 - Consultar aves avistadas por mes");
            System.out.println("\t9 - Sair");
            op = in.nextInt();

            switch(op){
                case 1:
                    showcatalogo(p1,p2,p3,p4,p5);
                    break;

                case 2:
                    
                    String escolha;
                    do{
                        System.out.println("Data");
                        notas[j]= new Anotacao();
                        notas[j].anotarData(in.next());

                        System.out.println("Ave");
                        System.out.println("Deseja abrir o catalogo?(s/n)");
                        escolha = in.next();
                        if(escolha.equals("s")){
                            showcatalogo(p1,p2,p3,p4,p5);;
                            System.out.println("Data: " + notas[j].mostrarData());
                        }
                        System.out.println("Ave");
                        notas[j].anotarAve(in.next());
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

                case 4:
                    int c=0;
                    System.out.println("\n\t        Qual mes quer?");
                    System.out.println("\t        --------------");
                    System.out.println("\t1 - Janeiro");
                    System.out.println("\t2 - Fevereiro");
                    System.out.println("\t3 - Março");
                    System.out.println("\t4 - Abril");
                    System.out.println("\t5 - Maio");
                    System.out.println("\t6 - junho");
                    System.out.println("\t7 - Julho");
                    System.out.println("\t8 - Agosto");
                    System.out.println("\t9 - Setembro");
                    System.out.println("\t10 - Outubro");
                    System.out.println("\t11 - Novembro");
                    System.out.println("\t12 - Dezembro");
                    c=in.nextInt();
                    
                    switch(c){
                        case 1:
                            meses(notas,"janeiro");
                    }
                    break;
            }

        }while(op!=9);

    }
}