import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)

public @interface Serie {
  alfabeto value();
  enum alfabeto {A,B,C};
}