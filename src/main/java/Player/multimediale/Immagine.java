package Player.multimediale;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Immagine extends ElementoMultimediale {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo, 0);
        this.luminosita = luminosita;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
    }

    public void show() {
        String livelloLuminosita = " ---Livello luminosita 🔆: ";
        for (int i = 0; i < luminosita; i++) {
            livelloLuminosita += "* ";
        }
        System.out.println(getTitolo() + livelloLuminosita + "---");
    }

    @Override
    public void play() {
        throw new UnsupportedOperationException("Le immagini non possono essere riprodotte");
    }
}

