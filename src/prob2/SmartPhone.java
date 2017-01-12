package prob2;

public class SmartPhone extends MusicPhone {

	@Override
	public void execute(String function) {
		if("통화".equals(function))
		super.execute(function);
		else if("음악".equals(function))
			playMusic();
		else{
			playApp();
		
		}
		}
		

	@Override
	protected void playMusic() {
		System.out.println("다운로드해서 음악실행");
	}
	public void playApp(){
		System.out.println("앱 실행");
	}
	}



