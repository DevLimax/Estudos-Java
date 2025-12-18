package composicao.manytomany;

public class TesteManyToMany {
    public static void main(String[] args) {

        Perfil p1 = new Perfil(12, "Admin");
        Perfil p2 = new Perfil(14, "Professor");
        Perfil p3 = new Perfil(15, "Aluno");
        Perfil p4 = new Perfil(11, "Auxiliar");
        Perfil p5 = new Perfil(16, "Diretor");

        Usuario u1 = new Usuario(
                21,
                "João pedro",
                "jplinma@gmail.com"
        );

        Usuario u2 = new Usuario(
                12,
                "Ana cristina",
                "anaCris@gmail.com"
        );

        u1.perfis.add(p1);
        u1.perfis.add(p5);

        u2.perfis.add(p2);
        u2.perfis.add(p4);

        System.out.println(u2);
    }
}
