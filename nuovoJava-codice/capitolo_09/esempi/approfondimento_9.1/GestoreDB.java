package applicazione.db.logic;
//import applicazione.db.utility.*; /*casi 1 e 2*/
import static applicazione.db.utility.CostantiSQL.*;
import java.sql.*;
import java.util.*;

public class GestoreDB /*implements CostantiSQL*/ /*caso 1*/{
    public Collection getUsers() throws SQLException{
        Collection users = null;
        Statement statement = null;
        //...
        //ResultSet rs = statement.executeQuery(GET_ALL_USERS);/*caso 1*/
        //ResultSet rs = statement.executeQuery(CostantiSQL.GET_ALL_USERS);/*caso 2*/
        ResultSet rs = statement.executeQuery(GET_ALL_USERS);/*caso 3*/
        //...
        return users;
    }
    // Altri metodi...
}