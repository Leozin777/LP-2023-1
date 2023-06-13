import java.util.Scanner;
public class Biblioteca
{
    private Livro livro1;
    private Livro livro2;
    private Livro livro3;
    private Livro livro4;
    private Livro livro5;

    private Livro getLivro1() {
        return livro1;
    }

    private void setLivro1(Livro livro1) {
        this.livro1 = livro1;
    }

    private Livro getLivro2() {
        return livro2;
    }

    private void setLivro2(Livro livro2) {
        this.livro2 = livro2;
    }

    private Livro getLivro3() {
        return livro3;
    }

    private void setLivro3(Livro livro3) {
        this.livro3 = livro3;
    }

    private Livro getLivro4() {
        return livro4;
    }

    private void setLivro4(Livro livro4) {
        this.livro4 = livro4;
    }

    private Livro getLivro5() {
        return livro5;
    }

    private void setLivro5(Livro livro5) {
        this.livro5 = livro5;
    }

    public void AdicionarLivro(Livro p_livro)
    {
        if(livro1 == null)
            livro1 = p_livro;
        else if(livro2 == null)
            livro2 = p_livro;
        else if(livro3 == null)
            livro3 = p_livro;
        else if(livro4 == null)
            livro4 = p_livro;
        else if(livro5 == null)
            livro5= p_livro;
        else
            livro1 = p_livro;

        System.out.println(p_livro.getTitulo() + " foi adicionado!!!");
    }

    public void RemoverLivro(Livro p_livro)
    {
        if(livro1 == p_livro)
            livro1 = null;
        else if(livro2 == p_livro)
            livro2 = null;
        else if(livro3 == p_livro)
            livro3 = null;
        else if(livro4 == p_livro)
            livro4 = null;
        else if(livro5 == p_livro)
            livro5 = null;
        else
            System.out.println("O livro " + p_livro.getTitulo() + " não esta registrado no sistema, logo ele não pode ser deletado");
    }

    public void AtualizarLivro(Livro p_livro)
    {
        Scanner scanner = new Scanner(System.in);

        if(livro1 == p_livro)
        {
            System.out.println("Qual é o novo titulo do livro?");
            String m_titulo = scanner.nextLine();

            System.out.println("Qual o autor do livro?");
            String m_autor = scanner.nextLine();

            System.out.println("Qual é a edicao do livro?");
            int m_edicao = scanner.nextInt();

            System.out.println("Qual a disponibilidade do livro?");
            boolean m_disponibilidade = scanner.hasNextBoolean();

            livro1.setTitulo(m_titulo, m_edicao);
            livro1.setAutor(m_autor);
            livro1.setDisponibilidade(m_disponibilidade);
        }

        else if(livro2 == p_livro)
        {
            System.out.println("Qual é o novo titulo do livro?");
            String m_titulo = scanner.nextLine();

            System.out.println("Qual o autor do livro?");
            String m_autor = scanner.nextLine();

            System.out.println("Qual é a edicao do livro?");
            int m_edicao = scanner.nextInt();

            System.out.println("Qual a disponibilidade do livro?");
            boolean m_disponibilidade = scanner.hasNextBoolean();

            livro2.setTitulo(m_titulo, m_edicao);
            livro2.setAutor(m_autor);
            livro2.setDisponibilidade(m_disponibilidade);
        }
        else if(livro3 == p_livro)
        {
            System.out.println("Qual é o novo titulo do livro?");
            String m_titulo = scanner.nextLine();

            System.out.println("Qual o autor do livro?");
            String m_autor = scanner.nextLine();

            System.out.println("Qual é a edicao do livro?");
            int m_edicao = scanner.nextInt();

            System.out.println("Qual é a disponibilidade do livro?");
            boolean m_disponibilidade = scanner.hasNextBoolean();

            livro3.setTitulo(m_titulo, m_edicao);
            livro3.setAutor(m_autor);
            livro3.setDisponibilidade(m_disponibilidade);
        }
        else if(livro4 == p_livro)
        {
            System.out.println("Qual é o novo titulo do livro?");
            String m_titulo = scanner.nextLine();

            System.out.println("Qual o autor do livro?");
            String m_autor = scanner.nextLine();

            System.out.println("Qual é a edicao do livro?");
            int m_edicao = scanner.nextInt();

            System.out.println("Qual a disponibilidade do livro?");
            boolean m_disponibilidade = scanner.hasNextBoolean();

            livro4.setTitulo(m_titulo, m_edicao);
            livro4.setAutor(m_autor);
            livro4.setDisponibilidade(m_disponibilidade);
        }
        else if(livro5 == p_livro)
        {
            System.out.println("Qual é o novo titulo do livro?");
            String m_titulo = scanner.nextLine();

            System.out.println("Qual o autor do livro?");
            String m_autor = scanner.nextLine();

            System.out.println("Qual é a edicao do livro?");
            int m_edicao = scanner.nextInt();

            System.out.println("Qual a disponibilidade do livro?");
            boolean m_disponibilidade = scanner.hasNextBoolean();

            livro5.setTitulo(m_titulo, m_edicao);
            livro5.setAutor(m_autor);
            livro5.setDisponibilidade(m_disponibilidade);
        }
        else
            System.out.println("O livro " + p_livro.getTitulo() + " não esta registrado no sistema, logo ele não pode ser atualizado :/");
    }

    public void VerificarDisponibilidade(Livro p_livro)
    {
        if(livro1 == p_livro)
        {
            var m_disponibilidade = livro1.isDisponibilidade();
            if(m_disponibilidade == true)
                System.out.println(p_livro.getTitulo() + " esta disponivel");
            else
                System.out.println(p_livro.getTitulo() + " não esta disponivel :/");
        }

        else if(livro2 == p_livro)
        {
            var m_disponibilidade = livro2.isDisponibilidade();
            if(m_disponibilidade == true)
                System.out.println(p_livro.getTitulo() + " esta disponivel");
            else
                System.out.println(p_livro.getTitulo() + " não esta disponivel :/");
        }
        else if(livro3 == p_livro)
        {
            var m_disponibilidade = livro3.isDisponibilidade();
            if(m_disponibilidade == true)
                System.out.println(p_livro.getTitulo() + " esta disponivel");
            else
                System.out.println(p_livro.getTitulo() + " não esta disponivel :/");
        }
        else if(livro4 == p_livro)
        {
            var m_disponibilidade = livro4.isDisponibilidade();
            if(m_disponibilidade == true)
                System.out.println(p_livro.getTitulo() + " esta disponivel");
            else
                System.out.println(p_livro.getTitulo() + " não esta disponivel :/");
        }
        else if(livro5 == p_livro)
        {
            var m_disponibilidade = livro5.isDisponibilidade();
            if(m_disponibilidade == true)
                System.out.println(p_livro.getTitulo() + " esta disponivel");
            else
                System.out.println(p_livro.getTitulo() + " não esta disponivel :/");
        }
        else
            System.out.println("O livro " + p_livro.getTitulo() + " não esta registrado no sistema, logo a disponibilidade dele não pode ser verificada :/");
    }
}
