import java.awt.*;
import java.util.LinkedList;

public class Handler {

    LinkedList<Object> object = new LinkedList<Object>();

    private boolean up = false, down = false, right = false, left = false;

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

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public boolean isDown() {
        return down;
    }

    public void setDown(boolean down) {
        this.down = down;
    }

    public boolean isRight() {
        return right;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public boolean isLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

}
