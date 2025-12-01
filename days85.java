public class days85 {
    public static void main(String[] args) {
        int[] arr = {5, 12, 3, 45, 22, 45, 1};
        
        int max = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.println("Array: ");
        for (int n : arr) System.out.print(n + " ");
        System.out.println("\nNilai maksimal = " + max);
    }
}
