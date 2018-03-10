import java.text.ParseException;

public interface TimeComparable 
{
    boolean newerThan(String inDateTimeStr) throws ParseException;
    boolean olderThan(String inDateTimeStr) throws ParseException;
}