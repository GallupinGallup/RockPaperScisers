package modle;

public class Random {
	public String getAnswer(){
		int item = (int) (Math.random() * 3);
		String answer = "";
		if(item == 0)
		{
			answer = "Rock";
		}else if(item == 1)
		{
			answer = "paper";
		}else if(item == 2)
		{
			answer = "scissors";
		}
		
		return answer;
	}
	
	
}
