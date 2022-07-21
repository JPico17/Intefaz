package Interfaz;

public class Test 
{
    public static void main(String[] args) 
    {
        Carro c = new Carro();
        Bici b = new Bici();

        c.avanzar();
        c.detenerse();
        c.sentarse();

        b.avanzar();
        b.detenerse();
        b.sentarse();
        
    }
    
}
