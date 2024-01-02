import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();
        toyStore.addNewToy(new Toy(1, "Doll", 10, 25));
        toyStore.addNewToy(new Toy(2, "Car", 15, 35));
        toyStore.addNewToy(new Toy(3, "Teddy bear", 5, 40));

        Toy drawnToy = toyStore.drawToy();
        if (drawnToy != null) {
            toyStore.saveToFile(drawnToy);
        }
    }
}