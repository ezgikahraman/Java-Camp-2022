public class Main {
    public static void main(String[] args) {

        char harf = 'a';

        char[] ince = {'e','i','ö','ü'};
        char[] kalin = {'a','ı','o','u'};

        for(char x:ince) {
            if(x==harf) {
                System.out.println(harf+" ince harftir.");
                return;
            }
        }
        for(char x:kalin) {
            if(x==harf) {
                System.out.println(harf+" kalın harftir.");
                return;
            }
        }
        System.out.println("Girdiğiniz harf ince ya da kalın harf değildir.");
    }
}