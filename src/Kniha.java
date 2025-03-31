public class Kniha {

    private String nazev;
    private String autor;
    private int rokVydani;

    public Kniha(String nazev, String autor, int rokVydani) {
        this.nazev = nazev;
        this.autor = autor;
        this.rokVydani = rokVydani;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public String getNazev() {
        return nazev;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }

    public void setRokVydani(int rokVydani) {
        this.rokVydani = rokVydani;
    }
    public int getRokVydani() {
        return rokVydani;
    }



}
