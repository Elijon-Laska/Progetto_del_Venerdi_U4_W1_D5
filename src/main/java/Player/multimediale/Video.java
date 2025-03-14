package Player.multimediale;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Video extends ElementoMultimediale implements Riproducibile{
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata);
        this.volume = volume;
        this.luminosita = luminosita;
    }

    public void alzaVolume() {
        volume++;
    }

    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
    }

    @Override
    public void play() {
        for (int i = 0; i < getDurata(); i++) {
            String livelloVolume = " ---Livello volume 🔊: ";
            String livelloLuminosita = " ---Livello luminosita 🔆: ";

            for (int j = 0; j < volume; j++) {
                livelloVolume += "! ";
            }
            for (int j = 0; j < luminosita; j++) {
                livelloLuminosita += "* ";
            }

            System.out.println(getTitolo() + livelloVolume + "---" + livelloLuminosita + "---");
        }
    }
}

