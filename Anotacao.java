
/**
 * Write a description of class Anotacao here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Anotacao{
    private String data;
    private String ave;
    
    public Anotacao(){
        this.data=" ";
        this.ave=" ";
    }
    
    public Anotacao(String p,int x){
        if(x==0)
        this.data=p;
        else
        this.ave=p;
    }
    
    public void anotarData(String y){
        this.data=y;
    }
        public void anotarAve(String y){
        this.ave=y;
    }
    
    public String mostrarData(){
        return this.data;
    }
    
    public String mostrarAve(){
        return this.data;
    }
    
}
