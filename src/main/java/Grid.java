import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;



public class Grid implements ApplicationListener {

    private static int GAME_WORLD_WIDTH;
    private static int GAME_WORLD_HEIGHT;
    private OrthographicCamera camera;

    @Override
    public void create() {

        GAME_WORLD_HEIGHT = Gdx.graphics.getHeight();
        GAME_WORLD_WIDTH = Gdx.graphics.getWidth();

        camera = new OrthographicCamera(GAME_WORLD_WIDTH, GAME_WORLD_HEIGHT);
        camera.translate(GAME_WORLD_WIDTH/2, GAME_WORLD_HEIGHT/2);
        camera.update();


    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void render() {

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

        if(Gdx.input.isKeyPressed(Input.Keys.SPACE)){
            System.out.println("Space");
        }

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
