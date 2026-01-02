class Solution {
    public int maxVowels(String s, int k) {
        int max=0;
        int n=s.length();
        int count=0;

        for(int j=0;j<k;j++){
            char ch=s.charAt(j);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        max=count;
        for(int i=k;i<n;i++){
            char add=s.charAt(i);
            if(add=='a'||add=='e'||add=='i'||add=='o'||add=='u'){
                count++;
            }
            char remove=s.charAt(i-k);
            if(remove=='a'||remove=='e'||remove=='i'||remove=='o'||remove=='u'){
                count--;
            }
            if (count>max){
                max=count;
            }
        }
        return max;
    }
}