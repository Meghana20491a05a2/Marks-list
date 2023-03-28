import java.util.*;
import java.util.Map.Entry;
class Marks 
{
    public static void main(String args[])
    {
        HashMap<String,List<Integer>>arr= new HashMap<>();
        HashMap<String,Integer>map = new HashMap<>();
        arr.put("5a2",Arrays.asList(10,20,70,60,59));
        arr.put("5a3",Arrays.asList(70,70,90,89,56));
        arr.put("572",Arrays.asList(80,90,70,60,78));
        arr.put("5a4",Arrays.asList(100,60,80,90,60));
        arr.put("5a5",Arrays.asList(100,78,90,68,80));
        arr.put("5a6",Arrays.asList(100,80,90,78,89));
        arr.put("5a7",Arrays.asList(70,80,90,60,80));
        arr.put("5a8",Arrays.asList(67,89,90,60,100));
        arr.put("5a9",Arrays.asList(89,90,78,60,70));
        for(Entry<String,List<Integer>>ele:arr.entrySet())
        {
            List <Integer> s =ele.getValue();
            int sum=0;
           for(int i=0;i<s.size();i++)
          {
              sum=sum+s.get(i);
          }
          map.put(ele.getKey(),sum);
        }
     for(Entry<String,Integer>ele1:map.entrySet())
     {
        System.out.println(ele1);
     }
   }
}

