module com.claudiodesio.rubrica.nio {
  //exports com.claudiodesio.rubrica.nio;
  provides com.claudiodesio.rubrica.spi.GestoreSerializzazione with com.claudiodesio.rubrica.nio.GestoreFileNIO2;
  requires com.claudiodesio.rubrica.dati;
  requires com.claudiodesio.rubrica.eccezioni;
  requires com.claudiodesio.rubrica.spi;
  requires com.claudiodesio.rubrica.util;
}
