package Controllers;
import java.util.Arrays;
import Models.Persona;

/**
 * Controlador para manejar la lógica de operaciones sobre arrays de Carross.
 * 
 * 
 * Generar los metdoos necesarions para ordenar un array de personas por edad en
 * orden descendente
 * y para la busqueda binaria de una persona por edad.
 * 
 */
public class PersonaController {


    public Persona[] sortEdadBySelection(Persona[] arreglo){
        int n = arreglo.length;
        for(int i = 0; i < n; i++){
                int indiceMinimo = i;
                for(int j = i + 1; j < n; j++){
                        if(arreglo[indiceMinimo].getEdad() < arreglo[j].getEdad()){
                                indiceMinimo = j;
                        }
                }
                Persona anioMenor = arreglo[indiceMinimo];
                arreglo[indiceMinimo] = arreglo[i];
                arreglo[i] = anioMenor;
        }
        return arreglo;
    }

    public int busBinEdad(Persona[] arreglo, int edadBuscar){
        int inicio = 0;
        int fin = arreglo.length - 1;
        while(inicio <= fin){
            int medio = inicio + (fin - inicio) / 2;
            if(arreglo[medio].getEdad() == edadBuscar){
                return medio;
            }
            if(edadBuscar < arreglo[medio].getEdad()){
                inicio = medio + 1;
            } else if (edadBuscar > arreglo[medio].getEdad()){
                fin = medio -1; 
            }
        }
        return -1;
    }

    public void printArreglo(Persona[] arreglo){
        int cont = 0;
        for(Persona elemento: arreglo){
                System.out.println( cont + ") nombre: " +  elemento.getNombre() + " | edad: " + elemento.getEdad());
                cont++;
        }
    }

    public void printPosicion(int posicionArreglo, String buscado){
        if(posicionArreglo == -1){
                System.out.println(buscado + " a buscar no se encuentra en el arreglo");
        } else {
                System.out.println(buscado + " a buscar está en la posición " + posicionArreglo);
        }
    }

    public Persona[] sortNombreByInsertion(Persona[] arreglo) {
        int tam = arreglo.length;
        for (int i = 1; i < tam; i++) {
            Persona aux = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j].getNombre().compareTo(aux.getNombre()) > 0) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = aux;
        }
        return arreglo;
    }

    public int busBinNombre(Persona[] arreglo, String nombreBuscar){
        int inicio = 0;
        int fin = arreglo.length - 1;
        while(inicio <= fin){
            int medio = inicio + (fin - inicio) / 2;
            if(arreglo[medio].getNombre().compareTo(nombreBuscar) == 0){
                return medio;
            }
            if(arreglo[medio].getNombre().compareTo(nombreBuscar) > 0){
                fin = medio -1; 
            } else if (arreglo[medio].getNombre().compareTo(nombreBuscar) < 0){
                inicio = medio + 1;
            }
        }
        return -1;
    }

    public void printDatos(Persona[] arreglo, int num){
        System.out.println("Datos de la persona:");
        System.out.println("nombre: " + arreglo[num].getNombre() + "| edad: " + arreglo[num].getEdad());
    }

}

