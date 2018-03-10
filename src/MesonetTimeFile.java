import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * @author rafal
 *
 */
public class MesonetTimeFile extends CsFile
{
    private ArrayList<TimeData> data;
    private ArrayList<String> paramIds;
    private HeaderDateTime headerDateTime;

    private static final int NUMBER_OF_PARAMETERS = 0;
    private static final int YEAR = 1;
    private static final int MONTH = 2;
    private static final int DAY = 3;
    private static final int HOUR = 4;
    private static final int MINUTE = 5;
    private static final int SECOND = 6;

    private static final String TAIR = "TAIR";
    private static final String TA9M = "TA9M";
    private static final String SRAD = "SRAD";
    private static final String TIME = "TIME";
    private static final String STID = "STID";

    private int tairPosition = -1;
    private int ta9mPosition = -1;
    private int sradPosition = -1;
    private int minutePosition = -1;
    private int stidPosition = -1;

    private GregorianCalendar dateTime;

    class HeaderDateTime
    {
        public int year;
        public int month;
        public int day;
        public int minute;

        HeaderDateTime(int inYear, int inMonth, int inDay, int inMinute)
        {
            year = inYear;
            month = inMonth;
            day = inDay;
            minute = inMinute;
        }
    }

    /**
     * @param inFileName
     * @throws IOException
     * @throws WrongCopyrightException
     */
    MesonetTimeFile(String inFileName) throws IOException, WrongCopyrightException
    {
        super(inFileName);

        //FINISH IMPLEMENTATION
    }

    /**
     * @param fileName
     * @return 
     * @throws IOException
     * @throws WrongCopyrightException
     * @throws NumberFormatException
     */
    public ArrayList<TimeData> parseFile() throws IOException, WrongCopyrightException
    {
        
    }

    private void parseData(String line)
    {
        if (line != null)
        {
            String[] input = line.trim().split("\\s+");

            TimeData values = new TimeData(input[stidPosition], headerDateTime.year, headerDateTime.month, headerDateTime.day,
                    Integer.parseInt(input[minutePosition]),
                    new Measurement(Double.parseDouble(input[tairPosition])),
                    new Measurement(Double.parseDouble(input[ta9mPosition])),
                    new Measurement(Double.parseDouble(input[sradPosition])));
            data.add(values);
        }
    }

    /**
     * @param inParamStr
     */
    private void parseParamHeader(String inParamStr)
    {
        
    }

    /**
     * @param inCopyrightStr
     * @return
     */
    private void copyrightIsCorrect(String inCopyrightStr) throws WrongCopyrightException
    {
       
    }

    /**
     * @param inHeader
     */
    void parseDateTimeHeader(String inHeader)
    {
        
    }

    /**
     * @return
     */
    String getStarDateTimeStringFromFile()
    {
       
    }

    /**
     * @return
     */
    String getDateTimeString()
    {
       
    }

}
