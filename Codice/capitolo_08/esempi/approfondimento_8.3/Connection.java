public class Connection {
    private boolean isOpen = false;
    public void open() {
        // . . . 
        isOpen = true;
        // . . . 
        assert isOpen;
    }
    public void close() throws ConnectionException { //ConnectionException should be created to compile (see below)
        if (!isOpen) {
            throw new ConnectionException(
                "Impossible to close open connections!" );
        }
        // . . . 
        isOpen = false;
        // . . . 
        assert !isOpen;
    }
}

class ConnectionException extends RuntimeException {
    public ConnectionException(String msg){
        super(msg);
    }
}
