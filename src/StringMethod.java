public class StringMethod {
    public static void main(String[] args) {
        String name = "Shashank";
        int length = name.length();
        System.out.println(length);

        // System.out.println(name.toLowerCase());
        // OR
        String lower = name.toLowerCase();
        System.out.println(lower);

        // S//y for toUpperCade();

        // String notTrimString = " Shashank sharma";
        // System.out.println(notTrimString);
        // System.out.println(notTrimString.trim());

        System.out.println(name.substring(2, 5));

        // System.out.println(name.replace('h', 'g'));
        // System.out.println(name.replace("sha", "io"));

        // System.out.println(name.startsWith("Sha"));
        // System.out.println(name.startsWith("sha"));
        // //Same for
        // System.out.println(name.endsWith("nk"));

        // System.out.println(name.charAt(3));

        // System.out.println(name.indexOf("sha"));

        // System.out.println(name.indexOf("Sha", 5));

        // System.out.println("Hello \" how are you");

        // System.out.println("hello // how are you");
    }
}