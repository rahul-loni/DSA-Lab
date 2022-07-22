package Hashing;
public class LinkedHashMap {
    public static void main(String arg[])   
    {   
        /* Creates a Linked Hashmap */  
        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();   
        /* Enter key values to the Hashmap */  
        lhm.put("One", "Robin");   
        lhm.put("Two", "Satyam");   
        lhm.put("Three", "Kanishk");   
        /* Prints the elements of Hashmap in an order as they are entered */       
        System.out.println(lhm);   
        System.out.println("Getting value for key 'one': " + lhm.get("One"));   
        System.out.println("Size of the Hashmap: " + lhm.size());   
        System.out.println("Is Hashmap empty? " + lhm.isEmpty());   
        System.out.println("Contains key 'two'? "+  lhm.containsKey("Two"));   
        System.out.println("Contains value 'Kanishk? "+ lhm.containsValue("Kanishk"));   
        System.out.println("delete element 'one': " +  lhm.remove("One"));   
        System.out.println(lhm);   
    }   
}
