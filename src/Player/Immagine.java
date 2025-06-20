package Player;

public class Immagine extends Multimediale {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void abbassaLuminosita() {
        //luminosita--;
        if (luminosita > 0) luminosita--;
    }

    public void show() {
        System.out.println(getTitolo() + " " + "*".repeat(luminosita));
    }

}
