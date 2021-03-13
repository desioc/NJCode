/**
 Codice by Paolo Ceffa, grazie della correzione!
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IterableExample implements Iterable {
   String filename ;
  public IterableExample(String filename) {
    this.filename= filename;
    
  }

  public Iterator<String> iterator( ) {
    return new TextFileIterator( );
  }

  class TextFileIterator implements Iterator<String> {
    BufferedReader in;
    
    String nextline;
   
    public TextFileIterator( ) {
      try {
        in = new BufferedReader(new FileReader(filename));
        nextline = in.readLine( );
      } catch(IOException e) {
        throw new IllegalArgumentException(e);
      }
    }

    public boolean hasNext( ) {
        if (nextline != null)
        return true;
        else return false;
    }

    public String next( ) {
      try {
        String result = nextline;

        if (nextline != null) {
          nextline = in.readLine( ); // Read another line
          if (nextline == null)
          in.close( ); // And close on EOF
        }

        return result;
      } catch(IOException e) {
        throw new IllegalArgumentException(e);
      }
    }
    public void remove( ) {
      throw new UnsupportedOperationException( );
    }
  }
  public static void main(String[] args) {
    String filename = "TextFile.java";
    if (args.length > 0)
    filename = args[0];
    for(Object line : new IterableExample("build.xml"))
    System.out.println(line);
  }
}