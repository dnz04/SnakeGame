import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Boot {
    public static void main(String[] args) {

        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();

        cfg.title = "Snake";
        cfg.width = 500;
        cfg.height = 400;
        cfg.useGL20 = false;
        cfg.resizable = false;

        new LwjglApplication(new Grid(), cfg);
    }
}
