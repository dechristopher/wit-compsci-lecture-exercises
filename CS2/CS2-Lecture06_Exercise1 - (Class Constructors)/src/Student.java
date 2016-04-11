
public class Student {
		
		public String name;
		public int age;
		public boolean isScienceMajor;
		public char gender;
		
		public Student(){
			name = "John Doe";
			age = 21;
			isScienceMajor = false;
			gender = 'm';
		}
		
		public Student(String n, int a, boolean sci, char g){
			name = n;
			age = a;
			isScienceMajor = sci;
			gender = g;
		}
		
		public String toString(){
			return name + ", " + age + ", " + isScienceMajor + ", " + gender;
		}

}
