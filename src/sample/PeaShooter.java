package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PeaShooter extends Plant {
    public ImageView pea;
    public PeaShooter(int x,int y)
    {
        super(100,30,3,new ImageView(new Image("/Photos/peashooter.jpeg")),x,y);
        pea=new ImageView(new Image("/Photos/Pea.png"));
        pea.relocate(imageView.getLayoutX(),imageView.getLayoutY());
    }
    @Override
    public void attack(Character c)
    {
        c.dechp(30);
    }

    @Override
    public void animate() {
        pea.setTranslateX(10);

    }
}

