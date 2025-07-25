class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //extended moore's algorithm TC:O(N), SC:O(1)
        int n=nums.length;
        if(nums==null || n==0)
        {
          throw new IllegalArgumentException("array is null");
        }

        int count1=0,count2=0;
        int ele1=Integer.MIN_VALUE,ele2=Integer.MIN_VALUE;
        List<Integer> list =new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            if(count1==0 && ele2 != nums[i])
            {
                count1=1;
                ele1=nums[i];
            }else if(count2==0 && ele1 != nums[i])
            {
                count2=1;
                ele2=nums[i];
            }else if(ele1==nums[i])
            {
                count1++;
            }else if(ele2==nums[i])
            {
                count2++;
            }else
            {
                count1--;count2--;
            }
        }

        count1=0;count2=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==ele1) count1++;
            if(nums[i]==ele2) count2++;
        }

        int mini =(int) (n/3)+1;
        if(count1>=mini) list.add(ele1);
        if(count2>=mini) list.add(ele2);
        return list;
    }
}

// //Better Approach TC:O(NLOGN), SC:O(N)
// import java.util.*;

// public class Solution{
//     public static List<Integer> majorityElement(int []v) {
//       int n=v.length;
//       HashMap<Integer,Integer> map=new HashMap<>();
//       ArrayList<Integer> list=new ArrayList<>();
      
//       for(int i=0;i<n;i++)
//       {
//           map.put(v[i],map.getOrDefault(v[i],0)+1);
//       }
      
//       int mini = (int) (n/3)+1;
      
//       for(Map.Entry<Integer,Integer> entry : map.entrySet())
//       {
//           if(entry.getValue() >= mini)
//           {
//               list.add(entry.getKey());
//           }
//       }
//       Collections.sort(list);
      
//       return list;
//     }

//     public static void main(String args[]) {
//         int[] arr = {11, 33, 33, 11, 33, 11};
//         List<Integer> ans = majorityElement(arr);
//         System.out.print("The majority elements are: ");
//         for (int i = 0; i < ans.size(); i++) {
//             System.out.print(ans.get(i) + " ");
//         }
//         System.out.println();
//     }
// }

