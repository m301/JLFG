public class StackDemo{
	public static void main(String[] args){
		Stack s = new Stack();
		s.push(10);
		s.push(1);
		s.push(2);
		System.out.println("Content of stack:");
		s.printStack();
		s.pop();
		s.pop();		
		System.out.println("\nContent of stack:");
		s.printStack();
	}
	
}


class Stack{
	int store[] = new int[20];
	int top =-1;
	
	boolean push(int num){
		if(store.length-1==top){
			System.out.println("Stack overflow.");
			return false;
		}
		
		store[++top]=num;
		return true;
	}
	
	int pop(){
		if(top==-1){
			System.out.println("Stack underflow");
			return -1;
		}
		return store[top--];
	}
	
	
	void printStack(){
		if(top==-1)
			return;
		for(int i=0;i<=top;++i)
			System.out.print(store[i]+" ");
	}
}