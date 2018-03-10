import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;


/**
 * @author rafal
 *
 */
public class DaysStatistics extends StatisticsAbstract
{
    private ArrayList<String> files;

    private ArrayList<StatMeasurement> tairMinStats;
    private ArrayList<StatMeasurement> tairAvgStats;
    private ArrayList<StatMeasurement> tairMaxStats;

    private ArrayList<StatMeasurement> ta9mMinStats;
    private ArrayList<StatMeasurement> ta9mAvgStats;
    private ArrayList<StatMeasurement> ta9mMaxStats;

    private ArrayList<StatMeasurement> sradMinStats;
    private ArrayList<StatMeasurement> sradAvgStats;
    private ArrayList<StatMeasurement> sradMaxStats;
    private ArrayList<StatMeasurement> sradTotalStats;

    public DaysStatistics(String[] files)
    {
        this.files = new ArrayList<String>(Arrays.asList(files));
        
     // FINISH IMPLEMENTATION
    }

    /**
     * @param files
     * @throws IOException
     * @throws WrongCopyrightException
     * @throws ParseException
     */
    public void findStatistics() throws IOException, WrongCopyrightException, ParseException
    {
        for (String fileName : files)
        {
            MesonetTimeFile mtsFile = new MesonetTimeFile(fileName);
            mtsFile.parseFile();
            ArrayList<TimeData> data = mtsFile.parseFile();
            DayDataStatistics dataStats = new DayDataStatistics(data);

            assignStats(dataStats);
        }
    }

    /**
     * @param dataStats
     * @throws ParseException
     */
    private void assignStats(DayDataStatistics dataStats) throws ParseException
    {
        tairMinStats.add(dataStats.getTairMin());
        // FINISH IMPLEMENTATION
    }

    /*
     * (non-Javadoc)
     * 
     * @see StatisticsAbstract#getMinimumDay(java.lang.String)
     */
    @Override
    public StatMeasurement getMinimumDay(String inParamId) throws WrongParameterIdException
    {
   
    }

    /*
     * (non-Javadoc)
     * 
     * @see StatisticsAbstract#getMaximumDay(java.lang.String)
     */
    @Override
    public StatMeasurement getMaximumDay(String inParamId) throws WrongParameterIdException
    {
        
    }

    public String combineMinMaxStatistics(String paramId) throws WrongParameterIdException
    {       
        StatMeasurement maximumDay = getMaximumDay(paramId);
        StatMeasurement miniumuDay = getMinimumDay(paramId);
        return maximumDay.toString() + "\n" + miniumuDay.toString() + "\n";
    }
    
    
    
    public String toString()
    {

    }

}
