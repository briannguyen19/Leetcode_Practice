import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            
            for (int j = 1; j < i; j++) {
                int left = matrix.get(i - 1).get(j - 1);
                int right = matrix.get(i - 1).get(j);
                row.add(left + right);
            }
            
            if (i > 0) {
                row.add(1);
            }
            matrix.add(row);
        }
        
        return matrix;
    }
}