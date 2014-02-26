import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arrays_Sets {

	public static void main(String[] args) {
		List<String> array = new ArrayList<>(10);
		array.add(0, "Hi");
		array.set(0, "hi");
		array.add(1, "There");
		array.set(1, "there");
		Iterator<String> iter = array.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
