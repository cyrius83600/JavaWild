import java.util.Arrays;

public class Movies {
 public static void main(String [] args)
 {
	 String filmTitle = "Indiana Jones et la Dernière Croisade";
	 String[] films = {"Indiana Jones et la Dernière Croisade", "Indiana Jones et le Royaume du Crâne de Cristal","Indiana Jones et le Temple maudit"};
	 String[] actorsCroisade = {"Harrison Ford", "Sean Connery", "Denholm Elliott"};
	 String[] actorsCristal = {"Harrison Ford", "Shia LaBeouf", "Karen Allen"};
	 String[] actorsTemple = {"Harrison Ford", "Kate Capshaw", "Ke Huy Quan"};
	 String[][] actors = {actorsCroisade, actorsCristal, actorsTemple};
	 
	 for(int i = 0; i < films.length; i++)
	 {
		 System.out.print("Dans le film " + films[i] + " les acteurs sont : ");
		 System.out.println(Arrays.toString(actors[i]));
	 }
 }
}