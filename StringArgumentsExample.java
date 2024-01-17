public class StringArgumentsExample {
    public static void main(String[] args) {
        // Check if command line arguments are provided
        if (args.length == 0) {
            System.out.println("No arguments provided.");
        } else {
            System.out.println("Arguments provided:");
            	int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		int r=x+y;
		 System.out.println("sum : "+r);
		System.out.println(" 2nd sum : "+(Integer.parseInt(args[0])+Integer.parseInt(args[1])));

            // Display each argument
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        }
    }
}
