import Player.multimediale.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlayerMultimediale player = new PlayerMultimediale();
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        Scanner scanner = new Scanner(System.in);


        elementi[0] = new Immagine("--- 📷 Foto 1--- ", 3);
        elementi[1] = new Video("--- 📽️ Video 1--- ", 5, 3, 2);
        elementi[2] = new RegistrazioneAudio("--- 🎙️ Audio 1--- ", 4, 5);
        elementi[3] = new Video("--- 📹 Video 2--- ", 5, 4, 3);
        elementi[4] = new Immagine("--- 📸 Foto 2--- ", 2);


        int scelta;
        do {
            System.out.println(" ▶️ Avvia il lettore multimediale inserendo l'elemento che vuoi eseguire (scegli tra 1, 2, 3, 4, 5 oppure inserisci 0 per terminare)...");
            scelta = scanner.nextInt();

            if (scelta > 0 && scelta <= 5) {
                player.esegui(elementi[scelta - 1]);
            } else if (scelta != 0) {
                System.out.println("🛑 L'elemento che hai selezionato non è compreso tra le tue scelte disponibili. Riprova ⏸️ ");
            }
        } while (scelta != 0);

        scanner.close();
        System.out.println("Lettore multimediale terminato ⏯️. Grazie per aver utilizzato EpicMultimediale. A presto 👋😄");
    }
}
