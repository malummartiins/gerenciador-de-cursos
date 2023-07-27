import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();

        /*a principal diferença do Set para o List é que voce
         * nao consegue saber em que ordem os itens estão e nem em 
         * que ordem vão aparecer no sistema.
         */
        
         alunos.add("Rodrigo T");
         alunos.add("Alberto S");
         alunos.add("Nico S");
         alunos.add("Sergio L");
         alunos.add("Renan S");
         alunos.add("Mauricio A");

         //para verificar se tem algum item no conjunto:
         boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
            System.out.println(pauloEstaMatriculado);
        
         System.out.println(alunos); //ele nao imprime na ordem

        //uso foreach para acessar os elementos;
        for (String aluno 
        : alunos) {
            System.out.println(aluno);
        }

        //uma das vantagens do set é que ele nao aceita elementos repetidos
        //Collections.sort só funciona com listas - no set nao;




    }
}
