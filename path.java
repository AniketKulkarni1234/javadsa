public class path
{
    public static double way(String st)
    {
        int x = 0, y = 0;

        for(int i = 0; i < st.length(); i++)
        {
            char dir = st.charAt(i);

            if(dir == 'S')
                y--;
            else if(dir == 'N')
                y++;
            else if(dir == 'W')
                x--;
            else if(dir == 'E')
                x++;
        }

        return Math.sqrt(x*x + y*y);
    }

    public static void main(String args[])
    {
        String st = "WNEENESENNN";
        System.out.println(way(st));
    }
}
