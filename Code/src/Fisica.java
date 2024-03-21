class Fisica extends Pessoa {
    private char genero;
    private String profissao;
    private String nacionalidade;
    private String estadoCivil;
    private int rg;

    public Fisica (String nome, int doc, String email, int numCelular, int telefone, char genero, String profissao, String nacionalidade, String estadoCivil, int rg){
        super(nome, doc, email, numCelular, telefone);
        this.genero = genero;
        this.profissao = profissao;
        this.nacionalidade = nacionalidade;
        this.estadoCivil = estadoCivil;
        this.rg = rg;

    }

    public char getgenero() {return genero;}
    public String getprofissao() {return profissao;}
    public String getNacionalidade() {return nacionalidade;}
    public String getestadoCivil() {return estadoCivil;}
    public int getrg() {return rg;}
    public void setGenero(char genero){ this.genero = genero;}
    public void setProfissao(String profissao){ this.profissao = profissao;}
    public void setNacionalidade(String nacionalidade){this.nacionalidade = nacionalidade;}
    public void setEstadoCivil(String estadoCivil){this.estadoCivil = estadoCivil;}
    public void setRg(int rg){this.rg = rg;}



    @Override
    public String toString(){
        return super.toString() + "\nGênero: "+genero+"\nProfissão: "+profissao+"\nNacionalidade: "+nacionalidade+"\nEstado civil: "+estadoCivil+"\nRG: "+rg;
    }

    public String apresentacao( ){
        return "\nCONTRATANTE: "+","+nacionalidade+","+estadoCivil+","+profissao+", Carteira de Identidade nº "+rg+", C.P.F. nº "+", residente e domiciliado na Rua "+", nº "+", bairro "+", Cep "+", Cidade "+", no Estado"+"; ";
    }
}
