import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception{
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

       String url = "jdbc:postgresql://localhost:5432/postgres";
       String userName = "postgres";
       String password = "ats123*";
       String sql = "INSERT INTO \"demoDetails\" (\"username\",\"password\") VALUES ('Atharva','ats123*')";
       Connection con = DriverManager.getConnection(url, userName, password);

        Statement st = con.createStatement();
        int rowsInserted = st.executeUpdate(sql);
        System.out.println(rowsInserted+"row(s) inserted!");
        System.out.println(rowsInserted);

        st.close();
        con.close();
    }
}