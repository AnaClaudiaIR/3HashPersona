import java.util.HashMap;

public class MainHashMapPersona {
    public static void main(String[] args) {
        HashMap<String, Integer> personas = new HashMap<>();
        personas.put("Marcelo", 10);
        personas.put("Laura", 25);
        personas.put("Estefan", 45);
        personas.put("Gabriela", 3);
        personas.put("María", 79);

        //Imprimir los elementos del mapa --> Se obtiene la clave y el valor de esta.
        for (String key : personas.keySet()) {
            System.out.println(key + " - " + personas.get(key));
        }

        System.out.println(personas.get("Marcelo")); //Obtener valor según la clave --> Edad
    }
}