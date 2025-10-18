class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        int start = arr[0][0];
        int end = arr[0][1];
        ArrayList<int[]> ans = new ArrayList<>();
        for(int[] it : arr){
            int tempStart=it[0];
            int tempEnd=it[1];
            if(tempStart<=end){
                end=Math.max(tempEnd,end);
            }
            else{
                ans.add(new int[]{start,end});
                start=tempStart;
                end=tempEnd;
            }
        }
        ans.add(new int[]{start,end});
        return ans.toArray(new int[ans.size()][]);
 
    }
}
