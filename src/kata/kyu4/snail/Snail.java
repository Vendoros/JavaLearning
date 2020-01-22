package kata.kyu4.snail;

public class Snail {

    public static int[] snail(int[][] array) {
        if(array[0].length ==0){
            return new int[0];
        }

        int n = array.length;
        int m = array.length;
        int[] out = new int[array.length * array.length];
        int k = 0;
        String direction = "right";
        int iMin = 0;
        int iMax = m - 1;
        int jMin = 0;
        int jMax = n - 1;
        int i;
        int j;
        boolean done = false;

        while (!done) {
            switch (direction) {
                case "right":
                    i = iMin;
                    for (j = jMin; j <= jMax; j++) {
                        out[k] = array[i][j];
                        k++;
                    }
                    iMin++;
                    direction = "down";
                    break;
                case "down":
                    j = jMax;
                    for (i = iMin; i <= iMax; i++) {
                        out[k] = array[i][j];
                        k++;
                    }
                    jMax--;
                    direction = "left";
                    break;
                case "left":
                    i = iMax;
                    for (j = jMax; j >= jMin; j--) {
                        out[k] = array[i][j];
                        k++;
                    }
                    iMax--;
                    direction = "up";
                    break;
                case "up":
                    j = jMin;
                    for (i = iMax; i >= iMin; i--) {
                        out[k] = array[i][j];
                        k++;
                    }
                    jMin++;
                    direction = "right";
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + direction);
            }
            if (iMin > iMax || jMin > jMax) {
                done = true;
            }
        }
        return out;
    }
}
