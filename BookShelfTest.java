package bookshelf;

public class BookShelfTest {
	
	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("�ΰ� ������ ��Ģ");
		shelfQueue.enQueue("ö���� ��� ���� ���Ⱑ �Ǵ°�");
		shelfQueue.enQueue("���� ����İ� ��ü�� ������");
		shelfQueue.enQueue("����");
		shelfQueue.enQueue("Ʈ���� �ڸ���2020");
		shelfQueue.enQueue("���� ���� �ʿ���");
		shelfQueue.enQueue("��Ȱ");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
		System.out.println(shelfQueue.getSize());
	}
	

}
