import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)

public @interface SingleValue {
  pippo value();
  enum pippo {A,B,C};
}