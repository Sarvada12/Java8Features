package newfeatures;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Creating consumer action
public class ForEachDemo1 {

	public static void main(String[] args) {
List<String> names=Arrays.asList("John","Mike","Alex");
	
Consumer<String> convertUpperCase=new Consumer<String>()
{

	@Override
	public void accept(String t) {
		System.out.println(t.toUpperCase());
		
	}
	};
	
	//traversing through consumer interface implementation
	names.forEach(convertUpperCase);
	
	//consumer to display a number
	Consumer<Integer> display=a->System.out.println(a);
		
	//implement display using accept
	display.accept(10);
	}

}
