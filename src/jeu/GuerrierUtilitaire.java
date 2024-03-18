package jeu;

public class GuerrierUtilitaire {
    public static void afficheGuerrier(Guerrier guerrier) {
        System.out.println("Points de vie: "+guerrier.getPointDeVie()+", Force: "+ guerrier.getForce());
    }
    public static int de3() {
        return (int) (Math.random()*3);

    }
    public static int de3(int nombreLance) {
        int n=0;
        for (int i=0; i<nombreLance; i++) {
            n=n+de3();
        }
        return n;
    }
}
