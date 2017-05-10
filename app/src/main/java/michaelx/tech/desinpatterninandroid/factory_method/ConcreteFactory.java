package michaelx.tech.desinpatterninandroid.factory_method;

public class ConcreteFactory implements IFactory {

	@Override
	public <T extends IProduct> T create(Class<T> clazz) {
		IProduct product = null;
		try {
			product = (IProduct) Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return (T) product;
	}

}
