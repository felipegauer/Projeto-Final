import java.util.Scanner;
/**
 * Escreva uma descrição da classe Main aqui.
 *
 * @author (seu nome)
 * @version (um número da versão ou uma data)
 */
public class FontanaApp{
    public static void catalogo(Ave []aves,int k){
            for(int j=0;j<aves.length;j++){
            show(j,k,aves);
            }

    }

    public static void show(int j,  int i,Ave[] aves){
        switch(j){
            case 0:
                System.out.print("Página: ");
                System.out.printf(aves[i].mostrarPagina());
                System.out.printf("%n");
                break;
            case 1:
                System.out.print("Linha: ");
                System.out.printf(aves[i].mostrarLinha());
                System.out.printf("%n");
                break;
            case 2:
                System.out.print("Coluna: ");
                System.out.printf(aves[i].mostrarColuna());
                System.out.printf("%n");
                break;
            case 3:
                System.out.print("Nome(pt): ");
                System.out.printf(aves[i].mostrarNome());
                System.out.printf("%n");
                break;
            case 4:
                System.out.print("Nome(ing): ");
                System.out.printf(aves[i].mostrarNomeing());
                System.out.printf("%n");
                break;
            case 5:
                System.out.print("Nome(latin): ");
                System.out.printf(aves[i].mostrarNomelatin());
                System.out.printf("%n");
                break;
            case 6:
                System.out.print("Família: ");
                System.out.printf(aves[i].mostrarFamilia());
                System.out.printf("%n");
                break;
            case 7:
                System.out.print("Tamanho: ");
                System.out.printf(aves[i].mostrarTamanho());
                System.out.printf("%n");
                break;
        }
    }

    public static void showcatalogo( Ave []aves){
        System.out.println("\f");
        System.out.println("\n\t        CATÁLOGO");
        System.out.println("\t        --------");
        System.out.println("\tPássaro 1:");
        catalogo(aves,0);
        System.out.println("----------------------------");
        System.out.println("\tPássaro 2:");
        catalogo(aves,1);
        System.out.println("----------------------------");
        System.out.println("\tPássaro 3:");
        catalogo(aves,2);
        System.out.println("----------------------------");
        System.out.println("\tPássaro 4:");
        catalogo(aves,3);
        System.out.println("----------------------------");
        System.out.println("\tPássaro 5:");
        catalogo(aves,4);
    }

    public static void comparacao(int op, Ave []aves){
        
    }
    public static void meses(Anotacao[] notas,String p){
        for(int i=0;i<notas.length;i++){
            if(notas[i]==null)break;
            else if(notas[i].mostrarMes().equals(p))
                System.out.println(notas[i].mostrarAve());
        }
    }

    public static void main(String[] args){
                
        Ave[] aves=new Ave[10];
        
        aves[0]= new Ave();
        aves[0].caracteristicas("8","1","1","João-grande","Maguari Stork","Ciconia maguari","Ciconiidae","85cm");
        aves[1]= new Ave();
        aves[1].caracteristicas("8","1","2","Cabeça-seca","Wood Stork","Mycteria americana","Ciconiidae","65cm");
        aves[2]= new Ave();
        aves[2].caracteristicas("8","2","1","Cisne-de-pescoço-preto","Black-necked-swan","Cygnus melancoryphus","Anatidae","80cm");
        aves[3]= new Ave();
        aves[3].caracteristicas("8","2","2","Capororoca","Coscoroba Swan","Cosocoroba coscoroba","Anatidae","65cm");
        aves[4]= new Ave();
        aves[4].caracteristicas("8","3","1","Garça-branca-grande","Great Egret","Ardea alba","Ardeidae","65cm");
        

        int op;
        int j = 0;
        Anotacao[] notas = new Anotacao[10];
        for (int k=0;k>notas.length;k++){
            notas[k]= new Anotacao();
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
                    showcatalogo(aves);
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
                            showcatalogo(aves);;
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
                            comparacao(op,aves);
                            break;

                        case 2:
                            op=1;
                            System.out.println("\t Passaros na mesma linha:");
                            comparacao(op,aves);
                            break;

                        case 3:
                            op=2;
                            System.out.println("\t Passaros na mesma coluna:");
                            comparacao(op,aves);
                            break;

                        case 4:
                            op=6;
                            System.out.println("\t Passaros da mesma familia:");
                            comparacao(op,aves);
                            break;

                        case 5:
                            op=7;
                            System.out.println("\t Passaros com tamanhos iguais:");
                            comparacao(op,aves);
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
                            break;
                        case 2:
                            meses(notas,"fevereiro");
                            break;
                        case 3:
                            meses(notas,"março");
                            break;
                        case 4:
                            meses(notas,"abril");
                            break;
                        case 5:
                            meses(notas,"maio");
                            break;
                        case 6:
                            meses(notas,"junho");
                            break;
                        case 7:
                            meses(notas,"julho");
                            break;
                        case 8:
                            meses(notas,"agosto");
                            break;
                        case 9:
                            meses(notas,"setembro");
                            break;
                        case 10:
                            meses(notas,"outubro");
                            break;
                        case 11:
                            meses(notas,"novembro");
                            break;
                        case 12:
                            meses(notas,"dezembro");
                            break;
                    }
                    break;
            }

        }while(op!=9);
    }
}