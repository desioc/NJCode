import java.util.*;

public interface DAO<T> {
    public static final String URL = "jdbc:derby://localhost:1527/Music";
    
    Optional<T> selectById(long id);
    
    List<T> selectAll();
    
    void insert(T t);
    
    void update(T t);
    
    void delete(T t);
}