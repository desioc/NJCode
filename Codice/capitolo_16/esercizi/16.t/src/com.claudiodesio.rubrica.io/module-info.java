module com.claudiodesio.rubrica.io {
  //exports com.claudiodesio.rubrica.io;
  provides com.claudiodesio.rubrica.spi.GestoreSerializzazione with com.claudiodesio.rubrica.io.GestoreFile;
  requires com.claudiodesio.rubrica.dati;
  requires com.claudiodesio.rubrica.eccezioni;
  requires com.claudiodesio.rubrica.spi;
  requires com.claudiodesio.rubrica.util;
}
