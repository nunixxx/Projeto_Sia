import java.util.*;
class Curso
{    
    String nome, coordenador;
    Alunos[] alunos =  new Alunos[100];
    Alunos[] egressos = new Alunos[100];
    String[] cancelamentos = new String[100];
    Turmas[] turma =  new Turmas[100];
    String[] professores = new String[100];
    int numAlunos=0, numEgressos=0, numCancels=0, numProfs=0, numDisci=0, numTurmas=0;
    Scanner sc = new Scanner(System.in);
        void addDadosCurso(String cursoN, String cursoC){
            nome = cursoN;
            coordenador = cursoC;
        }
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
        void listarProfessores(){
            System.out.println("Professores do Curso" +nome+ ":");
                if(numProfs>0){
                for(int i=0; i<numProfs;i++){
                    System.out.println(i+1 +"º-"+professores[i]);
                }
            }else{
                System.out.println("Ainda não foi adicionado professores ao curso.");
            }
        }
        void listarTurmas(){
            System.out.println("Turmas do curso" +nome+ ":");
            if(numTurmas>0){
                for(int i=0; i<numTurmas; i++){
                    System.out.println("Disciplina: "+ turma[i].disciplina);
                    System.out.println("Professor: "+ turma[i].professor);
                    System.out.println("Alunos: ");
                    for(int x=0; x<turma[i].numAlunos; x++){
                        System.out.println(x+1 +"º-"+ turma[i].alunos[x]+";");
                    }
                }
            }else{
                System.out.println("Ainda não foram adicionadas turmas ao curso!");
            }
        }
    }
