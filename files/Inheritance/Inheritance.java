public class Inheritance{
		public static void main(String[] args){
			Man m = new Man();
			Tiger t = new Tiger();
			Child c  = new Child();
			System.out.println("Man.isDangerous "+(m.isDangerous()));
			System.out.println("Tiger.isDangerous "+(t.isDangerous()));
			System.out.println("Child.isDangerous "+(c.isDangerous()));
			c.walk = true;						
			System.out.println("Child.canWalk "+(c.canWalk()));
		}

}

class Mammal{
	final boolean dangerous=false;
	int AGE = 1;
	boolean isDangerous(){
		return dangerous;
	}
}

class Human extends Mammal{
	final boolean dangerous = false;	
}

class Man extends Human{
	Man(){
		AGE = 18;
	}
	boolean earn = false;
	boolean canEarn(){
		return earn;
	}
}

class Child extends Human{
	boolean walk = false;
	boolean canWalk(){
		return walk;
	}
}

class Tiger extends Mammal{
	final boolean dangerous = true;
}