package model;

/**
 * Created by Utilisateur on 16/06/2017.
 */
public abstract class Entity implements Entityable {
    private int x;
    private int y;
    private boolean isAlive;

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public boolean getIsAlive(){
        return isAlive;
    }
    public void setIsAlive(boolean isAlive){
        this.isAlive = isAlive;
    }
}