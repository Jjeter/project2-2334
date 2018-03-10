import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DayDataStatistics
{
    /** The set of data. */
    private ArrayList<TimeData> data;

    /** Minimum tair across day. */
    private StatMeasurement tairMin;
    /** Maximum tair across day. */
    private StatMeasurement tairMax;
    /** Average tair across the days. */
    private StatMeasurement tairAverage;

    /** Minimum ta9m across day. */
    private StatMeasurement ta9mMin;
    /** Maximum ta9m across day. */
    private StatMeasurement ta9mMax;
    /** Average ta9m across day. */
    private StatMeasurement ta9mAverage;

    /** Minimum solar radiation across day. */
    private StatMeasurement solarRadiationMin;
    /** Maximum solar radiation across day. */
    private StatMeasurement solarRadiationMax;
    /** Average solar radiation. */
    private StatMeasurement solarRadiationAverage;

    /** Total solarRadiation */
    private StatMeasurement solarRadiationTotal;

    private String stationId = "nada";

    public DayDataStatistics(ArrayList<TimeData> inData)
    {
        data = inData;
        stationId = inData.get(0).getStationID();

        calculateAirTemperatureStatistics("tair");
        calculateAirTemperatureStatistics("ta9m");
        calculateSolarRadiationStatistics();
    }

    private void calculateAirTemperatureStatistics(String tairName)
    {
        // These variables represent the "best so far" for min and max.
        // By setting these these to the largest and smallest possible
        // values, we ensure that the first time a valid Measurement is
        // found, it will replace these values

        // Accumulator and counter for computing average
        double sum = 0;
        int numberOfValidObservations = 0;

        GregorianCalendar minCalendar = new GregorianCalendar();
        GregorianCalendar maxCalendar = new GregorianCalendar();
        
       // FINISH IMPLEMENTATION
    }

    /**
     * Compute and fill in the solar radiation-related statistics
     * (solarRadiationMin, solarRadiationMax, solarRadiationAverage, and
     * solarRadiationTotal).
     * <P>
     * Notes:
     * <UL>
     * <LI>Only valid Measurements can be used in these computations
     * <LI>You may assume that every month has at least one valid Measurement
     * </UL>
     */
    private void calculateSolarRadiationStatistics()
    {
       

    }
    

    /**
     * @return average of solar radiation
     */
    public StatMeasurement getSolarRadiationAverage()
    {
    }

    /**
     * @return maximum value of solar radiation
     */
    public StatMeasurement getSolarRadiationMax()
    {
    }

    /**
     * @return minimum value of solar radiation
     */
    public StatMeasurement getSolarRadiationMin()
    {
    }

    /**
     * @return total value of solar radiation
     */
    public StatMeasurement getSolarRadiationTotal()
    {
    }

    /**
     * @return station ID
     */
    public String getStationID()
    {
    }

    /**
     * @return average value of air temperature at 9m
     */
    public StatMeasurement getTa9mAverage()
    {
    }

    /**
     * @return maximum value of air temperature at 9m
     */
    public StatMeasurement getTa9mMax()
    {
    }

    /**
     * @return minimum value of air temperature at 9m
     */
    public StatMeasurement getTa9mMin()
    {
    }

    /**
     * @return average value of air temperature at 9m
     */
    public StatMeasurement getTairAverage()
    {
    }

    /**
     * @return maximum value of air temperature
     */
    public StatMeasurement getTairMax()
    {
    }

    /**
     * @return minimum value of air temperature
     */
    public StatMeasurement getTairMin()
    {
        return tairMin;
    }



    /**
     * Describe DayStatistics
     * 
     * @return A string describing the statistics for the day
     */
    public String toString()
    {
       

    }
}
