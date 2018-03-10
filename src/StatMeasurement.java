import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.TimeZone;


/**
 * @author rafal
 *
 */
public class StatMeasurement extends Measurement implements TimeComparable
{
    private GregorianCalendar dateTimeOfMeasurment;
    private String paramId;
    private StatType statType;
    private String stationId;
    private static final String NADA = "nada";

    /**
     * constructor
     */
    public StatMeasurement()
    {
    }

    /**
     * @param inValue
     *            value of the measurement
     */
    public StatMeasurement(double inValue, GregorianCalendar obsDateTime, String inStationId, 
            String inParamId, StatType inStatType)
    {
       
    }
    
    /**
     * @return
     */
    public GregorianCalendar getDateTimeOfMeasurment()
    {
    }
    
    /**
     * @param inParamId
     */
    public void setParamId(String inParamId)
    {
    }
    
    
    /**
     * @return
     */
    public String getParamId()
    {
    }
    
    
    /**
     * @param type
     */
    public void setStatType(StatType type)
    {
    }
    
    
    /**
     * @return
     */
    public StatType getStatType()
    {
        return statType;
    }

    /**
     * Compare this Measurement with another Measurement
     * 
     * @param compareWith
     *            Measurement to compare with
     * @return true if both Measurements are valid AND this is strictly smaller than s OR
     *         if this is valid and s is not valid
     */
    public boolean isLessThan(StatMeasurement compareWith)
    {
        
    }

    /**
     * Compare this Measurement with another Measurement
     * 
     * @param compareWith
     *            Measurement to compare with
     * @return true if both Measurements are valid AND this is strictly larger than s OR
     *         if this is valid and s is not valid
     */
    public boolean isGreaterThan(StatMeasurement compareWith)
    {
       
    }

    /*
     * (non-Javadoc)
     * 
     * @see TimeComparable#newerThan(java.lang.String)
     */
    public boolean newerThan(String inDateTime) throws ParseException
    {
    }

    /*
     * (non-Javadoc)
     * 
     * @see TimeComparable#olderThan(java.lang.String)
     */
    public boolean olderThan(String inDateTime) throws ParseException
    {
    }


    
    /**
     * @param inDateTime
     * @return
     * @throws ParseException
     */
    public int compareWithTimeString(String inDateTime) throws ParseException
    {
       
    }

    /* (non-Javadoc)
     * @see Measurement#toString()
     */
    @Override
    public String toString()
    {
        
    }
    
}
