public class Livro {
private String titulo;
    private String autor;
    private int ano;
    private String editora;
    private int paginas;
    private String genero;
    private String idioma;
    private String corCapa;

    public Livro(String titulo, String autor, int ano, String editora, int paginas, String genero, String idioma, String corCapa) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.editora = editora;
        this.paginas = paginas;
        this.genero = genero;
        this.idioma = idioma;
        this.corCapa = corCapa;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public String getEditora() {
        return editora;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getGenero() {
        return genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getCorCapa() {
        return corCapa;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setCorCapa(String corCapa) {
        this.corCapa = corCapa;
    }

    public void imprimir(){
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano: " + this.ano);
        System.out.println("Editora: " + this.editora);
        System.out.println("Páginas: " + this.paginas);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Idioma: " + this.idioma);
        System.out.println("Cor da capa: " + this.corCapa);
    }

    public void emprestar(){
        System.out.println("O livro " + this.titulo + " foi emprestado.");
    }

    public void devolver(){
        System.out.println("O livro " + this.titulo + " foi devolvido.");
    }

    public void abrir(){
        System.out.println("O livro " + this.titulo + " foi aberto.");
    }

    public void fechar(){
        System.out.println("O livro " + this.titulo + " foi fechado.");
    }

    public void folhear(int pagina){
        System.out.println("O livro " + this.titulo + " foi folheado até a página " + pagina + ".");
    }

    public void avancarPagina(){
        System.out.println("O livro " + this.titulo + " avançou uma página.");
    }

    public void voltarPagina(){
        System.out.println("O livro " + this.titulo + " voltou uma página.");
    }

    public void marcarPagina(int pagina){
        System.out.println("O livro " + this.titulo + " marcou a página " + pagina + ".");
    }

    public void desmarcarPagina(){
        System.out.println("O livro " + this.titulo + " desmarcou a página.");
    }

    public void ler(){
        System.out.println("O livro " + this.titulo + " está sendo lido.");
    }

    public void pararLeitura(){
        System.out.println("O livro " + this.titulo + " parou de ser lido.");
    }




}
