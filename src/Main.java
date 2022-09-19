public class Main {
    public static void main(String[] args) {

        Radio hans = new Radio(true, 5, 55);
        hans.lauter();
        hans.lauter();
        hans.lauter();
        hans.lauter();
        hans.lauter();
        hans.lauter();
        System.out.println(hans.getVolume());
        System.out.println(hans.toString());
    }
}

