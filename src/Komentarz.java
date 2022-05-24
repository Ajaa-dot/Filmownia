import java.util.Date;

enum enumOcena {
    Super, Dobry, Sredni, Slaby, Okropny
}
public class Komentarz {

    Date nowDate = new Date();
    private String tresc;
    private enumOcena ocena_kom;
    Uzytkownik uzytkownik;
    long data;
    private double ocena;

    public Komentarz(String tresc, enumOcena ocena_kom, Uzytkownik uzytkownik, double ocena) {
        this.tresc = tresc;
        this.ocena_kom = ocena_kom;
        this.uzytkownik = uzytkownik;
        this.data = nowDate.getTime();;
        this.ocena = ocena;
    }



    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }





    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public enumOcena getOcena_kom() {
        return ocena_kom;
    }

    public void setOcena_kom(enumOcena ocena_kom) {
        this.ocena_kom = ocena_kom;
    }

    public Uzytkownik getUzytkownik() {
        return uzytkownik;
    }

    public void setUzytkownik(Uzytkownik uzytkownik) {
        this.uzytkownik = uzytkownik;
    }

    public long getdata() {
        return data;
    }

    public void setdata(long data) {
        this.data = data;
    }




}
