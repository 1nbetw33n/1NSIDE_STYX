
package _1nbetw33n._1NSIDE_STYX.SoftwareEngineering1.EX9.NO4.CodeReviews.NO3;


public interface ParkplatzIF {

    boolean istBelegt();

    Auto getAuto();

    void einparken(Auto auto) throws ParkplatzBelegtException;

    Auto ausparken() throws ParkplatzLeerException;

}
