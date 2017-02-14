package fallk.miniconv;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Miniconv {
    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.err.println("Miniconv needs two arguments!");
            System.exit(1);
        }
        ImageIO.write(ImageIO.read(new File(args[0])), "png", new File(args[1]));
    }
}
