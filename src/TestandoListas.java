import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) throws Exception {

        String aula1 = "Modelando a classe Aula";
        String aula2 = "Conhecendo mais de listas";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        /*
         * caso eu quisesse remover algum item do array list
         * poderia por aulas.remove() e passar por parametro qual obj
         * quero deletar da lista (passo o index do obj) --
         * aulas.remove(0); iria excluir a aula1 da lista
         */

        for (String aula : aulas) { // para cada string aula dentro de aulas faça o seguinte (bloco de code)
            System.out.println("Aula: " + aula);
        }
        System.out.println();

        for (int i = 0; i < aulas.size(); i++) { // ao contrario de array, nao usamos .length para coleçoes usamos
                                                 // .size()
            System.out.println("Aula: " + aulas.get(i));

        }
        System.out.println();
        System.out.println(aulas.size());

        //colletctions - classe para ordenar coleções
        aulas.add ("Aumentando o nosso conhecimento");
        Collections.sort(aulas); //MUITO USADO
        System.out.println(aulas);

    }
}
