package com.lzb.bridge;

import java.sql.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * jdbc驱动测试<br/>
 * Created on : 2021-09-25 22:05
 *
 * @author lizebin
 */
public class JdbcDriverTest {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("XXX");
        String url = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
        Connection connection = DriverManager.getConnection(url);
        Statement stmt = connection.createStatement();
        String query = "select * from user";
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            System.out.println("1234567");
            System.out.println("zxb");
            System.out.println("zxb");
            int a = 0;
            int b = 1;
            int c = 2;
        }

        List<String> list = Stream.<String>builder().add("a").add("b").build().collect(Collectors.toList());


    }

}
