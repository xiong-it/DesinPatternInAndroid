package michaelx.tech.desinpatterninandroid.factory_method;

public interface IFactory {
	<T extends IProduct> IProduct create(Class<T> clazz);
}
