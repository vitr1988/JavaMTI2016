
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
	
	public static void conditionTest(boolean testFlag){
		boolean flag = 5 < 3;
		int index = 0;
		if (flag) 
			System.out.println("5 > 3");		
		if (index == 0 || (5 / index == 10))
			System.out.println("Иначе!");		
		else 
			System.out.println("Совсем в крайнем случае!");
		
	}
	
	public static void whileDoTest(boolean flag){
		int i = 0;
		while (flag) {
			System.out.println("Test!!");	
			if (i < 100){
				i++;
			}
			else break;
		}
	}
	
	public static void doWhileTest(boolean flag){
		int i = 0;
		do {
			System.out.println("Test!!");	
			if (i < 100){
				i++;
			}
			else break;
		} while(flag);
	}
	
	public static void forTest(){
		for (int i = 0, j = 1; i < 25; i++, j++){
			if (i % 2 != 0) continue;
			System.out.println("Current index : " + (i + 1));
		}
		for (;;){
			
		}
	}
	
	public static void forEachTest(String[] args){
		for (String arg : args){
			System.out.println("Current value : " + arg);
		}
	}
	
	public static void switchTest(String str){
		String bufferString = "";
		switch(str){
			case "red" :  bufferString = "Stop!"; break;
			case "yellow" : {
				bufferString = "Warning!";  break;
			}
			case "green" : bufferString = "Let's go!"; break;
			default : bufferString = "No such color!"; break;
		}
		System.out.println(bufferString);
	}
	
	public void initArray(){
		boolean[] booleanArray;
		booleanArray = new boolean[2];
		booleanArray[0] = true;
		booleanArray[1] = false;
		
		for (int i = 0; i < booleanArray.length; i++){
			if (!booleanArray[i]){
				System.out.println("Mistake!");
			}
		}
		int[] intArray = new int[25];
		for (int i = 0; i < intArray.length; i++){
			intArray[i] = i * 1000;
		}
		
		int array[] = new int[]{1, 2, 3, 4, 5};
		
		int index, massive[];
	}
}
