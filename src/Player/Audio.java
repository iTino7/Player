package Player;

public class Audio extends Multimediale implements Riproducibile {
    private int durata;
    private int volume;

    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    @Override
    public void play() {
        String segnale = "!".repeat(volume);
        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo() + segnale);
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
        volume--;
    }
}


