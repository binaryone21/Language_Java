package seunghee._Do_it_자바_완전_정복._16_제네릭._04_제네릭_타입_범위_제한.ex03;

class A {}
class B extends A {}
class C extends B {}
class D extends C {}

class Goods<T> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}


class Test {
	void method1(Goods<A> g) {}				// case 1
	void method2(Goods<?> g) {}				// case 2
	void method3(Goods<? extends B> g) {}	// case 3
	void method4(Goods<? super B> g) {}		// case 4
}

public class BoundedTypeOfInputArguments {
	public static void main(String[] args) {
		Test t = new Test();

		// case 1
		t.method1(new Goods<A>());
		// t.method1(new Goods<B>());
		// t.method1(new Goods<C>());
		// t.method1(new Goods<D>());

		// case 2
		t.method2(new Goods<A>());
		t.method2(new Goods<B>());
		t.method2(new Goods<C>());
		t.method2(new Goods<D>());

		// case 3
		// t.method3(new Goods<A>());
		t.method3(new Goods<B>());
		t.method3(new Goods<C>());
		t.method3(new Goods<D>());

		// case 4
		t.method4(new Goods<A>());
		t.method4(new Goods<B>());
		// t.method4(new Goods<C>());
		// t.method4(new Goods<D>());
	}
}
