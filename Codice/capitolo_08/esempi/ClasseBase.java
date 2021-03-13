public class ClasseBase {
    public void metodo() throws java.io.IOException {
    }
}
class SottoClasseCorretta1 extends ClasseBase {
    @Override
    public void metodo() throws java.io.IOException {
    }
}
class SottoClasseCorretta2 extends ClasseBase {
    @Override
    public void metodo() throws java.io.FileNotFoundException {
    }
}
class SottoClasseCorretta3 extends ClasseBase {
    @Override
    public void metodo() {
    }
}
/* Questa classe non compila*/
/*class SottoClasseScorretta extends ClasseBase {
    @Override
    public void metodo() throws java.sql.SQLException {
    }
}*/

class SottoClasseCorretta4 extends ClasseBase {
    @Override
    public void metodo() throws java.lang.NullPointerException {
    }
}