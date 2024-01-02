import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyStore {
    private List<Toy> toys = new ArrayList<>();

    public void addNewToy(Toy toy) {
        toys.add(toy);
    }

    public void updateToyFrequency(int id, double frequency) {
        for (Toy toy : toys) {
            if (toy.getId() == id) {
                toy.setFrequency(frequency);
                return;
            }
        }
    }

    public Toy drawToy() {
        double totalFrequency = 0;
        for (Toy toy : toys) {
            totalFrequency += toy.getFrequency();
        }

        Random random = new Random();
        double randomNumber = random.nextDouble() * totalFrequency;

        double tempSum = 0;
        for (Toy toy : toys) {
            tempSum += toy.getFrequency();
            if (randomNumber < tempSum) {
                toy.quantity--;
                return toy;
            }
        }

        return null;
    }

    public void saveToFile(Toy toy) {
        try {
            File file = new File("prize_toys.txt");
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(toy.getName() + "\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
