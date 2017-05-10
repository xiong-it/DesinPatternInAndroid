package michaelx.tech.desinpatterninandroid.factory_method;

/**
 * Created by xiongxunxiang on 2017/3/31.
 * 简单工厂，又称：静态方法工厂
 */

public class SimpleFactory {

    public static  <T extends IProduct> T create(Class<T> clazz) {
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
