
package _1nbetw33n._1NSIDE_STYX.SoftwareEngineering1.EX9.NO4.CodeReviews.NO2;


public class Parkplatz implements ParkplatzIF {

    int verfuegbarePlatz;    // anzahl verfügbare Plätze;

    public Parkplatz(int verfuegbarePlatz) {            // Konstruktor Parkplatz
        this.verfuegbarePlatz = verfuegbarePlatz;
    }


    public int freiplatz() {                        // verfuegbare Plätze
        return verfuegbarePlatz;
    }


    public boolean isVoll() {                        //prueft ob es noch Platz gibt
        return this.verfuegbarePlatz == 0;
    }

}

/*class zum erzeugen eines Auto */
class Auto {

    Parkplatz p;

    public Auto(Parkplatz p) {                 // Konstruktor Auto
        this.p = p;
    }

    void parken() {                        // Auto parkt im Parkplatz
        this.p.verfuegbarePlatz -= 1;
    }

}

