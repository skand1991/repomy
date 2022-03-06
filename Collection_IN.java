package Skand;
import java.util.ArrayList;
import java.util.List;

public class Collection_IN {
public static void main(String[] arg) 
{
   List lst_obj= new ArrayList();
   
   lst_obj.add(10);
   lst_obj.add(20);
   lst_obj.add(30);
   lst_obj.add(40);
   lst_obj.add(50);
   
	System.out.println("add List 1::  " + lst_obj);//add method
	
	List lst_obj2= new ArrayList();
	
	lst_obj2.add(60);
	lst_obj2.add(70);
	lst_obj2.add(80);
	lst_obj2.add(90);
	lst_obj2.add(100);
	
	System.out.println("add List 2::  "+ lst_obj2);// add method
	lst_obj.addAll(lst_obj2);//addAll method
	System.out.println("Add All Element:: " + lst_obj);
	
	lst_obj.remove(3);
	System.out.println("Remove 1 element:: "+ lst_obj);//element is 40 to be remove//remove method
	System.out.println("Contains:: " + lst_obj.contains(50));//contains value is 50//contains method
	System.out.println("Contains All method:: "+lst_obj.containsAll(lst_obj2));//List 2 //containsAll method
	System.out.println("IsEmpty method::  "+lst_obj.isEmpty());//isEmpty method
	System.out.println("size method::  "+lst_obj.size());//size method
	lst_obj2.clear();//clear method
	System.out.println("Clear ::"+ lst_obj2);
	lst_obj.removeAll(lst_obj);
	System.out.println("removeAll:: "+lst_obj);//removeAll method
	
}
}
