package domain;


/**
 * Write a description of class IEMOISException here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IEMOISException extends Exception
{
    public static final String WEEKS_EMPTY = "Semana Vacia";
    public static final String WEEKS_ERROR = "Semana incorrecta";
    public static final String NANO_EMPTY = "Nano Vacio";
    public static final String IMPOSSIBLE = "IMPOSIBLE";
    
    public IEMOISException (String message){
        super(message);
    }
}