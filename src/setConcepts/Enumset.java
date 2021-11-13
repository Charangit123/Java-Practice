package setConcepts;

import java.util.EnumSet;
import java.util.Iterator;

public class Enumset {
// it is not synchronised
	// it is a highly performance java collection member 
	// faster than HashSet
	// all the methods are implememnted using bitwise arthematic operations

	enum lang {
		Java, JavaScript, Python, Csharp, Sql;
	}

	public static void main(String[] args) {
		// creation of enumset
		EnumSet<lang> en = EnumSet.allOf(lang.class);
		System.out.println(en);

		// range enum set
		EnumSet<lang> enrange = EnumSet.range(lang.Java, lang.Csharp);
		System.out.println(enrange);

		// empty enumset
		EnumSet<lang> emptyen = EnumSet.noneOf(lang.class);
		System.out.println(emptyen);

		// of
		EnumSet<lang> ofen = EnumSet.of(lang.Sql);
		System.out.println(ofen);

		// multiple enums
		EnumSet<lang> multipleen = EnumSet.of(lang.Sql, lang.Java);
		System.out.println(multipleen);

		// add and addAll
		EnumSet<lang> obj1 = EnumSet.noneOf(lang.class);
		EnumSet<lang> obj2 = EnumSet.allOf(lang.class);
		System.out.println(obj1);
		obj1.add(lang.Sql);
		System.out.println(obj1);
		obj1.addAll(obj2);
		System.out.println(obj1);

//		iterator
		EnumSet<lang> iterator = EnumSet.noneOf(lang.class);
		Iterator it = iterator.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		boolean b = iterator.remove(lang.Csharp);
		System.out.println(b);

	}

}
