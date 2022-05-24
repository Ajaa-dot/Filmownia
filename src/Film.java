import java.util.ArrayList;

enum enumGatunek {
    Dramat, Komedia, Horror, Thriller, SciFi, Romans, Musical, Krótkometrażowy, Fantasy, Familijny, Dokumentalny
}
public class Film {
    private String tytul;
    private  int rok;
    private int czas;
    ArrayList<Komentarz> komentarze = new ArrayList<>();
    private double sredniaOcena=0;
    private enumGatunek gatunek;
    ArrayList<Osoba> obsada = new ArrayList<>();
    ArrayList<Osoba> rezyserowie = new ArrayList<>();




    public Film(String tytul, int rok, int czas, enumGatunek gatunek) {
        this.tytul = tytul;
        this.rok = rok;
        this.czas = czas;
        this.gatunek = gatunek;

    }
    public double licz_srednia(ArrayList<Komentarz>komentarze){
        double suma=0;
        int licznik=0;
        for(Komentarz komentarz: komentarze){
            suma+=komentarz.getOcena();
            licznik++;
        }
        return suma/licznik;
    }
    public void dodajKomentarz(Komentarz komentarz){
        komentarze.add(komentarz);
    }
    public void dodajObsade(Osoba osoba){
        obsada.add(osoba);
    }
    public void dodaj_rezysera(Osoba rezyser){
        this.rezyserowie.add(rezyser);
    }


    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }


    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public int getCzas() {
        return czas;
    }

    public void setCzas(int czas) {
        this.czas = czas;
    }

    public ArrayList<Komentarz> getKomentarze() {
        return komentarze;
    }

    public void setKomentarze(ArrayList<Komentarz> komentarze) {
        this.komentarze = komentarze;
    }

    public double getSredniaOcena() {
        return sredniaOcena;
    }

    public void setSredniaOcena(double ocena) {
        this.sredniaOcena = sredniaOcena;
    }

    public enumGatunek getGatunek() {
        return gatunek;
    }

    public void setGatunek(enumGatunek gatunek) {
        this.gatunek = gatunek;
    }

    public ArrayList<Osoba> getObsada() {
        return obsada;
    }

    public void setObsada(ArrayList<Osoba> obsada) {
        this.obsada = obsada;
    }
    public ArrayList<Osoba> getRezyserowie() {
        return rezyserowie;
    }

    @Override
    public String toString() {
        return "Film{" +
                "tytul='" + tytul + '\'' +
                ", rok=" + rok +
                ", czas=" + czas +
                ", komentarze=" + komentarze +
                ", ocena=" + sredniaOcena +
                ", gatunek=" + gatunek +
                ", obsada=" + obsada +
                "srednia"+ licz_srednia(komentarze)+
                '}';
    }




}
