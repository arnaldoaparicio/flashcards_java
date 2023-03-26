public class Card {

    private String question;
    private String answer;
    private String category;


    Card(String question, String answer, String category) {
        this.question = question;
        this.answer = answer;
        this.category = category;
    }

        public String getQuestion() {
            return this.question;
        }

        public String getAnswer() {
            return this.answer;
        }

        public String getCategory() {
            return this.category;
        }
}

