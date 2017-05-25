package threadEx;

public class TimerThread extends Thread{
	int n = 0;
	boolean init_stat = true;
	
	public void run(){
		while(true){
			System.out.println(n);
			n++;
			try{
				sleep(1000);
			}
			catch(InterruptedException e){
				return;
			}
		}
	}
	public void run(int a){
		while(true){
			System.out.println(n*a);
			n++;
			init_stat = turn(init_stat);
			pan(init_stat);
			try{
				sleep(1000*a);
			}
			catch(InterruptedException e){
				return;
			}
		}
	}
	
	public boolean turn(boolean a){
		if (a ==true){
			return false;
		}else{
			return true;
		}
	}
	public void pan(boolean a){
		if (a== true){
			System.out.println("아침입니다.");
		}else{
			System.out.println("밤입니다.");
		}
	}
	
}
