import Player.Audio;
import Player.Immagine;
import Player.Multimediale;
import Player.Video;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Multimediale[] elementi = new Multimediale[5];

        elementi[0] = new Immagine("Tramonto", 4);
        elementi[1] = new Audio("Podcast", 3, 5);
        elementi[2] = new Video("Tutorial", 4, 5, 2);
        elementi[3] = new Audio("Musica", 3, 4);
        elementi[4] = new Immagine("Immagine", 8);


    }
}