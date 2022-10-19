public class Headphones {

    String charge = "Micro usb";
    String [] controls = {"power", "volume","isPlaying"};
    String color = "white";

    static boolean power = false;
    static int volume = 0;
    static boolean playing = false;


    static void powerOn(){
        power = true;
    }
    static void powerOff(){
        power = false;
    }
    static void volumeOn(){
        volume++;
    }
    static void volumeOff(){
        volume--;
    }

    static void play(){
        playing = true;
        
    }
    static void pause(){
        playing = false;
        
    }

    
}
