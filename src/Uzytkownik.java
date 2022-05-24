import java.util.regex.Pattern;


public class Uzytkownik {

    private String login;
    private String haslo;

    public Uzytkownik(String login, String haslo) {
        this.login = login;
        this.haslo = haslo;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) throws NiepoprawnyLoginException {
        if (sprawdźlogin(login))
            this.login = login;
        else
            throw new NiepoprawnyLoginException();
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) throws NiepoprawneHasloException {
        if (sprawdźhaslo(haslo))
            this.haslo = haslo;
        else
            throw new NiepoprawneHasloException();
    }

    private boolean sprawdźlogin(String login){
        return !Pattern.compile("^[a-zA-Z_0-9]$").matcher(login).find();
    }
    private boolean sprawdźhaslo(String haslo){
        return !Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$").matcher(haslo).find();
    }


}
