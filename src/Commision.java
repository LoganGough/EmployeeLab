public class Commision extends Hourly
{
    private double commision;
    private double totalSales;


    public Commision(String eName, String eAddress, String ePhone, double socSecNumber, double rate, double commision){

        super( eName,  eAddress,  ePhone, socSecNumber,  rate);
    }

}
