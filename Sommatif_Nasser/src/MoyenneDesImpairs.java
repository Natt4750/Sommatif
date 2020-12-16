/*
* Author : Nasser Wahbeh
*Date : Dec. 16, 2020
*Nom du Programe: MoyenneDesImpairs
*Description: Cette code permet de generer 20 entiers au hazard et trouver le moyenne de tous les nombres impairs produites. 
*/
public class MoyenneDesImpairs {
	public static void main(String[] args) 
	{
		
			int grandeur=20, i;
			int [] a = new int[grandeur];
			System.out.println(MoyenneDesImpairs(a));
		
		
	}
		static int MoyenneDesImpairs(int []Tab)
		{
				int grandeur=20, i;
				int [] a = new int[grandeur];
				
				for (i = 0; i < grandeur; i++)
				{
					a[i] = Math.random();
				}   

				for(i = 0; i < grandeur; i++)
				{
					if(a[i] % 2 != 0)
					{
						int ImpairSomme = 0;
						ImpairSomme = ImpairSomme + a[i]; 
						return ImpairSomme;
					}	
					
				}		
				
		}
		
		
		
	}
