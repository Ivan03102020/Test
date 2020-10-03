package NewPackage;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class NewClass {
    public static void main(String[] args) throws IOException, URISyntaxException {
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
                for (Desktop.Action action : Desktop.Action.values()){
                    System.out.println(action);
                }
            if (desktop.isSupported(Desktop.Action.OPEN)){
            //        desktop.open(new File("/home/smile.jpg"));
                desktop.open(new File("C:/Users/Ivan.smile.jpg"));
            }
            //if (desktop.isSupported(Desktop.Action.BROWSE)){
              //  desktop.browse(new URI("https://yandex.ru/images/"));
            //}
        }
    }
}

