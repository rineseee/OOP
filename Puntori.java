//Klasa Puntori(i trasheguar nga Personi)
public class Puntori extends Person{

    private int numriNeKomune;
    
    public Puntori(String emri, int mosha , int numriNeKomune){
        super(emri , mosha);
        this.numriNeKomune = numriNeKomune;
    }
    
    public int getnumriNeKomune(){
        return numriNeKomune;
    }
    
}
