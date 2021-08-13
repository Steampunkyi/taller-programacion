package peUTP;

/**
 * Practica con Java
 *
 * @author Steampunkyi
 * @version 1.0
 */

public class practica {
    private Integer id;
    private String nombre;

    public practica() {
    }

    /**
     * Constructor
     *
     * @param id     id de la persona
     * @param nombre nombre de la persona
     */
    public practica(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
