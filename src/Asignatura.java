public class Asignatura {
    int codigo;
    String nombre;


    //Constructor

    public Asignatura(int _codigo, String _nombre) {
        super();
        this.codigo= _codigo;
        this.nombre= _nombre;
    }


    // Getter y Setter

    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    


    
} // Fin clase Asignatura
