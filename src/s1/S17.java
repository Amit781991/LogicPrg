package s1;
import s1.A.B;
import s1.A.B.C;
import s1.A.B.C.E;
import s1.A.B.D;
class A{
	 class B{
		int x=6;
		void m2() {
			System.out.println("m2 of B");
		}
		class C{
			 int y=5;
			 void m1() {
				System.out.println("m1 of C");
			}
			 class E {
				 int r = 9;
				 void m1() {
					 System.out.println("m1 of E");
				}
			 }
		}
		class D{
			int z=7;
			 void m2() {
				 System.out.println("m2 of D");
			}
		}
	}
}
public class S17 {
	public static void main(String[] args) {
		A a = new A();
	//	a.new B().new C().m1(); 
		B b = a.new B();
		int q=b.x;
		System.out.println(q);
		b.m2();
		C c = b.new C();    //	C c = new a.new B().new C();
		int w=c.y;
		System.out.println(w);
		c.m1();
		 D d = b.new D();
		int e = d.z;
		System.out.println(e);
		d.m2();
		E e1 = c.new E();
		int r=12;
		System.out.println(r);
		e1.m1();
		
	}
}
