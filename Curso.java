import java.util.Scanner;
public class Curso
  {    
    private String nome, coordenador;
    private Alunos[] alunos =  new Alunos[100];
    private Alunos[] egressos = new Alunos[100];
    private Alunos[] cancelamentos = new Alunos[100];
    private Turmas[] turma =  new Turmas[100];
    private String[] professores = new String[100];
    private int numAlunos=0, numEgressos=0, numCancels=0, numProfs=0, numDisci=0, numTurmas=0;
    private Scanner sc = new Scanner(System.in);
        public void addDadosCurso(String cursoN, String cursoC){
            nome = cursoN;
            coordenador = cursoC;
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
                for(int x=0; x< alunos[i].getCont();x++){
                        System.out.println(x+1+"º "+alunos[i].getNotas(x)+";");
                }
            }
        
            }else{
            System.out.println("Nenhum aluno foi adicionado, por favot adicione alguem antes da listagem.");
            }
        }
        public void listarProfessores(){
            System.out.println("Professores do Curso" +nome+ ":");
                if(numProfs>0){
                for(int i=0; i<numProfs;i++){
                    System.out.println(i+1 +"º-"+professores[i]);
                }
            }else{
                System.out.println("Ainda não foi adicionado professores ao curso.");
            }
        }
        public void listarTurmas(){
            System.out.println("Turmas do curso" +nome+ ":");
            if(numTurmas>0){
                for(int i=0; i<numTurmas; i++){
                    System.out.println("Disciplina: "+ turma[i].getDisci());
                    System.out.println("Professor: "+ turma[i].getProf());
                    System.out.println("Alunos: ");
                    for(int x=0; x<turma[i].getNumA(); x++){
                        System.out.println(x+1 +"º-"+ turma[i].getAlunos(x)+";");
                    }
                }
            }else{
                System.out.println("Ainda não foram adicionadas turmas ao curso!");
            }
        }
        public void moverEgresso(Alunos alunoE){
            boolean procura = false;
                for(int i=0; i<100; i++){
                    for(int x=0;x<turma[i].getNumA();x++){
                        if(alunos[x] == alunoE){
                            procura = true;
                            alunoE.setStatus('E');
                            egressos[numEgressos] = alunoE;
                            numEgressos++;
                            
                            break;
                        }
                    }
                }
                if (!procura){
                    System.out.println("Aluno não existe no sistema!");
                }
        }
         public void excluir(Alunos alunoC){
            boolean procura = false;
                for(int i=0; i<100; i++){
                    for(int x=0;x<turma[i].getNumA();x++){
                        if(alunos[x] == alunoC){
                            procura = true;
                            alunoC.setStatus('C');
                            cancelamentos[numCancels] = alunoC;
                            numCancels++;
                            
                            break;
                        }
                    }
                }
                if (!procura){
                    System.out.println("Aluno não existe no sistema!");
                }
        }
}
