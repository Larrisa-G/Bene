class Juridica extends Pessoa{
    private String representante;
    private int cadastroEstadual;

    public Juridica (String nome, int doc, String email, int numCelular, int telefone, String representante, int cadastroEstadual){
        super(nome, doc, email, numCelular, telefone);
        this.representante = representante;
        this.cadastroEstadual = cadastroEstadual;
    }
    public String getrepresentante() {return representante;}
    public int getcadastroEstadual() {return cadastroEstadual;}
    public void setRepresentante(String representante){this.representante=representante;}
    public void  setCadastroEstadual(int cadastroEstadual){this.cadastroEstadual=cadastroEstadual;}
    @Override
    public String toString(){
        return super.toString()+"\nCadastro estadual: "+cadastroEstadual+"\nRepresentante: "+representante;
    }


}
