public class Main
{
    public static void main(String[] args)
    {
        Monkey monkey = new Monkey("src/alunos.txt", 5);
        monkey.open();
        monkey.read();
        monkey.close();
        monkey.alunos();
    }
}
