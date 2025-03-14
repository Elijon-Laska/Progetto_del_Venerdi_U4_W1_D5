package Player.multimediale;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile {
    private int volume;

    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo, durata);
        this.volume = volume;
    }

    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void alzaVolume() {
        volume++;
    }

    @Override
    public void play() {
        for (int i = 0; i < getDurata(); i++) {
            String livello = " ---Livello volume 🔊: ";

            for (int j = 0; j < volume; j++) {
                livello += "! ";
            }

            System.out.println(getTitolo() + livello + "---");
        }
    }
}


