
/**
 * Write a description of class Anotacao here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Anotacao{
    private String nota;
    public Anotacao(){
        this.nota = " ";
    }
    
    public Anotacao(String p){
        this.nota=p;
    }
    
    public void anotar(String y){
        this.nota=y;
    }
    
    public String mostrar(){
        return this.nota;
    }
}

