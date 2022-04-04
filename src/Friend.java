public class Friend {
    /**
     * instance variables
     */
    private String name;

    /**
     * static variable
     */
    private static int friendCount = 0;
    private static String section = "BSCS 1B";

    Friend(String inputName){
        friendCount++;
        this.name = inputName;
    }

    public static int getFriendCount(){
        return friendCount;
    }

    public String getName() {
        return name;
    }

    public static String getSection() {
        return section;
    }
}
