import java.util.*;
public class denomination{
    public static void main(String[] args){
	int d1,d2,d3,d4,d1_note,d2_note,d3_note,d4_note,d1_tot,d2_tot,d3_tot,d4_tot,atm_tot;
	Scanner s=new Scanner(System.in);
        System.out.println("enter 1st denomination ");
	d1=s.nextInt();
System.out.println("enter no of notes for 1st denomination ");
	d1_note=s.nextInt();
	System.out.println("enter 2nd denomination ");
	d2=s.nextInt();
System.out.println("enter no of notes for 2nd denomination ");
	d2_note=s.nextInt();
	System.out.println("enter 3rd denomination ");
	d3=s.nextInt();
System.out.println("enter no of notes for 3rd denomination ");
	d3_note=s.nextInt();
	System.out.println("enter 4rth denomination ");
	d4=s.nextInt();
System.out.println("enter no of notes for 4rth denomination ");
	d4_note=s.nextInt();
	d1_tot=d1*d1_note;
	d2_tot=d2*d2_note;
	d3_tot=d3*d3_note;
	d4_tot=d4*d4_note;
	atm_tot=d1_tot+d2_tot+d3_tot+d4_tot;
	System.out.println("total amount in atm = "+atm_tot);
}
}
        