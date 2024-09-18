//Klasa Shteti
public class Shteti {
    private String emri;
    private String llojiUdheheqjes;
    private Qyteti[] qytetet;

    public Shteti(String emri, String llojiUdheheqjes, Qyteti[] qytetet) {
        this.emri = emri;
        this.llojiUdheheqjes = llojiUdheheqjes;
        this.qytetet = qytetet;
    }

    public String getEmri() {
        return emri;
    }

    public String getLlojiUdheheqjes() {
        return llojiUdheheqjes;
    }

    public Qyteti[] getQytetet() {
        return qytetet;
    }
}