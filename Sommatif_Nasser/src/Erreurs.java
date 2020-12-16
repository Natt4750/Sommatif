/*
* Author : Nasser Wahbeh
*Date : Dec. 16, 2020
*Nom du Programe: Erreurs
*Description: Cette code permet d'afficher 'Bonjour mon ami' avec une nom donnée qui suivre cette phrase. 
*/
public class Erreurs
	{

		public static void main(String[] args)
			{
				System.out.println(saluerAmi("John"));
			}   // J'ai ajouter cette crocher pour completer la methode
			{
				
			}
		
		public static String saluerAmi(String a)   // J'ai rendu la méthode statique pour que la méthode soit accessible à toute la classe 
		{
				String message="Bonjour mon ami " + a;
				return message;
		}
		
	}
