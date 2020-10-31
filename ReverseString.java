public class ReverseString {
    //reverse method
    public static String reverse(String input){
        String reverser="";
        for (int i=0;i<input.length();i++){
            reverser=input.charAt(i)+reverser;
        }
        return reverser;
    }
    //main method
    public static void main(String [] args){
        System.out.println("Reverse(Silas)=>"+reverse("Silas"));
    }
}
