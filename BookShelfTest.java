package bookshelf;

public class BookShelfTest {
	
	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("인간 본성의 법칙");
		shelfQueue.enQueue("철학은 어떻게 삶의 무기가 되는가");
		shelfQueue.enQueue("삶이 힘드냐고 니체가 물었다");
		shelfQueue.enQueue("넛지");
		shelfQueue.enQueue("트랜드 코리아2020");
		shelfQueue.enQueue("달을 닮은 너에게");
		shelfQueue.enQueue("부활");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
		System.out.println(shelfQueue.getSize());
	}
	

}
