package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Zombie extends Characters {


    public Zombie(int hp, int damage, int x, int y, ImageView image, ImageView gifimage,double speed){

        super(hp,damage,image,x,y,gifimage,speed);
    }
    public Zombie(int x,int y,ImageView image,ImageView gifimage,double speed)
    {
        super(100,10,image,x,y,gifimage,speed);
    }

    public void moving(){

    }

    @Override
    public void attack(Characters c){

        c.dechp(getDamage());
    }

    @Override
    public void animate() {

        gifimage.setTranslateX(gifimage.getTranslateX()-getSpeed());
        if(gifimage.getLayoutX()+gifimage.getTranslateX()<200){
            setSpeed(0);
        }
    }
}