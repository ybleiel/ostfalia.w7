package s0start;

class Team {
	String name;
	int tore;
	int gegentore;
	int matches;
	int points;
}

public class Liga {
	
	static Team[] Liga;
	
	public static Team[] createTeams(String... name) {
		int i;
		Team[] m = new Team[name.length];
		
		i = 0;
		while (i < name.length) {
			m[i] = new Team();
			m[i].name = name[i];
			i++;
		}
		Liga = m;
		return m;
	}
	
	public static Team getTeam(String name) {
		int i;
		Team m = new Team();
		
		i = 0;
		while (i < Liga.length) {
			if (name == Liga[i].name) {
				m = Liga[i];
				return m;
			}
			i++;
		}
		return null;
	}
	
	public static void match(Team heim, Team gast, int toreheim, int toregast) {
		assert heim != null;
		assert gast != null;
		assert heim != gast;
		assert toreheim >= 0;
		assert toregast >= 0;
		heim.tore += toreheim;
		heim.gegentore += toregast;
		heim.matches++;
		if (toreheim > toregast) {
			heim.points += 3;
		}
		else if (toreheim == toregast) {
			heim.points += 1;
		}
		
		gast.tore += toregast;
		gast.gegentore += toreheim;
		gast.matches++;
		if (toreheim < toregast) {
			gast.points += 3;
		}
		else if (toreheim == toregast) {
			gast.points += 1;
		}
	}
	
	public static int getGoalDiff(Team t) {
		assert t != null;
		return t.tore - t.gegentore;
	}
	
	public static int getMatches(Team t) {
		assert t != null;
		return t.matches;
	}
	
	public static int getPoints(Team t) {
		assert t != null;
		return t.points;
	}
	
	public static void main(String[] args) {
		Team[] m = new Team[2];
		m = createTeams("BTSV", "Geitelde");
		match(m[0], m[1], 1, 6);
		
		System.out.println(m[0].points);
		System.out.println(getGoalDiff(m[1]));
	}
}
