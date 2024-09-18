//klasa person
public class Person {
    protected String emri;
    protected int mosha;

    public Person(String emri, int mosha ){
        this.emri = emri;
        this.mosha=mosha;
    }
    public String getEmri(){
        return emri;
    }
    public int getMosha(){
        return mosha;
    }
    
}
