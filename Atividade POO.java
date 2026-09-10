import Dominio.*;

public class App {

    public static void main(String[] args) throws Exception{
        Aluno a1 = new Aluno(10, "Ana", "123", "456");
        a1.setNota(7.5);
        a1.exibir();

        Aluno a2 = new Aluno(20, "Paola", "476", "133");
        a2.setNota(9.0);
        a2.exibir();

        Aluno a3 = new Aluno(30, "Joao", "987", "146");
        a3.setNota(2.5);
        a3.exibir();

        Aluno a4 = new Aluno(40, "Pedro", "830", "315");
        a4.setNota(6.5);
        a4.exibir();

        Aluno a5 = new Aluno(50, "Rafael", "146", "689");
        a5.setNota(10.0);
        a5.exibir();

        Professor p1 = new Professor(100, "Joao", "145", 2500.0);
        p1.exibir();

        Professor p2 = new Professor(200, "Roger", "179", 4500.0);
        p2.exibir();

        Professor p3 = new Professor(300, "Carles", "687", 3600.0);
        p3.exibir();
    }
}