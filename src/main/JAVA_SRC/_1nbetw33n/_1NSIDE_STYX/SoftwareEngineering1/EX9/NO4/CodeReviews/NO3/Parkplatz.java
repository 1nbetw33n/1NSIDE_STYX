
package _1nbetw33n._1NSIDE_STYX.SoftwareEngineering1.EX9.NO4.CodeReviews.NO3;

public class Parkplatz implements ParkplatzIF {

    private  Auto geparktesAuto;

    public Parkplatz() {
    }


    @Override
    public boolean istBelegt() {
        return geparktesAuto != null;
    }


    @Override
    public Auto getAuto() {
        return geparktesAuto;
    }

    @Override
    public void einparken(Auto auto) throws ParkplatzBelegtException {
        if (this.istBelegt()) throw new ParkplatzBelegtException();
        this.geparktesAuto = auto;
    }

    @Override
    public Auto ausparken() throws ParkplatzLeerException {
        if (!istBelegt()) throw new ParkplatzLeerException();
        Auto toReturn = this.geparktesAuto;
        this.geparktesAuto = null;
        return toReturn;
    }

}
