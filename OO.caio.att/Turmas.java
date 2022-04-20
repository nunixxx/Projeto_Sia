class Turmas
{
    Alunos[] alunos = new Alunos[30];
    String disciplina, professor;
    int numAlunos=0;
    void matricular(Alunos novoAluno){
        if(numAlunos<30){
        boolean procura = false;
        for(int i=0; i<numAlunos;i++){
            if(alunos[i] == novoAluno){
                System.out.println("O aluno "+alunos[i].nomeA+" já está matriculado.");
                procura = true;
                break;
            }
        }
        if(!procura){
            alunos[numAlunos] = novoAluno;
            numAlunos++;
        }
    }else{
        System.out.println("Número de alunos máximo em uma turma atingido.");
    }
    }
    void listagemAlunos(){
    if(numAlunos>0){
        System.out.println("Lista alunos e nota(s):");
        for(int i=0; i<numAlunos; i++){
            System.out.println("Nome: "+ alunos[i].nomeA);
            System.out.println("Notas: ");
            for(int x=0; x< alunos[i].cont;x++){
                System.out.println(x+1+"º "+alunos[i].notas[x]+";");
            }
        }
        
    }else{
        System.out.println("Nenhum aluno foi adicionado, por favot adicione alguem antes da listagem.");
    }
    }
    void addNotas(double novaNota){
        alunos[numAlunos].addNota(novaNota);
    }
    void addProfeDisci(String prof, String disci){
        professor = prof;
        disciplina = disci;
    }
}
