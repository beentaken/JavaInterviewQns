package com.company;

public class sortTheSummary {
    /*
    * import java.util.*;
class Result
{
   public static void main(String args[])
   {
       Scanner input=new Scanner(System.in);
       int N=input.nextInt();
       List<Integer> arr=new ArrayList<Integer>();
       for(int i=0;i<N;i++)
       {
           int value=input.nextInt();
           arr.add(value);
       }
       List<List<Integer>> result=groupSort(arr);
       for(List<Integer> list: result)
           System.out.println(list.get(0)+" "+list.get(1));
   }
   public static List<List<Integer>> groupSort(List<Integer> arr)
   {
       HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
       for(int i=0;i<arr.size();i++)
       {
           int count=1;
           int key=arr.get(i);
           if(hash.containsKey(key))
               count+=hash.get(key);
           hash.put(key,count);
       }
       List<List<Integer>> result=new ArrayList<List<Integer>>();
       for(int key: hash.keySet())
       {
           List<Integer> list=new ArrayList<Integer>();
           list.add(key);
           list.add(hash.get(key));
           result.add(list);
       }
       Collections.sort(result,new sortComparator());
       return result;
   }
}
class sortComparator implements Comparator<List<Integer>>
{
   public int compare(List<Integer> l1,List<Integer> l2)
   {
       if(l1.get(1)>l2.get(1))
           return -1;
       if(l1.get(1)<l2.get(1))
           return 1;
       if(l1.get(0)<l2.get(0))
           return -1;
       return 1;
   }
}
    *
    * */
}
