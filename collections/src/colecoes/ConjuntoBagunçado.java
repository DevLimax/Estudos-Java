package colecoes;

import java.util.HashSet;

@SuppressWarnings("all")
public class ConjuntoBagunçado {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();
        conjunto.add(1.2); // double -> Double (obj)
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho é: "+ conjunto.size());

        // adicionando repetições para o SET validar;
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho é: "+ conjunto.size()); // aqui ele ira mostrar o mesmo valor do print acima, pois as inserções colocadas após
        // o primeiro print são inserções ja pertencentes ao conjunto que criamos, o SET não permiti repetições de valores, independente do tipo/classe;

        // removendo objs na lista;
        // o metodo .remove() retorna um boolean, se ele tiver removido: True, se não: False
        System.out.println(conjunto.remove("teste")); // aqui ele não ira remover porque o valor que está na lista começa com o "t" de Teste em maiusculo
        System.out.println(conjunto.remove('x'));
        System.out.println(conjunto.remove(1.2));
        System.out.println("Tamanho é: "+ conjunto.size());

        // metodo .contains() na lista para verificar se existe algum objeto em especifico.
        System.out.println(conjunto.contains("Teste")); // retorna um boolean, se o objeto inserido estiver na lista: True, se não: False

        //---------------------------------------------------------

        HashSet nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(conjunto);
        System.out.println(nums);

        //conjunto.retainAll(nums); interseção - ira juntar as listas mas somente com os valores que são iguais em ambas;
        conjunto.addAll(nums); // junção: ira juntar as listas com todos os valores, mas sem duplicação. oque estiver contido nas duas listas não sera repetido.
        conjunto.clear(); //ira resetar a lista deixando a mesma sem objetos/valores;

        System.out.println(conjunto);
    }
}