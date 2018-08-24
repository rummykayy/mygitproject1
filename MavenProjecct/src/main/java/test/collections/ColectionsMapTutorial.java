package test.collections;

import java.util.HashMap;
import java.util.Map;

public class ColectionsMapTutorial {

	public ColectionsMapTutorial() {
		
	}

	public static void main(String[] args) {
		System.out.println("Map");
		
		Map<String, String> stringMap = new HashMap<>();
		
		stringMap.put("ABA", "ABA");
		stringMap.put("ABB","ABB");
		stringMap.put("ABC","ABC");
		stringMap.put("ABD","ABD");
		stringMap.put(null,null);
		stringMap.put(null,"CCC");

		System.out.println(stringMap);
		
//		stringList.add("AAA");
//		stringList.add("AAB");
//		stringList.add("AAC");
//		stringList.add("AAD");
//		
//		System.out.println(stringList);
//		
//		Collections.sort(stringList);
//		
//		System.out.println(stringList);
//		System.out.println("Tree Set:");
//
//		
//		TreeSet treeSet = new TreeSet();
//		treeSet.add("ABA");
//		treeSet.add("ABB");
//		treeSet.add("ABC");
//		treeSet.add("ABD");
//		treeSet.add("AAA");
//		treeSet.add("AAB");
//		treeSet.add("AAC");
//		treeSet.add("AAD");
//		
//		System.out.println(treeSet);
	}

}
