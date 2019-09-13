public class Finder {
    public static Integer findMax(Integer[] intArray) {
        if(intArray == null) {
            return null;
        }
        if(intArray.length == 0) {
            return null;
        }
        int max = intArray[0];
        for(int a : intArray) {
            if(a > max){
                max = a;
            }

        }
        return max;
    }

    public static Integer findMin(Integer[] intArray) {
        if(intArray == null) {
            return null;
        }
        if(intArray.length == 0) {
            return null;
        }
        int min = intArray[0];
        for(int a : intArray) {
            if(a < min){
                min = a;
            }

        }
        return min;
    }
}
