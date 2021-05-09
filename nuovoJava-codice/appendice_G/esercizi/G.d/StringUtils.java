import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringUtils {

    public static List<String> ricerca(String testo, char iniziale) {
        List<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b"+iniziale+"[a-zA-Z]+\\b");
        Matcher matcher = pattern.matcher(testo);
        while (matcher.find()) {
            list.add(matcher.group());
        }
        return list;
    }
}