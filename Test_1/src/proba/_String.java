package proba; //������ ������ String

public class _String {

	public static void main(String args[]) {
		// ������������� ��������� "+" � "+=" ��� ������ String
		String[] che = { "1", "2", "3", "4", "5" };
		String ch = "�������:";
		String[] sov_strok = { "6", "7" };

		for (int i = 0; i < che.length; i++) {
			if (i != che.length - 1)
				ch += che[i] + ",";
			else
				ch += che[i] + ".";
		}
		System.out.println(ch + "\n_________");
		// ������ ������� � ������� concat
		String res1 = che[0].concat(" and ") + sov_strok[0];
		String res2 = che[1].concat(" and ") + sov_strok[1];
		System.out.println(res1 + "\n_________");
		System.out.println(res2 + "\n_________");
		// ����������� ���-�� ��������
		String a = "����� ��� ����� - Z";
		int leng = a.length();
		System.out.println("������ ������ = " + leng + " ���������!" + "\n_________");
		// ���������� �������� �� ������ � ������� charAt
		int last = a.length() - 1; // ����� ������ -1, �.�. ������ ���������� � ����
		char b = a.charAt(last);
		System.out.println(b + "\n_________");
		// ������ �� ������� ��� � �������� �������� toCharArray()
		char[] aArray = a.toCharArray(); // ����������� ������ � ������
		for (int i = 0; i < aArray.length; i++) {
			if (aArray[i] == ' ')
				aArray[i] = '.';
			System.out.println(aArray);
			System.lineSeparator(); // ������� ������� Windows and Linux
		}
		// ���������� ��������� �� ������ substring
		String c = "abcdefghi";
		System.out.println("_________\n" + c.substring(1, 4));// � ���������� ������� � ������ �� ����� ��������
		System.out.println(c.substring(2, c.length() - 3));
		System.out.println(c.substring(5));
		// ��������� ����� �� ����� split
		String isbn = "978-3-16-148410-0";
		String[] isbnParts = isbn.split("-");

		System.out.println("_________\n" + "������� EAN.UCC: " + isbnParts[0]);
		System.out.println("����� ��������������� ������: " + isbnParts[1]);
		System.out.println("����� �����������: " + isbnParts[2]);
		System.out.println("����� �������: " + isbnParts[3]);
		System.out.println("����������� �����: " + isbnParts[4]);
		// ����� � ������ boolean contains
		boolean isContain1 = isbn.contains("16");// ����������� �� � ������ "16"
		System.out.println("_________\n" + isContain1);
		// �������� ����������� �� ������ �� ������������ ������� endsWith
		boolean isComEnding = isbn.endsWith("-1");// ����� false �.�. � ��� ������������� �� "-0"
		System.out.println("_________\n" + isComEnding);
		// �������� ���������� �� ������ �� ������������ ������� startsWith
		String s = "www.mysite.com";
		boolean isWww = s.startsWith("www");
		if (isWww) {
			boolean isMy = s.startsWith("my", 4); // ��� ������ �������, ��� ��������� ������� � ������ ������ ��������
			System.out.println("_________\n" + isMy + "\n_________");
		}
		// ����� indexOf ����������� ��� ������� ��������� ���������� ������� ���
		// ��������� � ������
		String data = "name:Igor\nsurname:Kolashnikov\nage:14\ntime:14:55";
		String[] lines = data.split("\n");// ��������� ������ �� ��������� �������� �� ��������� ������������ �������
											// ����� ������
		for (String line : lines) { /*
									 * �������� ������ ��������� (String line : lines ���������� for (int
									 * i=0;i<lines.lenght;i++){ String line=lines[i];} )
									 */
			int pos = line.indexOf(":");// ������� ������ ������� ��������� ������� ":" � ���������
			String attributeName = line.substring(0, pos);// ��������� ��� �������� �� ���������
			String value = line.substring(pos + 1, line.length());// ��������� �������� ��������
			System.out.println(attributeName + " - " + value);// ����� �� ����� ����������� �������� � ������ ���
																// �������.
		}
		// ����������� ����� toLowerCase, to UpperCase, trim
		String str = " � ����� ������ ���������! ";
		str = str.trim(); // ������ ������� � ������ � ����� ������
		System.out.println("_________\n" + str.toUpperCase());
		System.out.println(str.toLowerCase());
		// ��������� ����� boolean equals
		String str1 = "� ����� ������ ���������!";
		String str2 = "� ����� ������ ���������!";
		System.out.println("_________\n" + str.equals(str1));// false
		System.out.println(str1.toLowerCase().equals(str2));// true
		// ��������� � ��������������� int compareTo
		String name1 = "����";
		String name2 = "����";
		System.out.println("_________\n" + name1.compareTo(name2));// -8 �.�. �� ����� "�" 8 ��.
		System.out.println(name2.compareTo(name1));// 8 �.�. �� ����� "A" 8 ��.
		System.out.println("����".compareTo(name2));// 32 �.�. ������� ������� ���� ������������ ����
		System.out.println("����".compareToIgnoreCase("����")); // ��������� ��� ����� ��������

	}
}
