package Java_All_class;

public class Gijdisc {

	
	public static void test() {
		
		
		try {
			int i = 10;
			int j = 4;
			
			System.out.println(i/j);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
				
			System.out.println("completed");
			}
		}
	public static void main(String[] args) {
		
		test();
	}
		
	}

