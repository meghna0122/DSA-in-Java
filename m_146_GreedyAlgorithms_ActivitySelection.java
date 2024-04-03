import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class m_146_GreedyAlgorithms_ActivitySelection {
// if end array is given in sorted manner --> O(n)
    public static void ActivitySelection_Sortedend(int start[],int end[]){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        int lastend = end[0];
        int maxAct=1;
        for (int i = 1; i < end.length; i++) {
            if(start[i]>=lastend){
                maxAct++;
                ans.add(i);
                lastend=end[i];
            }
        }
        int j=0;
        System.out.println("Max activities:"+maxAct);
        while (j<ans.size()) {
            System.out.print("A"+ans.get(j)+" ");
            j++;

        }
    }

    // if end array is not sorted --> O(nlogn)

    public static void ActivitySelection_NotSortedEnd(int start[],int end[]){
        int activities[][]=new int[start.length][3];
        for (int i = 0; i < activities.length; i++) {
                activities[i][0]=i;
                activities[i][1]=start[i];
                activities[i][2]=end[i];
        }

        Arrays.sort(activities, Comparator.comparingDouble(o-> o[2]));

        int maxAct=0;
        maxAct=1;
       int lastend=activities[0][2];
ArrayList<Integer> ans = new ArrayList<>();
ans.add(activities[0][0]);
for (int i = 1; i < end.length; i++) {
    if(activities[i][1]>=lastend){
        maxAct++;
        ans.add(activities[i][0]);
        lastend=activities[i][2];
    }
}

System.out.println("max activities:"+maxAct);
int j=0;
while (j<ans.size()) {
    System.out.print("A"+ans.get(j)+" ");
    j++;
}
    }
    public static void main(String[] args) {
        int start[] ={1,3,0,5,8,5};
        int end[] =  {2,4,6,7,9,9};
        ActivitySelection_Sortedend(start,end);
int start_new[]={0,1,3,5,5,8};
int end_new[]=  {6,2,4,7,9,9};
        System.out.println();
        ActivitySelection_NotSortedEnd(start_new,end_new);
    }
}
