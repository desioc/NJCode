import java.lang.reflect.*;
public class TestClassReflection {
    public static void main(String args[]) throws Exception {
        String className = "java.lang.Object" ;
        if (args.length > 0) {
            className = args[0];
        }
        Class<?> objectClass = Class.forName(className);
        Method[] methods = objectClass.getMethods();
        for (int i = 0; i < methods.length; i++) {
            String name = methods[i].getName();
            Parameter[] classParameters =
                methods[i].getParameters();
            String stringClassParameters = "" ;
            int length = classParameters.length;
            for (int j = 0; j < length; ++j) {
                stringClassParameters +=
                    classParameters[j].getType().getName() + " " +
                    classParameters[j].getName();
                // aggiungiamo una virgola per separare i parametri
                // ma solo se non è l'ultimo parametro
                if (j != (length-1)) {
                    stringClassParameters += ", " ;
                }
            }
            String methodReturnType =
                methods[i].getReturnType().getName();
            String methodString = methodReturnType + " " +
                name + " (" + stringClassParameters + ")" ;
            System.out.println(methodString);
        }
    }
}