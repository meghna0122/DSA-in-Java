import java.util.*;

public class m_151_GreedyAlgorithm_Job_scheduling {

    public static class job {
        int deadline;
        int profit;
        int idx;
        public job(int i,int j,int k){
            this.deadline=j;
            this.profit=k;
            this.idx=i;
        }
    }
    public static void main(String[] args) {
         int jobinfo[][]={{4,20},{1,10},{1,40},{1,30}};
         ArrayList<job> jobs=new ArrayList<>();
         for (int i = 0; i < jobinfo.length; i++) {
            jobs.add(new job(i,jobinfo[i][0],jobinfo[i][1]));
         }
         Collections.sort(jobs, (a,b) -> b.profit - a.profit);
         ArrayList<Integer> seq =new ArrayList<>();
         int time=0;
         for (int i = 0; i < jobinfo.length; i++) {
           job curr =  jobs.get(i);
           if(curr.deadline >time){
            seq.add(curr.idx);
            time++;
           }
         }

         System.out.println("Max jobs :"+ seq.size());
int max_profit=0 ;
int idxx;
         for (int i = 0; i < seq.size(); i++) {
             idxx=seq.get(i);
             max_profit+= jobinfo[idxx][1];
             System.out.print(idxx+" ");
         }
         System.out.println();
         System.out.println("Max profit:"+max_profit);
    }
}
