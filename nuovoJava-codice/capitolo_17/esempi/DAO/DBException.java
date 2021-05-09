public class DBException extends RuntimeException{
    public DBException (String msg){
        super(msg);
    }
    
    public DBException (String msg, Throwable cause){
        super(msg, cause);
    }

}