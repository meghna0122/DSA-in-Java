public class m_103_Rotate_array {
   
        public static void rotate(int[] nums, int k) {
            if(k==nums.length){
                return;
            }
            if(k>nums.length){
                k=k%nums.length;
            }
            int [] ans=new int [nums.length];
            int j=0;
            for(int i=nums.length-k;i<nums.length;i++){
                ans[j]=nums[i];
                j++;
            }
            for(int i=0;i<nums.length-k;i++){
                ans[j]=nums[i];
                j++;
            }
            for(int i=0;i<nums.length;i++){
                nums[i]=ans[i];
            }
            return;
    
        }
        public static void main(String[] args) {
            int nums[]={1,2,3,4};
            int key=2;
            rotate(nums,key);
            for (int i = 0; i < nums.length; i++) {
                System.out.println(nums[i]);
            }
        }

    }

