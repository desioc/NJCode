import java.awt.*;

public class SystemTrayExample {
    public static void main(String[] args) throws AWTException {
        if (SystemTray.isSupported()) {
            SystemTray tray = SystemTray.getSystemTray();
            PopupMenu popupMenu = new PopupMenu();
            Image image = Toolkit.getDefaultToolkit().getImage("img/smalleje.png");
            TrayIcon trayIcon = new TrayIcon(image, "SystemTrayExample", popupMenu);
            MenuItem closeItem = new MenuItem("Close");
            closeItem.addActionListener((e) -> System.exit(0));
            MenuItem infoItem = new MenuItem("Info");
            infoItem.addActionListener((e) -> trayIcon.displayMessage("SystemTrayExample",
                    "If we want everything to remain as it is, everything must change.", TrayIcon.MessageType.INFO));
            popupMenu.add(infoItem);
            popupMenu.add(closeItem);
            tray.add(trayIcon);
        }
    }
}
