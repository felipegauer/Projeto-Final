
/**
 * Write a description of class Anotacao here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Anotacao{
    private String data;
    private String ave;
    private String mes;

    public Anotacao(){
        this.data=null;
        this.ave=null;
        this.mes=null;
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
        return this.ave;
    }

    public String mes(){
        if(data==null) {throw new  IllegalArgumentException("Data null");}
        char k;
        int i;
        char c;
        String d;
        k=data.charAt(3);
        c=data.charAt(4);
        d=Character.toString(k) + Character.toString(c);
        i=Integer. parseInt(d);
        if(i>0 && i<13){
            switch(i){
                case 1:
                    this.mes="janeiro";
                    break;

                case 2:
                    this.mes="fevereiro";
                    break;

                case 3:
                    this.mes="março";
                    break;

                case 4:
                    this.mes="abril";
                    break;

                case 5:
                    this.mes="maio";
                    break;

                case 6:
                    this.mes="junho";
                    break;

                case 7:
                    this.mes="julho";
                    break;

                case 8:
                    this.mes="agosto";
                    break;

                case 9:
                    this.mes="setembro";
                    break;

                case 10:
                    this.mes="outubro";
                    break;

                case 11:
                    this.mes="novembro";
                    break;

                case 12:
                    this.mes="dezembro";
                    break;

            }
        }else throw new  IllegalArgumentException("Mes inválido");
        return this.mes;
    }
}

