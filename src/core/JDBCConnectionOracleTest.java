package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCConnectionOracleTest {

    public static void main(String args[]) {

        try {
            List<String> temp = new ArrayList<>();
            //step1 load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //step2 create  the connection object
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");

            //step3 create the statement object
            Statement stmt = con.createStatement();

            // step4 execute query
            // create table emp(id number(10),name varchar2(40),age number(3));
            ResultSet rs = stmt.executeQuery("select * from emp");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

            //step5 close the connection object
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

