

public class ZetTableTest
{
    public static void main(String[] args)
    {
        ZetTable z = new ZetTable();
        System.out.println(z.cardsInDeck());
        System.out.println(z.getOpenCard(1));
        if(z.enoughOpen())
        {
            System.out.println("enoughOpen Works");
        }
        else
        {
            System.out.println("enoughOpen doesnt work");
            
        }
        int[] i= new int[3];
           i=z.findZet();
           for(int j=0;j<i.length;j++)
           {
               System.out.println(i[j]+" ");
            }
            if(z.open3Cards())
        {
            System.out.println("open3Cards works");
        }
        else
        {
            System.out.println("open3Cards doesnt work");
            
        }
        z.remove3Cards(i);
        z.compactOpenCards();
        System.out.println(z);
        System.out.println("if the above prints all open cards with no nulls separating them, then all methods work as intended");
}
}
