
/**
 * Write a description of class Enigma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enigma
{

    /**
     * Constructor for objects of class Enigma
     */
    public Enigma()
    {

    }

    /**
     * Encripta el mensaje
     */
    public int encripta(Mecanismo mecanismo,int num)
    {
        int encriptado = -1;
        if (mecanismo instanceof MecanismoMultiplicacionPrimo) {        
            if (num > 10) {
                encriptado= mecanismo.getNumero() * num;        
            } 
        }
        return encriptado;
    }
    
    /**
     * Desencripta el mensaje
     */
    public int desencripta(Mecanismo mecanismo,int num) {
        int desencriptado = -1;
        if (mecanismo instanceof MecanismoMultiplicacionPrimo) {        
            if (num /mecanismo.getNumero() > 10) {
                desencriptado= num /mecanismo.getNumero();        
            }  else {            
                desencriptado = -1;
            }      
        } 
        
        return desencriptado;
    }
}
