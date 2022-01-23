package z_common_class_interface.JDBC;

import java.sql.*;

/**
 * 通过JDBC操作数据库
 */
public class JDBC_basic {
    public static void main(String[] args) throws SQLException {
        // 端口号:3306
        // 数据库名:girls
        // 服务:本地服务器
        // 字符编码:utf-8
        String url = "jdbc:mysql://localhost:3306/girls?characterEncoding=utf-8";
        String user = "root";
        String password = "qwer123456";
        // 创建数据库连接
        Connection connection = DriverManager.getConnection(url, user, password);

        int id = 1;
        String query_sql = "select * from boys where id = ?";

        // 预编译的SQL语句对象:
        // * 语句中可以包含动态参数"?",在执行时可以为"?"动态设置参数值
        // * 可以减少编译次数提高数据库性能(相比于Statement)
        // * 可以防止sql注入,极大地提高了安全性(相比于Statement)
        // sql注入:
        // sql语句:"select*from tablename where username='"+uesrname+"' and password='"+password+"'"
        // 若用户输入ddd、aaa 'or' 1=1之后sql语句变为,select*from tablename where username='ddd' and password='aaa 'or' 1=1'
        // 此时不管用户名和密码是否匹配,该where语句值恒为true
        PreparedStatement preparedStatement = connection.prepareStatement(query_sql);
        // Sets the value of the designated parameter using the given object.
        preparedStatement.setObject(1, id); // 设置第一个问号处的值为id(为"?"动态设置参数值)
        // preparedStatement.executeQuery()  // 修改数据---增、删、改
        ResultSet resultSet = preparedStatement.executeQuery(); // 获取数据---查询操作

        // 处理结果集
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        int columnCount = resultSetMetaData.getColumnCount(); // 数据表总列数
        for (int n = 1; n <= columnCount; n++) {
            System.out.println(resultSetMetaData.getColumnName(n)); // 第n列数据的列名
        }

        while (resultSet.next()) {
            for (int i = 1; i <= columnCount; i++) {
                Object object = resultSet.getObject(i); // x行数据第i列的值
                System.out.print(object + "\t");
            }
            System.out.println();
        }

        // ***********************************************************
        String update_sql = "delete from boys where id > 4";

        // 执行静态SQL语句
        Statement statement = connection.createStatement();
        // statement.executeQuery(sql) // 获取数据---查询操作
        int rows = statement.executeUpdate(update_sql);  // 修改数据---增、删、改

        System.out.println(rows + " of affected rows!");
        // ***********************************************************

        // 关闭连接(与打开顺序相反)
        resultSet.close();
        preparedStatement.close();
        statement.close();
        connection.close();
    }
}
