package ra.mblog.androidevs;
import android.app.*;
import android.os.*;
import android.content.*;
import android.widget.*;

public class SplashScreenActivitys extends Activity
{
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen_activity);
		
		Thread mThread = new Thread(){
			
			public void run(){
				
				try{
					sleep(2000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}finally{
					startActivity(new Intent(SplashScreenActivitys.this,MainActivity.class));
					finish();
				}
			}
		};
		mThread.start();
		
		
		
		
	}
	
	
}
