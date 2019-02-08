public class BinaryIterativeSearch implements Practice03Search{
    public int search(int[] a, int target) {
        int lower = 0, upper = a.length-1, mid;
        while(lower < upper) {
            mid = (lower + upper)/2;
            if (a[mid] == target)
                return mid;
            if (target < a[mid])
                upper = mid - 1;
            else
                lower = mid + 1;
        }
        return -1;
    }

    public String searchName() {
        return "Binary Iterative Search";
    }
}
