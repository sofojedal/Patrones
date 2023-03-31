import java.awt.Image;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;

/**
 * La clase ImageFactory utiliza un Map para almacenar las imágenes, con la clave siendo el nombre del archivo de la imagen. Cuando se solicita una imagen, la clase ImageFactory verifica si la imagen ya se ha cargado en el Map. Si es así, devuelve la imagen almacenada en el Map. De lo contrario, carga la imagen desde el archivo, la almacena en el Map y la devuelve.
 */
class ImageFactory {
    private Map<String, Image> imageMap;

    public ImageFactory() {
        imageMap = new HashMap<>();
    }

    public Image getImage(String name) {
        Image image = imageMap.get(name);
        if (image == null) {
            image = loadImage(name);
            imageMap.put(name, image);
        }
        return image;
    }

    private Image loadImage(String name) {
        ImageIcon icon = new ImageIcon(name);
        return icon.getImage();
    }
}
