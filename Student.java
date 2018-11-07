/**develop a program to create Student object to store is 
* six subjects marks. all six subject marks must be in between 
* 0 to 100 inclusive. you must read all six object marks 
* from keyboard
*/
class Student {
	private double engMarks;
	private double hindiMarks;
	private double marathiMarks;
	private double mathMarks;
	private double scienceMarks;
	private double socialMarks;

	public void setEngMarks(double engMarks)throws IllegalArgumentException {
		if ((engMarks < 0)||(engMarks > 100)) {
			throw new IllegalArgumentException("Please enter valid marks 0 to 100");
		}
		else{
			this.engMarks = engMarks;
		}
	}
	public void setHindiMarks(double hindiMarks)throws IllegalArgumentException {
		if((hindiMarks < 0)||(hindiMarks > 100)){
			throw new IllegalArgumentException("Please enter valid marks 0 to 100");
		}
		else{
			this.hindiMarks = hindiMarks;
		}
	}
	public void setMarathiMarks(double marathiMarks)throws IllegalArgumentException {
		if((marathiMarks < 0)||(marathiMarks > 100)){
			throw new IllegalArgumentException("Please enter valid marks 0 to 100");
		}
		else{
			this.marathiMarks = marathiMarks;
		}
	}
	public void setMathMarks(double mathMarks)throws IllegalArgumentException {
		if((mathMarks < 0)||(mathMarks > 100)){
			throw new IllegalArgumentException("Please enter valid marks 0 to 100");
		}
		else{
			this.mathMarks = mathMarks;
		}
	}
	public void setScienceMarks(double scienceMarks)throws IllegalArgumentException {
		if((scienceMarks < 0)||(scienceMarks > 100)){
			throw new IllegalArgumentException("Please enter valid marks 0 to 100");
		}
		else{
			this.scienceMarks = scienceMarks;
		}
	}
	public void setSocialMarks(double socialMarks)throws IllegalArgumentException {
		if((socialMarks < 0)||(socialMarks > 100)){
			throw new IllegalArgumentException("Please enter valid marks 0 to 100");
		}
		else{
			this.socialMarks = socialMarks;
		}
	}
	public double getEngMarks(){
		return this.engMarks;
	}
	public double getHindiMarks(){
		return this.hindiMarks;
	}
	public double getMarathiMarks(){
		return this.marathiMarks;
	}
	public double getMathMarks(){
		return this.marathiMarks;
	}
	public double getScienceMarks(){
		return this.scienceMarks;
	}
	public double getSocialMarks(){
		return this.socialMarks;
	}
	public void display(){
		System.out.println("Student Marks :");
		System.out.println("\t\tEnglish Marks :"+ this.getEngMarks());
		System.out.println("\t\tHindi Marks :"+ this.getHindiMarks());
		System.out.println("\t\tMarathi Marks :"+ this.getMarathiMarks());
		System.out.println("\t\tMathematics Marks :"+ this.getMathMarks());
		System.out.println("\t\tScience Marks :"+ this.getScienceMarks());
		System.out.println("\t\tSocial Science Marks :"+ this.getSocialMarks());
	}
}