public class Main 
{
    public static void main(String[] args)
    {
        if (args.length != 1)
        {
            System.out.println("Missing name. :(");
        }
        else
        {
            System.out.println(args[0]);
        }
    }
}
