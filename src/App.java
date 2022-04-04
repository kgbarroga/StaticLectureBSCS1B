public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome Back!!");
        /**
         * Creating objects
         */
        Bicycle b1 = new Bicycle("white");
        Bicycle b2 = new Bicycle("black");
        Bicycle b3 = new Bicycle("orange");
        /**
         * Display Instance Variables
         */
        System.out.println("Bike 1 Color " + b1.getColor());

        /**
         * Display, get the value of a Static variable
         */
        System.out.println("Bike count " + Bicycle.numberOfBikes);

        System.out.println("----------------------");

        Friend f1 = new Friend("Spongebob");
        Friend f2 = new Friend("Patrick");

        System.out.println("I now have " + Friend.getFriendCount() + " friend(s).");
        System.out.println("All my friends are from " + Friend.getSection());



    }
}
