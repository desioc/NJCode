package rubrica.util;

@FunctionalInterface
public interface Retriever<O> {

    O esegui() throws Exception;
}