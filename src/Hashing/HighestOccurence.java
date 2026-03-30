package Hashing;


public class HighestOccurence {
    public int occur(int[] num){
        int n = num.length;

        int maxFreq = 0;

        int maxEle = 0;

        boolean [] visited = new boolean[n];

        for(int i = 0; i < n; i++){
            if(visited[i]) continue;

            int freq = 0;

            for(int j = i; j<n; j++){
                if(num[i] == num[j]){
                    freq++;
                    visited[j] = true;
                }
            }
            if(freq > maxFreq){
                maxFreq = freq;
                maxEle = num[i];
            } else if (freq == maxFreq) {
                maxEle = Math.min(maxEle , num[i]);
            }
        }
        return maxEle;
    }

    public static void main(String[] args) {
        int [] num = { 1, 2 ,2 ,3 ,4 ,5 ,5, 3, 3, 4};
        HighestOccurence occ = new HighestOccurence();
        int ans = occ.occur(num);
        System.out.println(ans);
    }
}
