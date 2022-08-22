import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        var artigo = new Artigo(titulo: "Vs Code com Java", new Autor(nome: "Jacqueline Oliveira"),
                            LocalDate.of(year: 2022, month> 07, dayOfMonth: 13), Categoria.BACKEND);

                            System.out.println(artigo);
    }
}
