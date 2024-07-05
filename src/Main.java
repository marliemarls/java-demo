public class Main {
    public static void main(String[] args) {
        System.out.println("Hi");
        String name = "Marlie";
        System.out.println(name.charAt(0));
        if(name.charAt(0) == 'A') {
            System.out.println("True");
        }
            else {
            System.out.println("Name Does not begin with the letter: A.");
            System.out.println(escape());
        }
    }
    static int mathOne(){
        Integer Myinteger = 25;
        int num = Myinteger;
        return num;
    }

    static String stringOne(){
        //Create and use Strings
        String marlie = "Marlie";
        return "";
    }

    static String escape(){
        return "\"Marlie\" \nMartinez ";
    }

    static boolean isCapitalized(char c){
        if(c == c.toUpperCase()){
            return true;
        }
        System.out.println("hi");
    }
}
