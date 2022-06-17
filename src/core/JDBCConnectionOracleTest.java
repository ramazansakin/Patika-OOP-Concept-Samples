package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class JDBCConnectionOracleTest {

    public static void main(String args[]) {

        try {
            List<String> temp = new ArrayList<>();
            Stack stack;
            String str;
            StringBuilder strBuilder;
            StringBuffer stringBuffer;

            // Creation of a String - 1 - Constructor : new
            String str2 = new String("test String");

            // Creation of a String - 2 - String Literal
            String str3 = "test String";
            Integer integer = 1;


            String str4 = "test String";
            //step1 load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //step2 create  the connection object
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");

            //step3 create the statement object
            Statement stmt = con.createStatement();

            sampleSyncMethod(stmt);

            //step5 close the connection object
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private static void sampleSyncMethod(Statement stmt) throws SQLException {
        // step4 execute query
        // create table emp(id number(10),name varchar2(40),age number(3));
        ResultSet rs = stmt.executeQuery("select * from emp");

        while (rs.next()){
            // thread-safe
            synchronized (rs){
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }

        }
    }
}

