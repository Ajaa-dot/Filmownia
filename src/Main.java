import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws SQLException {


        //tu sobie robie tworzenie uzytkownikow z tych z bazy
        ConnectionClass connectionClass = new ConnectionClass();
        Connection connection = connectionClass.getConnection();
        String sql="SELECT * FROM `uzytkownik`";
        Statement statement=connection.createStatement();
        ResultSet resultSet =statement.executeQuery(sql);

        while(resultSet.next()){
            System.out.println(resultSet.getString(1) );
        }

        /*Uzytkownik u1=new Uzytkownik("Ola","jj22");
        Film matrix= new Film("Matrix",1999,136,enumGatunek.SciFi);
        Osoba li_w=new Osoba("Lilly","Wachowski", "29.12.1967",189);
        Osoba la_w=new Osoba ("Lana", "Wachowski","21.06.1965",179);
        Osoba k_w=new Osoba("Keanu","Reeves","2.09.1964",185);
        Osoba c_m=new Osoba("Carrie-Anne","Moss", "21.08.1967",174);
        */
    }
}
