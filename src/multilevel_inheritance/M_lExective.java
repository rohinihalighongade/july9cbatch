package multilevel_inheritance;

public class M_lExective  {

	public static void main(String[] args) {
		M_lDgm dgm=new M_lDgm();
				dgm.multitasking();
				M_lManager manger=new M_lManager();
				manger.knowledge();
				manger.multitasking();
				M_lAssitManager assitmanger=new M_lAssitManager();
				assitmanger.attitude();
					assitmanger.knowledge();
		assitmanger.multitasking();

	}

}
