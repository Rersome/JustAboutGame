import java.awt.*;
import java.util.LinkedList;

public class Handler {

    LinkedList<Object> object = new LinkedList<Object>();

    public void tick(){

        for(int i = 0; i < object.size(); i++){
            Object tempObject = object.get(i);

            tempObject.tick();
        }

    }

    public void render(Graphics g){

        for(int i = 0; i < object.size(); i++){
            Object tempObject = object.get(i);

            tempObject.render(g);
        }

    }

    public void addObject(Object tempObject){
        object.add(tempObject);
    }

    public void removeObject (Object tempObject){
        object.remove(tempObject);
    }

}
