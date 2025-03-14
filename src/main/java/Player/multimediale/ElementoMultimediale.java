package Player.multimediale;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class ElementoMultimediale {
    private String titolo;
    private int durata;

    public abstract void play();
}

