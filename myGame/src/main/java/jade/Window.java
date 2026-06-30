package jade;

import org.lwjgl.Version;
import org.lwjgl.glfw.GLFWErrorCallback;

public class Window {
    private int width,height;
    private String title;

    private static Window window=null;

    private Window(){
        this.width=1920;
        this.height=1080;
        this.title="Mario";

    }
    public static Window get(){
        if (Window.window==null){
            Window.window=new Window();
        }
        return Window.window;
    }
        private void run(){
        System.out.println("hello lwjgl "+ Version.getVersion()+"!");

        init();
        loop();
        }
        public void init(){
        //error callback
            GLFWErrorCallback.createPrint(System.err).set();
            //glfw
            if (!glfwInit()){
                throw new IllegalStateException("unable tp initialize GLFW")

            }
        }
        public void loop(){

        }
}
