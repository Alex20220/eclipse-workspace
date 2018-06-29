package proba; //методы класса String

public class _String {

	public static void main(String args[]) {
		// перегруженные операторы "+" и "+=" для класса String
		String[] che = { "1", "2", "3", "4", "5" };
		String ch = "Считаем:";
		String[] sov_strok = { "6", "7" };

		for (int i = 0; i < che.length; i++) {
			if (i != che.length - 1)
				ch += che[i] + ",";
			else
				ch += che[i] + ".";
		}
		System.out.println(ch + "\n_________");
		// лучшее слеяние с помощью concat
		String res1 = che[0].concat(" and ") + sov_strok[0];
		String res2 = che[1].concat(" and ") + sov_strok[1];
		System.out.println(res1 + "\n_________");
		System.out.println(res2 + "\n_________");
		// определение кол-ва символов
		String a = "Много для теста - Z";
		int leng = a.length();
		System.out.println("Длинна строки = " + leng + " знакомест!" + "\n_________");
		// извлечение символов из строки с помощью charAt
		int last = a.length() - 1; // Длина строки -1, т.к. отсчёт начинатеся с нуля
		char b = a.charAt(last);
		System.out.println(b + "\n_________");
		// работа со строкой как с массивом символов toCharArray()
		char[] aArray = a.toCharArray(); // преобразуем строку в массив
		for (int i = 0; i < aArray.length; i++) {
			if (aArray[i] == ' ')
				aArray[i] = '.';
			System.out.println(aArray);
			System.lineSeparator(); // перевод строкив Windows and Linux
		}
		// извлечение подстроки из строки substring
		String c = "abcdefghi";
		System.out.println("_________\n" + c.substring(1, 4));// в параметрах индексы с какого по какой выводить
		System.out.println(c.substring(2, c.length() - 3));
		System.out.println(c.substring(5));
		// разбиение строк на части split
		String isbn = "978-3-16-148410-0";
		String[] isbnParts = isbn.split("-");

		System.out.println("_________\n" + "Префикс EAN.UCC: " + isbnParts[0]);
		System.out.println("Номер регистрационной группы: " + isbnParts[1]);
		System.out.println("Номер регистранта: " + isbnParts[2]);
		System.out.println("Номер издания: " + isbnParts[3]);
		System.out.println("Контрольная цифра: " + isbnParts[4]);
		// поиск в строке boolean contains
		boolean isContain1 = isbn.contains("16");// содержиться ли в строке "16"
		System.out.println("_________\n" + isContain1);
		// проверка завершается ли строка на определенные символы endsWith
		boolean isComEnding = isbn.endsWith("-1");// будет false т.к. у нас заканчивается на "-0"
		System.out.println("_________\n" + isComEnding);
		// проверка начинается ли строка на определенные символы startsWith
		String s = "www.mysite.com";
		boolean isWww = s.startsWith("www");
		if (isWww) {
			boolean isMy = s.startsWith("my", 4); // это второй вариант, где указываем позицию с какого начать проверку
			System.out.println("_________\n" + isMy + "\n_________");
		}
		// метод indexOf применяется для первого вхождения указанного символа или
		// подстроки в строке
		String data = "name:Igor\nsurname:Kolashnikov\nage:14\ntime:14:55";
		String[] lines = data.split("\n");// разбиваем строку на несколько подстрок на основании встречаемого символа
											// новой строки
		for (String line : lines) { /*
									 * проходим каждую подстроку (String line : lines эквивалент for (int
									 * i=0;i<lines.lenght;i++){ String line=lines[i];} )
									 */
			int pos = line.indexOf(":");// находим индекс первого вхождения символа ":" в подстроке
			String attributeName = line.substring(0, pos);// вычленяем имя атрибута из подстроки
			String value = line.substring(pos + 1, line.length());// вычленяем значение атрибута
			System.out.println(attributeName + " - " + value);// вывод на экран вычлененных значений в нужном нам
																// формате.
		}
		// модификация строк toLowerCase, to UpperCase, trim
		String str = " Я помню ЧУДНОЕ мгновенье! ";
		str = str.trim(); // убрали пробелы в начале и конце строки
		System.out.println("_________\n" + str.toUpperCase());
		System.out.println(str.toLowerCase());
		// сравнение строк boolean equals
		String str1 = "Я помню чудное МГНОВЕНЬЕ!";
		String str2 = "я помню чудное мгновенье!";
		System.out.println("_________\n" + str.equals(str1));// false
		System.out.println(str1.toLowerCase().equals(str2));// true
		// сравнение с упорядочиванием int compareTo
		String name1 = "Маша";
		String name2 = "Миша";
		System.out.println("_________\n" + name1.compareTo(name2));// -8 т.к. до буквы "И" 8 зн.
		System.out.println(name2.compareTo(name1));// 8 т.к. до буквы "A" 8 зн.
		System.out.println("маша".compareTo(name2));// 32 т.к. верхний регистр Миша предшествует маша
		System.out.println("маша".compareToIgnoreCase("Миша")); // сравнение без учета регистра

	}
}
