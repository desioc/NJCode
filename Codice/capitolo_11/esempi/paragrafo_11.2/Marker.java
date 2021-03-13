import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;
@Inherited
@Target(value=METHOD)
@Retention(value=RetentionPolicy.SOURCE)
public @interface Marker {
}