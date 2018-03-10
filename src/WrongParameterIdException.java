
public class WrongParameterIdException extends Exception
{
    /**
     * 
     */
    private static final long serialVersionUID = 7394973112258653626L;

    public WrongParameterIdException()
    {
        super("Invalid parameterID detected");
    }
    
    public WrongParameterIdException(String msg)
    {
        super(msg + " Invalid parameterID detected");
    }
}
