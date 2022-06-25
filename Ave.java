
/**
 * Escreva uma descrição da classe Aves aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Ave{
    private String ave;
    private String mes;
    private String pagina;
    private String linha;
    private String coluna;
    private String nomept;
    private String nomeing;
    private String nomelatin;
    private String tamanho;
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
    
    public void nome(String p,String y,String x){
        this.nomept=p;
        this.nomeing=y;
        this.nomelatin=x;
    }
    
    public void loc(String p,String y,String x){
        this.pagina=p;
        this.linha=y;
        this.coluna=x;
    }
    
    public void tamanho(String p){
        this.tamanho=p;
    }
    
    public String mostrarNome(){
        return this.nomept;
    }
    
    public String mostrarTamanho(){
        return this.tamanho;
    }
}
