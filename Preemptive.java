package sjf;
import java.util.*;

public class Preemptive
{
	public static void main (String args[])
    {		
    	Scanner sc = new Scanner(System.in);
        System.out.println ("Enter no of process :-");
        
        int n= sc.nextInt();
        int pid[] = new int[n]; // it takes pid of process
        int at[] = new int[n]; // at means arrival time
        int bt[] = new int[n]; // bt means burst time
        int ct[] = new int[n]; // ct means complete time
        int ta[] = new int[n];// ta means turn around time
        int wt[] = new int[n];  // wt means waiting time
        int f[] = new int[n];  // f means it is flag it checks process is completed or not
        int k[] = new int[n];   // it is also stores brust time
        int i, st = 0, tot = 0;
        float avg_wt = 0, avg_ta = 0;
 
        for(i=0; i<n; i++)
        {
        	pid[i] = i+1;
            System.out.println ("Enter process " +(i+1)+ " arrival time :-");
            at[i] = sc.nextInt();
            System.out.println("Enter process " +(i+1)+ " burst time :-");
            bt[i] = sc.nextInt();
            k[i] = bt[i];
            f[i] = 0; 
        }
    
        while(true)
        {
        	int min = 99, c = n;
            if(tot == n)
            	break;
            for(i=0; i<n; i++)
            {
            	if((at[i] <= st) && (f[i] == 0) && (bt[i] < min))
            	{
            		min = bt[i];
            		c = i;
            	}
            }
            
            if (c == n)
            	st++;
            else
            {
            	bt[c]--;
            	st++;
                if (bt[c] == 0)
                {
                	ct[c] = st;
                    f[c] = 1;
                    tot++;
                }
                
            }
            
        }
        
        for(i=0; i<n; i++)
        {
        	ta[i] = ct[i] - at[i];
            wt[i] = ta[i] - k[i];
            avg_wt += wt[i];
            avg_ta += ta[i];
        }
        
        System.out.println("\n\nProcess_ID\t\tArrival_Time\t\tBurst_Time\t\tCompletion_Time\t\tTurnaround_Time\t\tWaiting_Time");
        for(i=0;i<n;i++)
        {
        	System.out.println(pid[i] +"\t\t\t"+ at[i]+"\t\t\t"+ k[i] +"\t\t\t"+ ct[i] +"\t\t\t"+ ta[i] +"\t\t\t"+ wt[i]);
        }
        
        System.out.println("\nAverage Turn Around Time = "+ (float)(avg_ta/n));
        System.out.println("\nAverage Waiting Time = "+ (float)(avg_wt/n));
        sc.close();
        
    }
}