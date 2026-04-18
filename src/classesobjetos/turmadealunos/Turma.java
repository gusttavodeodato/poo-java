package classesobjetos.turmadealunos;

import java.util.ArrayList;

public class Turma {
   private ArrayList<Aluno> alunos = new ArrayList<>();

   public void adicionarAluno(Aluno a) {
       alunos.add(a);
   }

   public void calcularMedia() {
       double media = 0;
       for (Aluno a : alunos) {
           media += a.getNota();
       }
       media /= alunos.size();
       System.out.println(media);
   }

   public void exibirAprovados() {
       for (Aluno a : alunos) {
           if (a.getNota() >= 7) {
               System.out.println(a.getNome() + " " + a.getNota() + " - Aprovado.");
           } else {
               System.out.println(a.getNome() + " " + a.getNota() + " - Reprovado.");
           }
       }
   }
}


