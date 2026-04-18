package classesobjetos.turmadealunos;

public class TurmaTeste {
    public static void main(String[] args) {

        Aluno alunoGus = new Aluno("Gustavo", 10);
        Aluno alunoIan  = new Aluno("Ryan", 9);
        Aluno alunoJan  = new Aluno("Jana", 4);
        Aluno alunoPol  = new Aluno("Poliana", 8);
        Aluno alunoLet  = new Aluno("Letícia", 9);

        Turma turma = new Turma();

        turma.adicionarAluno(alunoGus);
        turma.adicionarAluno(alunoIan);
        turma.adicionarAluno(alunoJan);
        turma.adicionarAluno(alunoPol);
        turma.adicionarAluno(alunoLet);

        System.out.println("\nMédia da turma: ");
        turma.calcularMedia();
        System.out.println("\n===================");

        System.out.println("\nAlunos da turma: ");
        turma.exibirAprovados();
    }
}
