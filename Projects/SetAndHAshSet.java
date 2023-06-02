import java.util.HashSet;
import java.util.Set;
/*
 * Use sets and hashsets when you want a collection of items and don't want any duplicates nor do you 
 * care about what order everything is in
 * 
 * treesets will allow ordering and linkedhashsets maintain the insertion order of items
 */
public class SetAndHAshSet {
    
    public static void main(String[] args){


        //sets by design do not allow duplicates
        Set<String> names = new HashSet<>();

        names.add("Walter");
        names.add("Jesse");
        names.add("Skyler");
        names.add("Mike");
        names.add("Saul");

        //to print out your set you can use several methods including a for each loop or a lambda 

        // for each loop
        for(String name: names){
            System.out.println(name);
        }

        // or use a lambda
        names.forEach(System.out::println);
    }
}
