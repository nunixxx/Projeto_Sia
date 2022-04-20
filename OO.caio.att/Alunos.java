    class Alunos
{
    String nomeA; 
    DataDeNascimento dataNascimento = new DataDeNascimento();
    double[] notas = new double[5];
    double media=0;
    int cont=0, idade   ;
    void addNomeA(String theNome){
        nomeA = theNome;
    }
    void addData(int diaa, int mess, int anoo){
        dataNascimento.dia = diaa;
        dataNascimento.mes = mess;
        dataNascimento.ano = anoo;
    }
    void addNota(double nova){
        if(cont<5){
        notas[cont] = nova;
        cont++;
        }else{
            System.out.println("Ja foi atingido o nº maximo de notas.");
        }
    }
    void mediaAri(){
        if(cont>0){
        for(int i=0; i<cont;i++){
           media= media + notas[i];
        }
        media = media/cont;
    }else{
        System.out.println("Nenhuma nota foi adicionada ainda, por favor tente de novo.");
    }
    }
    void calcularIdade(int diaAtual, int mesAtual, int anoAtual){
        if(dataNascimento.ano >0){
            int diasAtual = mesAtual * 30 + diaAtual;
            int diasNasci = dataNascimento.mes * 30 + dataNascimento.dia;
            if(diasAtual>=diasNasci){
                idade =  anoAtual - dataNascimento.ano;
            }else{
                idade =  anoAtual - dataNascimento.ano - 1;// ainda não fez aniversário este ano.
                }
        }else{
            System.out.println("Data de Nascimento ainda não informada!!");    
        }
        }
    }

