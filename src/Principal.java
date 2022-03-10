public class Principal {

    public static void main(String[] args) {
        Desenvolvedor desenvolvedor =  new Desenvolvedor();
        Tester qa = new Tester();

        desenvolvedor.setNome("Junior Santos");
        printarNome(desenvolvedor);
        qa.setNome("Danilo");

       printarNome(qa);
    }

    static void printarNome(Pessoa pessoa){
        System.out.println("O nome da pessoa é: " + pessoa.getNome());
    }
}
