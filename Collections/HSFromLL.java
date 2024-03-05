import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HSFromLL
{
    public static void main(String[] args) 
    {
        List<Integer> ndb5 = new ArrayList<>();
        ndb5.add(5);
        ndb5.add(10);
        ndb5.add(15);
        ndb5.add(20);
        ndb5.add(25);

        List<Integer> ndb3 = new ArrayList<>();
        ndb3.add(3);
        ndb3.add(6);
        ndb3.add(9);
        ndb3.add(12);
        ndb3.add(15);

        Set<Integer> ndb53 = new HashSet<>(ndb5);

        ndb53.addAll(ndb3);

        System.out.println(ndb53);
    }
}