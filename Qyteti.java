//Klasa qyteti 
public class Qyteti {
    private String emri;
    private int numriBanoreve;
    private boolean eshteKryeqytet;
    private String komuna;

    public Qyteti(String emri, int numriBanoreve, boolean eshteKryeqytet,String komuna){
        this.emri = emri;
        this.numriBanoreve = numriBanoreve;
        this.eshteKryeqytet = eshteKryeqytet;
        this.komuna = komuna;

    }
    public String getEmri(){
        return emri;
    }

    public int getnumriBanorve(){
        return numriBanoreve;
    }

    public boolean eshteKryeqytet(){
        return eshteKryeqytet;
    }

   public String getkomuna(){
    return komuna;
   }
    
}
