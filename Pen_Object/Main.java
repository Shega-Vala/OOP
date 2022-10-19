public class Main {
    
    
    public static void main(String [] args) {

        Pen pen = new Pen();
        Pen2 pen2 = new Pen2();
        Headphones h = new Headphones();
    System.out.println(pen.color);
    System.out.println(pen.point);
    System.out.println(pen.type);
    System.out.println(Pen.clicked);
    Pen.click();
    System.out.println(Pen.clicked);

    System.out.println(Pen2.twisted);
    Pen2.twist();
    System.out.println(Pen2.twisted);
    System.out.println(Headphones.volume);
    Headphones.volumeOn();
    Headphones.volumeOn();
    Headphones.volumeOn();
    System.out.println(Headphones.volume);
    Headphones.volumeOff();
    System.out.println(Headphones.volume);
    System.out.println(Headphones.playing);
    Headphones.play();
    System.out.println(Headphones.playing);
    Headphones.pause();
    System.out.println(Headphones.playing);






    }
    
}
