package xhe;

public interface CheckNull {
	public int NOT_NULL = 7; //символ константы NOT_NULL - public statis 
	public static int checkNull(Object a, Object b) {
		if(a==null && b!=null) {
			return 1; //в этом варианте null переместится вперед
					   //если поставить "1" - то null  будет внизу
		}
		if(a!=null && b==null) {
			return -1;
		}
		if(a==null && b==null) {
			return 0;
		}
		return NOT_NULL;
	}
}
