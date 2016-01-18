/*A class representing card data.*/

public class QuizCard {

	    private String question;
	    private String answer;
		public QuizCard(String question, String answer){
			this.question=question;
			this.answer=answer;
			
		}
		
		public void setQuestion(String question){
			this.question=question;
		}
       
		public String getQuestion(){
			return question;
		}
			 public void setAnswer(String answer){
			 this.answer=answer;
		 }
		public String getAnswer(){
			return answer;
		}}
