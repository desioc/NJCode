import java .sql.*;
public class IsolationLevelExample {
    public static void main(String args[]) {
        try (Connection connection = DriverManager.getConnection("jdbc:derby:Music");) {
            System.out.println("Current Transaction Isolation Level is " + connection.getTransactionIsolation());
            DatabaseMetaData databaseMetaData = connection.getMetaData();
            System.out.println("This database supports TRANSACTION_NONE Level = " + databaseMetaData.supportsTransactionIsolationLevel(Connection.TRANSACTION_NONE));
            System.out.println("This database supports TTRANSACTION_READ_COMMITTED Level = " + databaseMetaData.supportsTransactionIsolationLevel(Connection.TRANSACTION_READ_COMMITTED));
            System.out.println("This database supports TRANSACTION_READ_UNCOMMITTED Level = " + databaseMetaData.supportsTransactionIsolationLevel(Connection.TRANSACTION_READ_UNCOMMITTED));
            System.out.println("This database supports TRANSACTION_REPEATABLE_READ Level = " + databaseMetaData.supportsTransactionIsolationLevel(Connection.TRANSACTION_REPEATABLE_READ));
            System.out.println("This database supports TRANSACTION_SERIALIZABLE Level = " + databaseMetaData.supportsTransactionIsolationLevel(Connection.TRANSACTION_SERIALIZABLE));
            System.out.println("Setting Transaction Isolation Level to Connection.TRANSACTION_SERIALIZABLE");  
            connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            System.out.println("Current Transaction Isolation Level is " + connection.getTransactionIsolation());          
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}