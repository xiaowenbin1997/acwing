package 预编译实现批处理;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class test {
    public static void main(String[] args) throws Exception{
        String sql = "insert into student(id,name,score) values (?,?,?)";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode","root","333");
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        for (int i = 0;i < 100;i++){
            preparedStatement.setInt(1,i);
            preparedStatement.setString(2,"name" + i);
            preparedStatement.setDouble(3,1.0 + i);
            preparedStatement.addBatch();
        }
        preparedStatement.executeBatch();
        if (preparedStatement!=null){
            preparedStatement.close();
        }
        if (connection != null){
            connection.close();
        }
    }
}
