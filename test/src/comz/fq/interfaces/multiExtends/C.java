package comz.fq.interfaces.multiExtends;

public interface C extends A , B {

	@Override
	default String say() {
		// TODO Auto-generated method stub
		return A.super.say();
	}

}
