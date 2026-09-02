public class Counter {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        if (arrayOfSheeps == null) {
            return 0;
        }
        
        int count = 0;
        for (Boolean elem : arrayOfSheeps) {
            if (Boolean.TRUE.equals(elem)) {
                count++;
            }
        }
        return count;
    }
}