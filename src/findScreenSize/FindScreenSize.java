package findScreenSize;

public class FindScreenSize {

    public static String findScreenHeight(int width, String ratio) {
        String[] r = ratio.split(":");
        int height = width * Integer.valueOf(r[1]) / Integer.valueOf(r[0]);
        return width + "x" + height;
    }

}
