package xhe;

public interface CheckNull {
	public int NOT_NULL = 7; //������ ��������� NOT_NULL - public statis 
	public static int checkNull(Object a, Object b) {
		if(a==null && b!=null) {
			return 1; //� ���� �������� null ������������ ������
					   //���� ��������� "1" - �� null  ����� �����
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
