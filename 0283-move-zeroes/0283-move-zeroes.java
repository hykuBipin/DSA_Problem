import java.util.*;
class Solution {
    public void moveZeroes(int[] nums) {
        int nonzeroindex=0;  
        for(int i=0 ; i< nums.length; i++)
        {
            log(nums[i]);
            log(nums.length);
            if(nums[i] != 0)
            {
                nums[nonzeroindex++] = nums[i];
            }
        }
          while (nonzeroindex < nums.length)
            {
                nums[nonzeroindex++] = 0;
            }
        
    }
    
      	private static <T> void log(T ...x){

    if (true) { // change to false to disable all log output

			var sb = new StringBuilder();

      int line = Thread.currentThread().getStackTrace()[2].getLineNumber()-47;

      sb.append("L");

      sb.append(line);

      sb.append(":");

      for(T v : x) {

        sb.append(" ");

        if(v == null)

          sb.append("<null>");

        else if(v.getClass().isInstance(new int[0]))

          sb.append(Arrays.toString((int[])v));

        else if(v.getClass().isInstance(new boolean[0]))

          sb.append(Arrays.toString((boolean[])v));

        else if(v instanceof ListNode)

          sb.append(((ListNode)v).val);

        else

          sb.append(v);

      }

			System.out.println(sb.toString());

		}

  }
}