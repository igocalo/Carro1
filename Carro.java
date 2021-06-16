
/**
 * Write a description of class Carro here.
 * 
 * @author (Igocalo) 
 * @version (1.0)
 */
public class Carro
{
    //En esta parte vamos a definir 3 atributos y un valor,1 atributo nos dira si el carro esta o no encendido, siempre seguiremos esta estrucura private gestiona
    //la ocultacion, el tipo de dato, nombre del atributo.
    
    private String color; //cadena de texto
    private double galones; //porque es tipo decimal
    private boolean encendido;
    
    
    /**
     * Constructor for objects of class Carro
     */
    public Carro()
    {
        // Vamos a darle valor a los atributos en esta seccion (el constructor)
        this.color = "negro"; //usaremos la palabrareserada this que hace referencia a la propia clase
        this.galones = 30.5; 
        this.encendido = false;// por defecto lo dejaremos que no esta arrancado
        
    }
    public Carro(String newColor, double newGalones, boolean newEncendido)
    //que tendremos que hacer con estos atributos que nos pasen aqui? pues tendriamos asignarlos a los atributos de la clase.
    {
        // Vamos a darle valor a los atributos en esta seccion (el constructor)
        this.color = newColor; //usaremos la palabrareserada this que hace referencia a la propia clase
        this.galones = newGalones; 
        this.encendido = newEncendido;// por defecto lo dejaremos que no esta arrancado
        
    }
    //Para crear los metodos de modificacion partimos desde aca utilizamos la palabra reservada public vamos a tener que agregar void ya  que se utiliza con un
    //modificador el atributo
    
    public void setColor (String newColor){
        //Se utiliza la nomenclatura set
        this.color = newColor;
    }
    public void setGalones (double newGalones){
        //Se utiliza la nomenclatura set
        this.galones = newGalones;
    }
    public void setEncendido (boolean newEncendido){
        //Se utiliza la nomenclatura set
        this.encendido = newEncendido;
    }
}   
