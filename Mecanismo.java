
/**
 * Write a description of class Mecanismo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Mecanismo
{
    // instance variables - replace the example below with your own
    private int numero;

    /**
     * Constructor for objects of class Mecanismo
     */
    public Mecanismo(int numero)
    {
       this.numero = numero;
    }
    
    public int getNumero() {
            return numero;    
    }
}
