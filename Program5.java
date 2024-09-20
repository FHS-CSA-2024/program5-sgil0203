//import stuff here?

public class Program5 { 
    public static void main(String[]args) {
        double royaleMiles = 286.0; 
        double royaleGallons = 9.0; 
        double koopaMiles = 412.0; 
        double koopaGallons = 40.0; 
        double pipeMiles = 361.0; 
        double pipeGallons = 18.0; 
        double badMiles = 161.0; 
        double badGallons = 11.0; 
        
        double royaleAverage = royaleMiles / royaleGallons; 
        int royaleAverage1 = (int)(royaleAverage * 10);
        double royaleAverageFinal = (double)royaleAverage1 / 10; 
        double koopaAverage = koopaMiles / koopaGallons; 
        int koopaAverage1 = (int)(koopaAverage * 10);
        double koopaAverageFinal = (double)koopaAverage1 / 10; 
        double pipeAverage = pipeMiles / pipeGallons; 
        int pipeAverage1 = (int)(pipeAverage * 10);
        double pipeAverageFinal = (double)pipeAverage1 / 10; 
        double badAverage = badMiles / badGallons;
        int badAverage1 = (int)(badAverage * 10);
        double badAverageFinal = (double)badAverage1 / 10;
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon: ");
        System.out.println("Royale averaged " + royaleAverageFinal + " m/g");
        System.out.println("Koopa King averaged " + koopaAverageFinal + " m/g");
        System.out.println("Pipe Frame averaged " + pipeAverageFinal + " m/g");
        System.out.println("Badwagon averaged " + badAverageFinal + " m/g");
        
    }
}

//Paste console output below:
/*
Mushroom Cup Prix Racer Average Miles/Per Gallon: 
Royale averaged 31.7 m/g
Koopa King averaged 10.3 m/g
Pipe Frame averaged 20.0 m/g
Badwagon averaged 14.6 m/g

*/


