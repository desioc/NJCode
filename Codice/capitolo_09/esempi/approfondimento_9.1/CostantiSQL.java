package applicazione.db.utility;
public interface CostantiSQL {
    String GET_ALL_USERS = "SELECT * FROM USERS";
    String GET_USER = "SELECT * FROM USERS WHERE ID = ?";
    // Altre costanti...
}