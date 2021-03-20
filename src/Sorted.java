import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sorted
{
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<String>();
        ts.add("Russia");
        ts.add("USA");
        ts.add("Germany");
        ts.add("Italy");
        ts.add("France");
        System.out.println(ts);
        //SortedSet
        System.out.println(ts.first());
        System.out.println(ts.last());
        SortedSet<String> hs=ts.headSet("USA");
        System.out.println(hs);
        SortedSet<String> ss=ts.subSet("Germany","Russia");
        System.out.println(ss);
        SortedSet<String> tails=ts.tailSet("Germany");
        System.out.println(tails);
        //NavigableSet
        System.out.println(ts.ceiling("A"));//e>=obj
        System.out.println(ts.floor("G"));//e<=obj
        System.out.println(ts.higher("A"));
        System.out.println(ts.lower("Z"));
        System.out.println(ts.pollFirst());
        System.out.println(ts);
        System.out.println(ts.pollLast());
        System.out.println(ts);
        NavigableSet<String> ns=ts.descendingSet();
        System.out.println(ns);
        ts.remove("Germany");
        System.out.println(ts);
    }
}
