public class BinaryRecursiveSearch implements Practice03Search{
    public int search(int[] a, int target) {
        return binSearch(a, target, 0, a.length-1);
    }

    public int binSearch(int[] a, int target, int lower, int upper) {
        if (lower > upper)
            return -1;
        int center = (lower + upper)/2;
        if (a[center] == target)
            return center;
        else if(a[center] > target)
            return binSearch(a, target, center + 1, upper);
        return binSearch(a, target, lower, center - 1);
    }

    public String searchName() {
        return "Binary Recursive Search";
    }
}
