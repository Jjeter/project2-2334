
public abstract class StatisticsAbstract 
{    
    public abstract StatMeasurement getMinimumDay(String inParamId) throws WrongParameterIdException;
    public abstract StatMeasurement getMaximumDay(String inParamId) throws WrongParameterIdException;   

}
