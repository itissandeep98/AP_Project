package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class NormalZombie extends Zombie {
    public NormalZombie(int x,int y) {
        super(100, 1, x, y, new ImageView(new Image("/Photos/normal_zombie_moving.gif",100,100,false,false)), new ImageView(new Image("/Photos/normal_zombie_moving.gif",100,100,false,false)), 1,"/Photos/normal_zombie_moving.gif");

    }
}
