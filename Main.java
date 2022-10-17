public class Main {
    
    
    public static void main(String [] args) {

        Pen pen = new Pen();
        Pen2 pen2 = new Pen2();
        Headphones h = new Headphones();
    System.out.println(pen.color);
    System.out.println(pen.point);
    System.out.println(pen.type);
    System.out.println(pen.clicked);
    pen.click();
    System.out.println(pen.clicked);

    System.out.println(pen2.twisted);
    pen2.twist();
    System.out.println(pen2.twisted);
    System.out.println(h.volume);
    h.volumeOn();
    h.volumeOn();
    h.volumeOn();
    System.out.println(h.volume);
    h.volumeOff();
    System.out.println(h.volume);
    System.out.println(h.playing);
    h.play();
    System.out.println(h.playing);
    h.pause();
    System.out.println(h.playing);






    }
    
}
