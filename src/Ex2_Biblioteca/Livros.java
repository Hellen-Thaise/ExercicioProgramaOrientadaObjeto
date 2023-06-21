package Ex2_Biblioteca;

public class Livros {
    private String isbnLivro;
    private String livroNome;
    private String genero;
    private String pessoaAutora;

    public Livros(String isbnLivro, String livroNome, String genero, String pessoaAutora) {
        this.isbnLivro = isbnLivro;
        this.livroNome = livroNome;
        this.genero = genero;
        this.pessoaAutora = pessoaAutora;
    }

    public String getIsbnLivro() {
        return isbnLivro;
    }

    public String getLivroNome() {
        return livroNome;
    }

    public String getGenero() {
        return genero;
    }

    public String getPessoaAutora() {
        return pessoaAutora;
    }

    public void registraLivro(String isbnLivro) {
        System.out.println("O livro foi registrado com o ISBN " + getIsbnLivro());
    }

    public void registraLivro(String isbnLivro, String livroNome) {
        System.out.println("O livro foi registrado com o ISBN " + getIsbnLivro() + " e o nome " + getLivroNome());
    }

    public void registraLivro(String isbnLivro, String livroNome, String genero) {
        System.out.println("O livro foi registrado com o ISBN " + getIsbnLivro() + ", o nome " + getLivroNome() +
                " e o gênero " + getGenero());
    }

    public void registraLivro(String isbnLivro, String livroNome, String genero, String pessoaAutora) {
        System.out.println("O livro foi registrado com todos os atributos");
        detalhesLivro();
    }

    public void detalhesLivro() {
        System.out.println("ISBN do livro: " + getIsbnLivro());
        System.out.println("Nome do livro: " + getLivroNome());
        System.out.println("Gênero do livro: " + getGenero());
        System.out.println("Autor(a) do livro: " + getPessoaAutora());
    }

}
