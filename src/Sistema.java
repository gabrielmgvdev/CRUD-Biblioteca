public class Sistema {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J. R. R. Tolkien", 1954, "Allen & Unwin", 576, "Fantasia", "Inglês", "Preta");
        Livro livro2 = new Livro("O Hobbit", "J. R. R. Tolkien", 1937, "Allen & Unwin", 310, "Fantasia", "Inglês", "Preta");
        Livro livro3 = new Livro("O Silmarillion", "J. R. R. Tolkien", 1977, "Allen & Unwin", 480, "Fantasia", "Inglês", "Preta");
        Livro livro4 = new Livro("O Nome do Vento", "Patrick Rothfuss", 2007, "DAW Books", 662, "Fantasia", "Inglês", "Preta");
        Livro livro5 = new Livro("O Temor do Sábio", "Patrick Rothfuss", 2011, "DAW Books", 960, "Fantasia", "Inglês", "Preta");
        Livro livro6 = new Livro("O Aprendiz de Assassino", "Robin Hobb", 1995, "Spectra", 464, "Fantasia", "Inglês", "Preta");
        Livro livro7 = new Livro("O Punhal do Soberano", "Robin Hobb", 1996, "Spectra", 464, "Fantasia", "Inglês", "Preta");
        Livro livro8 = new Livro("Aprendiz de Mago", "Raymond E. Feist", 1982, "Doubleday", 512, "Fantasia", "Inglês", "Preta");
        Livro livro9 = new Livro("Mago Mestre", "Raymond E. Feist", 1982, "Doubleday", 512, "Fantasia", "Inglês", "Preta");
        Livro livro10 = new Livro("O Último Desejo", "Andrzej Sapkowski", 1993, "SuperNOWA", 288, "Fantasia", "Polonês", "Preta");

        livro1.imprimir();
    }
}