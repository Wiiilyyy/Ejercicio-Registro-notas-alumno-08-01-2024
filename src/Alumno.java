public class Alumno {

    /*Definimos los atributos */ /*Existen public, private y protected */

    private String dni;
    private String nombre;
    private String apellidos;
    private String email;


    /*Hacemos el Constructor. Que este sería el que vendría por defecto en caso de no hacerlo nosotros */

    public Alumno() {

    }

    /*Hacemos los Parámetros */

    /*Lo pone el profe con barrabaja para saber diferenciar de los atributos de arriba con los que ponemos ahora a continuacion */
    public Alumno(String _dni, String _nombre, String _apellidos, String _email) {

        /*El profe pone this porque le salen las opciones a elegir. Pero realmente no sería necesario ponerlo*/

        this.dni= _dni;
        this.nombre= _nombre;
        this.apellidos=_apellidos;
        this.email=_email;
    }


    /*Definir los Getter y los Setter */

    public String getDni() {

        return this.dni;
    }

    public void setDni(String _dni) {

        this.dni= _dni;
    }

     public String getNombre() {

        return this.nombre;
    }

    public void setNombre(String _nombre) {

        this.dni= _nombre;
    }

    public String getApellidos() {

        return this.apellidos;
    }

    public void setApellidos(String _apellidos) {

        this.apellidos= _apellidos;
    }
    
    public String getEmail() {

        return this.email;
    }

    public void setEmail(String _email) {

        this.email= _email;
    }


} // Fin clase Alumno
