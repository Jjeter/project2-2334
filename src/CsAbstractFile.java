import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class CsAbstractFile implements  TimeComparable
{
    protected File file;
    protected DateFormat dateFormat;
    /**
     * time format used for strings
     */
    protected final static String dateTimeFormat = "yyyy-MM-dd'T'HH:mm:ss z";
    protected String fileName;
    
 
    /**
     * 
     */
    protected CsAbstractFile(String inFileName)
    {
      
    }
    
    /**
     * @return
     */
    public boolean exists()
    {

    }
    
    /**
     * @return
     */
    public long getDateModified()
    {

    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
    }

    public abstract  int compareWithTimeString(String inDateTimeStr) throws ParseException;
}
