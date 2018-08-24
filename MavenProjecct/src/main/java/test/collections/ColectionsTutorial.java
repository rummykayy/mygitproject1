package test.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class ColectionsTutorial {

	public ColectionsTutorial() {
		
	}

	public static void main(String[] args) {
		System.out.println("Array List:");
		List<String> stringList = new ArrayList<>();
		stringList.add("ABA");
		stringList.add("ABB");
		stringList.add("ABC");
		stringList.add("ABD");

		System.out.println(stringList);
		
		stringList.add("AAA");
		stringList.add("AAB");
		stringList.add("AAC");
		stringList.add("AAD");
		
		System.out.println(stringList);
		
		Collections.sort(stringList);
		
		System.out.println(stringList);
		
		for(int i=0; i<stringList.size(); i++){
			
			System.out.println(stringList.get(i)+"-");
		}
		System.out.println("for each loop --------");
		for(String stringValue: stringList){
			System.out.println(stringValue+"-");
		}
				
		System.out.println("Tree Set:");

		
		TreeSet treeSet = new TreeSet();
		treeSet.add("ABA");
		treeSet.add("ABB");
		treeSet.add("ABC");
		treeSet.add("ABD");
		treeSet.add("AAA");
		treeSet.add("AAB");
		treeSet.add("AAC");
		treeSet.add("AAD");
		
		System.out.println(treeSet);
	}

}
