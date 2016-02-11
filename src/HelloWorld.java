
/**
 * Это пробный проект для изучения основ Java
 * Выпуск MTI 2016
 * @author ViTr
 */
public class HelloWorld {
	
	/* Это программа, выводящая некотрую надпись
	 * на 
	 * 	экран
	 */
	
	/**
	 * Запускаемый метод
	 * 
	 * @param args		ожидаемые параметры запуска программы
	 */
	public static void main(String[] args) {
		// предполагается вывод строки приветствия
		System.out.println("Hello 2016 Year!");
		// здесь могла быть Ваша реклама	
		int index = 5 + 5 % 2;
		System.out.println(index);
		int binaryIndex = 0b1000;
		System.out.println(binaryIndex);
		byte b = (byte) 1000;
		short sh = (int) 126;
		int ind = 1024;
		long longIndex = 5428578457845L;
		char ch = 'А';
		char returnBlock = '\n';
		char unicodeSymbol = '\u0040';
		boolean flag = true; //false;
		String testString = "Тестовый текст";
		String str = "123" + "456";
		
		int summa = 125 + (int) 'Э';
		String concat = 125 + "Э"; //"125Э"
		
		double d = 2.5;
		float f = (float) 2.5f;
		
		boolean booleanOperand = !true | flag;
		
		boolean expression = flag && (5 > 3) && (100/2 - 15 > 0) && (11 - 2 < 7);
		
		int varible = 15;
		varible += ind + 5;; // 1024
//		varible = varible + ind + 5; //1044
		byte bit = 100;
		bit = (byte) (bit % 29); // (byte) (bit + 29)
		bit = (byte) (bit + 29);
		System.out.println(bit);
		
		System.out.println(varible);
		
		char symbol = 100 == 125 ? 'A' : 'Я';
		int in = varible > 0 ? varible : -varible; // |varible|
		
//		d = d + 1;
		
		System.out.println(++d);
		System.out.println(d);
		
		System.out.println((((2 + 2) * 2)));
		
		test();
	}
	
	public static void test(){
		int a = 125;
		int b = 0;
		{
			int c = 125 + 2 * 512;
			c += a;
			b = c;
		}
		System.out.println(b);
	}
	
	{
		
	}
}
