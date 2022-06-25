
/**
 * Escreva uma descrição da classe Main aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Main
{
    public static void main(){
        Ave[] aves= new Ave[10];
        for(int i=0;i<aves.length;i++){
            aves[i]=new Ave();
        }
        
        //aves[0].nomept("Joao-barro");
        //aves[0].tamanho("85");
        //aves[1].nomept("Joao");
        //aves[1].tamanho("75");
        
        for(int i=0;i<aves.length;i++){
            if(aves[i].mostrarNome()==null)break;
            System.out.println(aves[i].mostrarNome());
            System.out.println(aves[i].mostrarTamanho());
        }
    }
    
}

