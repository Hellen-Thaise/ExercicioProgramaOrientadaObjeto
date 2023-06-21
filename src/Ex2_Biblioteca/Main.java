package Ex2_Biblioteca;


public class Main {
    public static void main(String[] args) {

        Livros livro1 = new Livros("123", "Percy Jackson", "Fantasia", "Rick Riordan");
        Livros livro2 = new Livros("1234", "Harry Potter e o Prisioneiro de Azkaban", "Ficção", "J. K Rowling");
        Livros livro3 = new Livros("12345", "Crepúsculo", "Romance", "Stephenie Meyer");

        System.out.println("------ Dados dos livros registrados -------");
        livro3.registraLivro(livro3.getIsbnLivro());
        System.out.println("----------------------------------------------");
        livro2.registraLivro(livro2.getIsbnLivro(), livro2.getLivroNome());
        System.out.println("----------------------------------------------");
        livro2.registraLivro(livro2.getIsbnLivro(), livro2.getLivroNome(), livro2.getGenero());
        System.out.println("----------------------------------------------");
        livro1.registraLivro(livro1.getIsbnLivro(), livro1.getLivroNome(), livro1.getGenero(), livro1.getPessoaAutora());

    }
}
