package prob3;

public class Duck extends Bird {

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public void fly() {
		System.out.println("오리는 날지 않습니다.");
	}

	@Override
	public void sing() {
		System.out.println("오리는 소리내어 웁니다.");
	}
	public String toString(){
		return "오리의 이름은"+getName()+"입니다.";
	}
	

}
