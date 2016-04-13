import java.util.*;

/**
 * Write a description of class Deck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deck
{
    ArrayList<Card> bubbles;
    public Deck () //81 cards
    {
        
       
            bubbles=new ArrayList<Card>();
            //Card test=new Card(i-1);
           // bubbles.add(test);
        
    }

    public Deck (int capacity)// creates an empty deck of given capacity
    {
        
        
             bubbles=new ArrayList<Card>(capacity);
        
    }

    public int getNumCards ()
    {
        return bubbles.size();
    }

    public boolean isEmpty ()
    {
        if(bubbles.size()==0)
            return true;
        else
            return false;
    }

        public void add (Card card)
    {
        bubbles.add(0,card);
    }

    public Card takeTop()
    {
        return bubbles.remove(bubbles.size()-1);   
    }

    public void shuffle ()
    {
        Collections.shuffle(bubbles);
    }

    public void sort()
    {
        Collections.sort(bubbles);
    }

    public String toString()
    {
        String s="";
        for(int i=0; i<bubbles.size(); i++)
        {
            s+=""+bubbles.get(i)+"\n";
        }
        return s;
        
    }
}