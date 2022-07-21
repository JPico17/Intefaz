package Interfaz;

public class Bici implements IRueda, ISilla
{

    public void avanzar() 
    {   
        System.out.println("El bicicleta avanza");
    }

    public void detenerse() 
    { 
        System.out.println("El bicicleta se detiene");
    }
    public void sentarse() 
    { 
        System.out.println("Sentarse");
    }
    
}
