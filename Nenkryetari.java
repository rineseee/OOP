//klasa Nenkryetari (i trasheguar nga Personi)
public class Nenkryetari extends Person{
    private int viteEksperienc;

    public Nenkryetari(String emri, int mosha, int viteEksperienc){
        super(emri , mosha);
        this.viteEksperienc = viteEksperienc;

    }
    public int getviteEksperienc(){
        return viteEksperienc;
    }
    
}
