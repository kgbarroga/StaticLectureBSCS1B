public class Bicycle {
    /**
     * Instance Variables
     */
    private String color;
    
    /**
     * Static variables
     * Syntax
     * public/private static keyword datatype variable_name
     */
    public static int numberOfBikes;

    Bicycle(String inputColor){
        this.color = inputColor;
        numberOfBikes++;
    }

    public String getColor() {
        return color;
    }


}
