public class Turmas
{
    private Alunos[] alunos = new Alunos[30];
    private String disciplina, professor;
    private int numAlunos=0;
    public int getNumA(){
        return numAlunos;
    }
    public Alunos getAlunos(int numA){
        return alunos[numA];
    }
    public void matricular(Alunos novoAluno){
        if(numAlunos<30){
        boolean procura = false;
        for(int i=0; i<numAlunos;i++){
            if(alunos[i] == novoAluno){
                System.out.println("O aluno "+alunos[i].getNome()+" já está matriculado.");
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
    public void listagemAlunos(){
    if(numAlunos>0){
        System.out.println("Lista alunos e nota(s):");
        for(int i=0; i<numAlunos; i++){
            System.out.println("Nome: "+ alunos[i].getNome());
            System.out.println("Notas: ");
            //System.out.println(alunos[i].getNotas());
            for(int x=0; x< alunos[i].getCont();x++){
                System.out.println(x+1+"º "+alunos[i].getNotas(x)+";");
            }
        }
        
    }else{
        System.out.println("Nenhum aluno foi adicionado, por favot adicione alguem antes da listagem.");
    }
    }
    public void addNotas(double novaNota){
        alunos[numAlunos].addNota(novaNota);
    }
    public void addProfeDisci(String prof, String disci){
        professor = prof;
        disciplina = disci;
    }
    public String getProf(){
        return professor;
    }
    public String getDisci(){
        return disciplina;
    }
}
