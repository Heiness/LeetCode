class Solution {
    public int maxArea(int[] height) {
        int res=0;
        int i=0;
        int j=height.length-1;

        while(i<j){
            res = Math.max(res, get_area(i,j,height));
            if(height[i]>height[j]) j--;
            else i++;
        }
        return res;
    }

    static int get_area(int i, int j, int[] h){
        int height = Math.min(h[i],h[j]);
        int weight = j-i;
        return height * weight;
    }
}