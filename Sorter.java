public class Sorter 
{
    public static void main(String[] args)
    {
        //Bubble sort
        int[] testArr = {5, 7, 4, 3, 2, 10, 1, 5};
        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) 
        {
            arr[i] = Integer.parseInt(args[i]);
        }
        boolean done = false;

        while (!done)
        {
            boolean hasSwapped = false;
            for (int i = 0; i < arr.length - 1; i++)
            {
                if (arr[i] > arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    hasSwapped = true;
                }
            }

            if (!hasSwapped)
            {
                done = true;
            }
        }



        System.out.println("Final");
        for (int i : arr) 
        {
            System.out.println(i);
        }
    }

}
