package tr.edu.maltepe.oop;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class Cat {

        private String name;
        private int age;

        // Constructor
        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getter and Setter Methods
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        // Method to simulate the cat meowing with sound
        public void meow() {
            System.out.println(name + " says: Meow!");
            playMeowSound("C:\\Users\\Lenovo\\IdeaProjects\\my-cat-class-Esmahafif\\module1\\src\\tr\\edu\\maltepe\\oop\\cat_meowing_1_ZAj_Dgz.wav"); // Ensure meow.wav exists in the same directory
        }

        // Method to play the meow sound
        private void playMeowSound(String soundFile) {
            try {
                File file = new File(soundFile);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
                Clip clip = AudioSystem.getClip();
                clip.open(audioStream);
                clip.start();
            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                System.err.println("Error playing sound: " + e.getMessage());
            }
        }

    }
