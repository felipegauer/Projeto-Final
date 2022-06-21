
/**
 * Escreva uma descrição da classe Aves aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Ave{
    private String ave[];
    public Ave(String[]p){
        this.ave = p;
    }
    
    public Ave(){
        this.ave = null;
    }
    
    public String mostrar(int i){
        String b= this.ave[i];
        return b;
    }
}