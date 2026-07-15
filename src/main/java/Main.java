import java.time.*;
public class Main {
    private static final String INSTANCE = "ProcessLauncher_41e508";
    public static String generateId() { return INSTANCE + "-" + Instant.now().toEpochMilli(); }
    public static void main(String[] args) { String id = generateId(); System.out.println("[" + INSTANCE + "] ID: " + id); System.out.println("[" + INSTANCE + "] Time: " + LocalDateTime.now()); System.out.println("[" + INSTANCE + "] Zone: " + ZoneId.systemDefault()); }
}
