package prob5;
public class MyStack implements Stack {
	int top=-1;
	String stack1[];
	public MyStack(int x){
		stack1=new String[x];
	}
	public void resize(){
		int Max=stack1.length*2;
		String sub[]=new String[Max];
		for(int i=0;i<top;i++){
			sub[i]=stack1[i];
		}
		stack1=sub;
	}
	@Override
	public void push(String item) {
		top++;
		if(top+1==stack1.length){
		   resize();
		}
		else{
			stack1[top]=item;
		}
	}
	@Override
	public String pop() throws MyStackException {
		if(top==-1){
			throw new MyStackException();
		}
		else{
			return stack1[top--];
		}
	}
	@Override
	public boolean isEmpty() {// 공백상태인지 알아보는 함수
		if(top==-1){
			return true;
		}
		else{
			return false;
		}	
	}
	@Override
	public int size() {
		return top+1;
	}

}
