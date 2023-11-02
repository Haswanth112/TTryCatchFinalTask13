import java.util.*;
class ElementExistsInArrayList 
{
    public static void main(String[] args) {
        int n;
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the no.of items you need to add into a list: ");
        n =s.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0;i<=n;i++)
        {
            String item = s.nextLine().toLowerCase();
            list.add(item);
        }
        System.out.println("Enter the item name you need to find: ");
        String elementToFind = s.nextLine();
        if (list.contains(elementToFind)) 
        {
            System.out.println(elementToFind + " exists in the ArrayList.");
        } 
        else 
        {
            System.out.println(elementToFind + " does not exist in the ArrayList.");
        }
    }
}