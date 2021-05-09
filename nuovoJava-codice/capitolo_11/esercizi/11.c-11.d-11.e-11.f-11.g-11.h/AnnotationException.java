package eccezioni;

public class AnnotationException extends Exception {
    public AnnotationException(String msg) {
        super(msg);
    }

    @Override
    public String toString() {
        return "AnnotationException{" + getMessage() +'}';
    }   
}