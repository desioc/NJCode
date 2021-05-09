public class RuntimeInfo {
    public static void main(String args[]) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Il sistema dispone di "+ runtime.availableProcessors()+" processori");
        System.out.println("Memoria totale allocata nella JVM "+ runtime.totalMemory() +" byte");
        System.out.println("Memoria libera nella JVM "+ runtime.freeMemory() +" byte");
        System.out.println("Memoria massima allocabile dalla JVM "+ runtime.maxMemory() +" byte");
    }
}