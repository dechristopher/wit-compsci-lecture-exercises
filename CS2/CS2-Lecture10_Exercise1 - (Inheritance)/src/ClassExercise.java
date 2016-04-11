
class WIT{
	public WIT(){
		System.out.println("This is WIT no-arg constructor."); //1
	}
}

class CS extends WIT{
	public CS(){
		System.out.println("This is CS no-arg constructor."); //2
	}
}

public class ClassExercise {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("Before CS object is created."); //3
		CS cs = new CS();
		System.out.println("After CS object is created."); //4
	}

}

//prog.output == 3, 1, 2, 4
