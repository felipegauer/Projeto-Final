
/**
 * Escreva uma descrição da classe Aves aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Ave{
    private String ave;
    private String mes;
    
    public Ave(String p){
        this.ave = p;
    }
    
    public Ave(){
        this.ave = " ";
        this.mes= " ";
    }
    
    public String mostrar(){
        return this.ave;
    }
    
    public void mudar(String p){
        this.ave=p;
    }
    
    public void mesAvistado(String p){
        this.mes=p;
    }
    
    public String mostrarMes(){
        return mes;
    }
}
