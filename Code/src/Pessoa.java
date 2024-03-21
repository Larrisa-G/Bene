class Pessoa {
    private String nome;
    private int doc;
    private String email;
    private int numCelular;

    private int telefone;

    public Pessoa (String nome, int doc, String email, int numCelular, int telefone){
        this.nome = nome;
        this.doc = doc;
        this.email = email;
        this.numCelular = numCelular;
        this.telefone = telefone;
    }

    public String getnome(){ return nome;}
    public int getdoc(){ return doc;}
    public String getemail(){ return email;}
    public int getNumCelular(){ return numCelular;}
    public int gettelefone(){ return telefone;}

    public void setNome (String nome){ this.nome = nome;}
    public void SetDoc (int doc){ this.doc = doc;}
    public void setEmail (String email){ this.email = email;}
    public void SetNumCelular (int numCelular){  this.numCelular = numCelular;}
    public void SetTelefone (int telefone){ this.telefone = telefone;}

    @Override
    public String toString(){
        return "\nCliente: "+nome+"\ndoc: "+doc+"\nE-mail: "+email+"\nCelular: "+numCelular+"\nTelefone: "+telefone;
    }


}

