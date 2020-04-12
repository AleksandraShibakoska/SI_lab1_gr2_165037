class Student {
        int grades[];
	String index;
	String firstName;
	String lastName;

	//TODO constructor

	//TODO seters & getters
Student(int grades, String index, String firstName, String lastName){
                this.grades=grades;
                this.index=index;
                this.firstName=firstName;
                this.lastName=lastName;
        }

        public int getGrades() {
                return this.grades;
        }
        public String getIndex(){
                return this.Index;
        }
        public double getfirstName(){
                return this.firstName;
        }
        public char getlastName(){
                return this.lastName;
        }
        public void setGrades(int grades) {
                this.grades=grades;
        }
        public void setIndex(String index){
                this.index=index;
        }
        public void setfirstName(double fisrtName){
                this.firstName=firstName;
        }
        public void setlastName(char lastName){
                this.lastName=lastName;
        }

	public double getAverage() {
		//TODO
	}

	public int ECTSCredits() {
		//TODO
	}
}
