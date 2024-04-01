public class Main {
    public static void main(String[] args) {
        Fisica pessoa = new Fisica("Ryan Ribeiro de Souza",87921065, "RyanRib@hotmail.com", 21963728, 98949657, 'm', "Diretor de fotografia", "Brasileiro", "Solteiro", 3469127);
        System.out.println(pessoa.toString());

        Juridica pessoa2 = new Juridica("RRB Produções",87921065, "RRBProduções@hotmail.com", 21963728, 98949657,"Ryan Ribeiro", 3469127);
        System.out.println(pessoa2.toString());

        System.out.println(pessoa.apresentacao());
    }

}