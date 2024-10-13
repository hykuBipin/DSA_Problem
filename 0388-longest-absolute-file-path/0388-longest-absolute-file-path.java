class Solution {
public int lengthLongestPath(String input) {
    String[] paths = input.split("\n");
    int[] stack = new int[paths.length+1];
    int maxLen = 0;
    for(String s:paths){
        int lev = s.lastIndexOf("\t")+1, 
        curLen = stack[lev+1] = stack[lev]+s.length()-lev+1;
        log("lev:" +lev);
        log("stack[lev]" +stack[lev]);
        log("stack[lev+1]:" +stack[lev+1]);
        log("s:" +s);
        log(s.length()-lev);
        log(stack[lev]+s.length()-lev+1);
        if(s.contains(".")) maxLen = Math.max(maxLen, curLen-1);
    }
    return maxLen;
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