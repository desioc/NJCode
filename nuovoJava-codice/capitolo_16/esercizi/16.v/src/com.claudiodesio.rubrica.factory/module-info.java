module com.claudiodesio.rubrica.factory {
  exports com.claudiodesio.rubrica.factory to com.claudiodesio.rubrica.test;
  requires com.claudiodesio.rubrica.spi;
  requires com.claudiodesio.rubrica.dati;
  uses com.claudiodesio.rubrica.spi.GestoreSerializzazione;
}

