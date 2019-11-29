package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class Plant extends Character
{
    private int time;
    public Plant(int health, int damage, int time, ImageView image,int x,int y)
    {
        super(health,damage,image,x,y);
        this.time=time;
        image.relocate(x,y);
    }
    public int getTime()
    {
        return time;
    }

}