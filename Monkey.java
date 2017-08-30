import java.io.File;
import java.util.Scanner;

public class Monkey
{
    private Scanner x;
    private String path;
    private Aluno[] list;

    public Monkey(String path, int positions)
    {
        this.path = path;
        list = new Aluno[positions];
    }

    public void open()
    {
        try
        {
            x = new Scanner(new File(path));
        }
        catch(Exception e)
        {
            System.out.println("Could not find file");
        }
    }

    public void read()
    {
        String nome;
        Float notaGA;
        Float notaGB;
        int counter = 0;

        while(x.hasNext())
        {
            String[] slice = x.next().split(",");

            nome    = slice[0];
            notaGA  = Float.parseFloat(slice[1]);
            notaGB  = Float.parseFloat(slice[2]);

            list[counter] = new Aluno("", nome, notaGA, notaGB);

            counter++;
        }
    }

    public void close()
    {
        x.close();
    }

    public void alunos()
    {
        for (Aluno aluno : list) System.out.println(aluno);
    }

}
