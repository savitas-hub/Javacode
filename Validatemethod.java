package module;

public class Validatemethod {
	
	static void validScore(int score) {
		if (score>=0 && score<=100) {
			System.out.println("valid score");
		}else {
			System.out.println("invalid score");
		}
	}
		static void validScore(int score,int passingscore) {
		
			if (score >= 35) {
			 if (score >= 75 ) {
					System.out.println("Distinction");
				} else if (score >= 60) {
					System.out.println("First Class");
				} else if(score>=35) {
					System.out.println("second class");
				}} else {
					System.out.println("fail");
				}
	}
		static void validScore(int score,int passingscore,boolean Bonus) {
		
		
			if((score>=75 && passingscore>=35) && Bonus==true) {
				System.out.println("true");
			}

		}
		
	public static void main(String[] args) {
		validScore(85);
		validScore(80,35);
		
		validScore(80 ,55,true);
	
	}

}
