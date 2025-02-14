class Variable
{
    int insta=18; //instance
    static int stat=7;   //static
    void example()
    {
        int loc=56;  //local Variable
        System.out.println("Local variable:" +loc);
        System.out.println("instance variable:" +insta);
        System.out.println("Static variable:" +stat);
        
    }
	public static void main (String[] args) {
	    
	Variable obj = new Variable();
	obj.example();

	}
}
