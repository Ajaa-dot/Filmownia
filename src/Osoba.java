import java.util.ArrayList;


public class Osoba {

    private String imie;
    private String nazwisko;
    private String data_urodzenia;
    private int wzrost;
    ArrayList<String> nagrody = new ArrayList<>();
    ArrayList<Komentarz> komentarze = new ArrayList<>();
    ArrayList<Film> filmy = new ArrayList<>();


    public Osoba(String imie, String nazwisko, String data_urodzenia, int wzrost) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data_urodzenia = data_urodzenia;
        this.wzrost = wzrost;

    }
    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getData_urodzenia() {
        return data_urodzenia;
    }

    public void setData_urodzenia(String data_urodzenia) {
        this.data_urodzenia = data_urodzenia;
    }

    public int getWzrost() {
        return wzrost;
    }

    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }

    public ArrayList getNagrody() {
        return nagrody;
    }
    public ArrayList<Komentarz> getKomentarze() {
        return komentarze;
    }

    public ArrayList<Film> getFilmy() {
        return filmy;
    }


    public void dodaj_nagrode(String nagroda){
        this.nagrody.add(nagroda);
    }
    public void dodaj_komentarz(Komentarz komentarz){
        this.komentarze.add(komentarz);
    }
    public void dodaj_film(Film film){
        this.filmy.add(film);
    }


    @Override
    public String toString() {
        return
                "Imię: " + imie + '\n'+
                        "Nazwisko: " + nazwisko + '\n'+
                        "Data Urodzenia: " + data_urodzenia + '\n'+
                        "Wzrost: " + wzrost + "cm" + '\n'+
                        "Nagrody: " + nagrody;
    }
}

