class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       List<Integer> result = new ArrayList<>();
        
        if (matrix.length == 0) {
            return result; 
        }

        int A = matrix.length; 
        int B = matrix[0].length; 

        int top = 0;
        int bottom = A - 1;
        int left = 0;
        int right = B - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result; 
    }
}