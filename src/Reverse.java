public class Reverse {
    public static void main(String[] args) {

        int[] newAr = {10, 2, 8, 45, 60, 71, 3};
        int[] newArray = new int[newAr.length];
        for (int i = 0; i <= newAr.length / 2; i++) {
            newArray[newArray.length - 1 - i] = newAr[i];
            newArray[i] = newAr[newAr.length - 1 - i];
        }
        for (int y : newArray) {
            System.out.print(y + " ");
        }
    }
}

