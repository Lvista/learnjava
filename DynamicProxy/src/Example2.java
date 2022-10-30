import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 * @author Lvista
 */
public class Example2 {
	public static void main(String[] args) {

		/*
		 *现在我们手上拿到一个已经包装好的Hello接口，而我们想要一个个性化的包而不能拆开改造
		 *于是就有了动态代理。
		 *
		 *下面我们先打造好一个我们想要的个性化外壳，就像外骨骼一样，外骨骼也需要一定的接口规范
		 *才能装在原本的接口上
		 */
		InvocationHandler handler = new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println(method);
				if (method.getName().equals("morning")) {
					System.out.println("Good morning, " + args[0]);
				}
				return null;
			}
		};
		/*
		 * 下面就可以把上面构造好的外骨骼装上，当然还需要一些适配器，也就是下面展示的ClassLoader和接口，
		 * 装上以后就可以用这个临时的个性化的类，即构造实例
		 */
		Hello hello = (Hello) Proxy.newProxyInstance(Hello.class.getClassLoader(), // 传入ClassLoader
				new Class[] { Hello.class }, // 传入要实现的接口
				handler); // 传入处理调用方法的InvocationHandler
		/*
		 * 使用该实例
		 */
		hello.morning("Bob");
	}
}

interface Hello {
	void morning(String name);
}
