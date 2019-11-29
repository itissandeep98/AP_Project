package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;

import java.util.ArrayList;

public class Almanac
{
    private ArrayList<Player> playerList;
    private Player currPlayer;
    @FXML
    private Label character_details;
    @FXML
    private ImageView character_image;
    public Almanac(ArrayList<Player> x, Player a)
    {
        currPlayer=a;
        playerList=x;
    }
    public void back(ActionEvent e) throws Exception
    {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("LoginScreen.fxml"));
        loader.setController(new LoginScreen(playerList,currPlayer));
        Main.root=loader.load();
        Main.stage.setScene(new Scene(Main.root));
    }
    public void Peashooter_press(){// action when mouse is pressed on peashooter image in almanac
        character_image.setImage(new Image("/Photos/peashooter.jpeg"));
        character_details.setFont(new Font("Arial", 15));
        character_details.setText("Peashooter\nDamage: normal\n" +
                "How can a single plant grow and shoot so many peas so quickly? Peashooter says, \"Hard work, commitment, and a healthy, well-balanced breakfast of sunlight and high-fiber carbon dioxide make it all possible.\"\n" +
                "Cost: 100\n" +
                "Recharge: fast ");
    }
    public void Cherrybomb_press(){// action when mouse is pressed on cherry bomb image in almanac

        character_image.setImage(new Image("/Photos/Cherrybomb.jpeg"));
        character_details.setFont(new Font("Arial", 15));
        character_details.setText("Cherry bomb\nDamage: massive\n" +
                "Range: all zombies in a medium area\n" +
                "Usage: single use, instant\n" +
                "\"I wanna explode,\" says Cherry #1. \"No, let's detonate instead!\" says his brother, Cherry #2. After intense consultation they agree to explode.\n" +
                "Cost: 150\n" +
                "Recharge: very slow ");
    }
    public void Walnut_press(){// action when mouse is pressed on walnut image in almanac

        character_image.setImage(new Image("/Photos/walnut.png"));
        character_details.setFont(new Font("Arial", 15));
        character_details.setText("Walnut\nToughness: high\n" +
                "\"People wonder how I feel about getting constantly chewed on by zombies,\" says Wall-nut. \"What they don't realize is that with my limited senses all I can feel is a kind of tingling, like a relaxing back rub.\"\n" +
                "Cost: 50\n" +
                "Recharge: slow ");
    }
    public void Sunflower_press(){// action when mouse is pressed on sunflower image in almanac
        character_image.setImage(new Image("/Photos/sunflower.png"));
        character_details.setFont(new Font("Arial", 15));
        character_details.setText("SunFLower\nSun production: normal\n" +
                "Sunflower can't resist bouncing to the beat. Which beat is that? Why, the life-giving jazzy rhythm of the Earth itself, thumping at a frequency only Sunflower can hear.\n" +
                "Cost: 50\n" +
                "Recharge: fast ");
    }
    public void Zombie_press(){// action when mouse is pressed on zombie image in almanac
        character_image.setImage(new Image("/Photos/regular.png"));
        character_details.setFont(new Font("Arial", 15));
        character_details.setText("Regular Zombie\nToughness: low\n" +
                "\n" +
                "This zombie loves brains. Can't get enough. Brains, brains, brains, day in and night out. Old and stinky brains? Rotten brains? Brains clearly past their prime? Doesn't matter. Regular zombie wants 'em. ");
    }
    public void Buckethead_press(){// action when mouse is pressed on buckethead zombie image in almanac
        character_details.setFont(new Font("Arial", 15));
        character_details.setText("BucketHead zombie\nToughness: high\n" +
                "Weakness: magnet-shroom\n" +
                "Buckethead Zombie always wore a bucket. Part of it was to assert his uniqueness in an uncaring world. Mostly he just forgot it was there in the first place. ");
        character_image.setImage(new Image("/Photos/buckethead.png"));
    }
    public void Conehead_press(){// action when mouse is pressed on conehead zombie image in almanac
        character_details.setFont(new Font("Arial", 15));
        character_details.setText("ConeHead zombie\nToughness: medium\n" +
                "Conehead Zombie shuffled mindlessly forward like every other zombie. But something made him stop, made him pick up a traffic cone and stick it on his head. Oh yeah. He likes to party. ");
        character_image.setImage(new Image("/Photos/conehead.png"));
    }
    public void Flagzombie_press(){
        character_details.setFont(new Font("Arial", 15));
        character_details.setText("Flag zombie\nToughness: low\n" +
                "Make no mistake, Flag Zombie loves brains. But somewhere down the line he also picked up a fascination with flags. Maybe it's because the flags always have brains on them. Hard to say. ");
        character_image.setImage(new Image("/Photos/flag.png"));
    }
}
