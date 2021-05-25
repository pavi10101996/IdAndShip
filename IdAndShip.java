import java.util.*;
class IdAndShip
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++)
		{
		    char c = sc.next().charAt(0);
		    if(c=='B' || c=='b')
		    System.out.println("BattleShip");
		    if(c=='C' || c=='c')
		    System.out.println("Cruiser");
		    if(c=='D' || c=='d')
		    System.out.println("Destroyer");
		    if(c=='F' || c=='f')
		    System.out.println("Frigate");
		}
		
	}
}