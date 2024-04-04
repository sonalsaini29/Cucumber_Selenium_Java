package InterviewQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class findDuplicateElement {

	public static void main(String[] args) {
		String name[] = { "Java", "JavScript", "Python", "C", "NodeJS", "Ruby", "Java" };

		// use for loop to map single element to single element check
		for (int i = 0; i < name.length; i++) {

			for (int j = i + 1; j < name.length; j++) {

				if (name[i].equals(name[j])) {
					System.out.println("Duplicate is :" + name[i]);
				}
			}
		}
		
		//*********************************************************************************
		// using HashSet as it does not take duplicate values to store
		Set<String> store = new HashSet<String>();

		for (String names : name) {

			if (store.add(names) == false) {

				System.out.println("Duplicate is:" + names);
			}
		}
		
		//*********************************************************************************
		// using hashMap as duplicates are allowed
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		for (String names : name) {

			Integer count = storeMap.get(names);
			if (count == null) {
				storeMap.put(names, 1);
			} else {
				storeMap.put(names, ++count);
			}
		}

		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();

		for (Entry<String, Integer> entry : entrySet) {

			if (entry.getValue() > 1) {
				System.out.println("Duplicate is" + entry.getKey());
			}

		}

	}

}
