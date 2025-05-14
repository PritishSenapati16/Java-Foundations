// Signing in
public class Prog11 {
    public static void main(String[] args) {
        String name = "Crusader";
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String pstring = name.toUpperCase();
        System.out.println(pstring);

        String nonTrimmedString = "       Pritish      ";
        System.out.println(nonTrimmedString);

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        String lcraft = name.substring(4);
        System.out.println(lcraft);

        String Godlike = name.substring(2, 7);
        System.out.println(Godlike);

        String Jonny = name.replace('e', 'a');    
        System.out.println(Jonny);

        boolean Zgod = name.startsWith("Cru");
        System.out.println(Zgod);

        System.out.println(name.charAt(3));

        System.out.println(name.indexOf("d"));

        System.out.println(name.indexOf("r", 2)); // Crusader

        System.out.println(name.lastIndexOf("er"));

        System.out.println(name.lastIndexOf("ad",5));
   
  }
}
// Signing off