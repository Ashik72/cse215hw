package hw;

import java.util.*;

public class MyStack {

	private ArrayList list = new ArrayList();
	
	public void push(Object obj) {
		
		list.add(obj);
		
	}
	
	public String toString() {
		
		return list.toString();
		
	}
	
	public int getSize() {
		
		return this.list.size();
	}
	
	public boolean isEmpty() {
		
		if (this.list.size() > 0)
			return false;
		
		return true;
	}
	
	public Object peek() {
		
		return this.list.get(0);
	}
	
	public Object pop() {

		Object top_el = list.get(0);
		list.remove(0);
		return top_el;
		
	}
	
	public int search(Object obj) {
		
		for (Object singleObj: this.list) {
						
			if (singleObj.equals(obj))
				return list.indexOf(obj);
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		
		MyStack ins_1 = new MyStack();
		
		ins_1.push(new Student("34563", "test name", new double[]{23, 78, 53}));
		ins_1.push(1);
		ins_1.push(2);
		ins_1.push("dfgfdgd");
		ins_1.push("dfgfdgd ffgf");

		System.out.println(ins_1.toString());
		System.out.println(ins_1.getSize());
		System.out.println(ins_1.isEmpty());
		System.out.println(ins_1.peek().toString());
		System.out.println(ins_1.pop().toString());
		System.out.println(ins_1.peek().toString());
		System.out.println(ins_1.search("dfgfdgd"));

		
	}
	
	///hhhhh
	
	
}
