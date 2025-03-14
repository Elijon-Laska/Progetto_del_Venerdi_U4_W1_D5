package it.epicode.PlayerMultimediale;

import it.epicode.PlayerMultimediale.Interface.Riproducibile;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PlayerMultimediale {
    public void esegui(ElementoMultimediale elemento) {
        if (elemento instanceof Immagine) {
            ((Immagine) elemento).show();
        } else if (elemento instanceof Riproducibile) {
            ((Riproducibile) elemento).play();
        } else {
            System.out.println("Tipo non supportato");
        }
    }
}

