import java.text.ParseException;
import java.util.Date;

public class CsFile extends CsAbstractFile
{
    /**
     * @param inFileName
     */
    public CsFile(String inFileName)
    {

    }
    
    public String getFileName()
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
        return compareWithTimeString(inDateTime) == -1 ? true : false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see CsAbstractFile#compareTo(java.lang.String)
     */
    @Override
    public int compareWithTimeString(String inDateTime) throws ParseException
    {

    }
}