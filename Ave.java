
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
    private String familia;
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
    
    public void caracteristicas(String a, String b, String c, String d, String e, String f, String g,String h){
        this.pagina=a;
        this.linha=b;
        this.coluna=c;
        this.nomept=d;
        this.nomeing=e;
        this.nomelatin=f;
        this.familia=g;
        this.tamanho=h;
    }
    
    public String mostrarNome(){
        return this.nomept;
    }
    
    public String mostrarNomeing(){
        return this.nomeing;
    }
    
    public String mostrarNomelatin(){
        return this.nomelatin;
    }
    
    public String mostrarPagina(){
        return this.pagina;
    }
    
    public String mostrarLinha(){
        return this.linha;
    }
    
    public String mostrarColuna(){
        return this.coluna;
    }
    
    public String mostrarFamilia(){
        return this.familia;
    }
    
    public String mostrarTamanho(){
        return this.tamanho;
    }
}
