
public class WrongTimeZoneException extends Exception
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WrongTimeZoneException()
    {
        super("Invalid time zone detected, should be UTC");
        // default implementation ignored
    }
}
