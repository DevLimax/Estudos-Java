package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        // metodos de adicionar um elemento.
        usuarios.put(1, "Roberto");
        usuarios.put(2, "Gabriel");
        usuarios.put(3, "Vinicius");
        usuarios.put(4, "Lucas");
        usuarios.put(5, "Alex");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(211));
        System.out.println(usuarios.containsValue("Lucas"));

        for (int id: usuarios.keySet()) {
            System.out.println(id); // aqui inprimimos as chaves dos elementos
        }

        for (String value: usuarios.values()) {
            System.out.println(value); // aqui retorna os valores dos elementos
        }

        for (Entry<Integer, String> elemento: usuarios.entrySet()) {
            System.out.println(elemento);// aqui retorna tanto as chaves quanto os valores dos elementos, juntos.
        }


    }
}
