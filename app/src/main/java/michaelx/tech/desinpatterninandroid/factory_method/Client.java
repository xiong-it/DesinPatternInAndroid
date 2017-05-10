package michaelx.tech.desinpatterninandroid.factory_method;

public class Client {

	public static void main(String[] args) {
		testNormalFactory();

		testSimpleFactory();
	}

	/**
	 * 测试标准工厂
	 */
	private static void testNormalFactory() {
		System.out.println("testNormalFactory");
		IFactory factory = new ConcreteFactory();
		IProduct product;
		// 根据实际需求决定生产产品A，还是B
		product = factory.create(ProductA.class);
//		product = factory.create(ProductB.class);
		product.doSomething();
		System.out.println("=========我是分割线=========");
	}

	/**
	 * 测试简单工厂
	 */
	private static void testSimpleFactory() {
		System.out.println("testSimpleFactory");
		IProduct product;
		// 根据实际需求决定生产产品A，还是B
//		product = SimpleFactory.create(ProductA.class);
		product = SimpleFactory.create(ProductB.class);
		product.doSomething();
	}

}
