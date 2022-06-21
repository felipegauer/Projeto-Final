
/**
 * Write a description of class Anotacao here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Anotacao{
    private String []nota;
    public Anotacao(){
        this.nota = new String[4];
    }
    
    public Anotacao(String []p){
        this.nota=p;
    }
    
    public void anotar(int x ,String y){
        this.nota[x]=y;
    }
    
    public String mostrar(int i){
        String x= nota [i];
        return x;
    }
}

