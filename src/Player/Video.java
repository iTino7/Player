package Player;

public class Video extends Multimediale implements Riproducibile {
    int durata;
    int volume;
    int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    @Override
    public void play() {
        String segnaleVolume = "!".repeat(volume);
        String segnaleLuce = "*".repeat(luminosita);

        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo() + segnaleVolume + segnaleLuce);
        }

    }

    @Override
    public int getDurata() {
        return durata;
    }

    public void alzaVolume() {
        volume++;
    }

    public void abbassaVolume() {
        //volume--;
        if (volume > 0) volume--;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        //luminosita--;
        if (luminosita > 0) luminosita--;
    }


}
