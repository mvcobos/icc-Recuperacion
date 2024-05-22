package Models;

/**
 * Clase Carro que representa una entidad Carro con atributos para marca y
 * anio.
 */
public class Carro {
    // Atributos de la clase
    String marca; // Almacena el marca de la caroo
    int anio; // Almacena la anio de la caroo

    /**
     * Constructor para crear una nueva instancia de Carro con un marca y anio
     * específicos.
     * 
     * @param marca Nombre del caroo.
     * @param anio  Año del caroo.
     */
    public Carro(String marca, int anio) {
        this.marca = marca; // Asigna el marca pasado al atributo marca de la clase
        this.anio = anio; // Asigna la anio pasada al atributo anio de la clase
    }

}