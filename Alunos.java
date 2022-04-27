public class Alunos
{
    private char status = 'M';
    private String nomeA;
    private DataDeNascimento dataNascimento = new DataDeNascimento();
    private double[] notas = new double[5];
    private double media=0;
    private int cont=0, idade;
    public int getCont(){
        return cont;
    }
    public void setStatus(char status){
        this.status = status;
    }
    public char getStatus(){
        return status;
    }
    public void addNomeA(String theNome){
        nomeA = theNome;
    }
    public String getNome(){
        return nomeA;
    }
    public void addData(int diaa, int mess, int anoo){
        dataNascimento.setDia(diaa);
        dataNascimento.setMes(mess);
        dataNascimento.setAno(anoo);
    }
    public void addNota(double nova){
        if(cont<5){
        notas[cont] = nova;
        cont++;
        }else{
            System.out.println("Ja foi atingido o nº maximo de notas.");
        }
    }
    public double getNotas(int posicao){
        return notas[posicao];
    }
    public void mediaAri(){
        if(cont>0){
        for(int i=0; i<cont;i++){
           media= media + notas[i];
        }
        media = media/cont;
    }else{
        System.out.println("Nenhuma nota foi adicionada ainda, por favor tente de novo.");
    }
    }
    public double getMedia(){
        return media;
    }
    public void calcularIdade(int diaAtual, int mesAtual, int anoAtual){
        if(dataNascimento.getAno() >0){
            int diasAtual = mesAtual * 30 + diaAtual;
            int diasNasci = dataNascimento.getMes() * 30 + dataNascimento.getDia();
            if(diasAtual>=diasNasci){
                idade =  anoAtual - dataNascimento.getAno();
            }else{
                idade =  anoAtual - dataNascimento.getAno() - 1;// ainda não fez aniversário este ano.
                }
           }else{
            System.out.println("Data de Nascimento ainda não informada!!");    
        }
        }
    public int gerIdade(){
        return idade;
    }
    }

