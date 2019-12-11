package ra.mblog.androidevs;

import android.app.*;
import android.os.*;
import android.webkit.*;
import android.widget.*;
import android.view.*;
import android.content.*;
import android.graphics.drawable.*;
import android.graphics.*;

public class MainActivity extends Activity 
{
	
	WebView rablog;
	String url;
	
	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		
		
		
		url = "http://tintahitam94.blogspot.com/";
		
		rablog = (WebView)findViewById(R.id.ra_home);
		rablog.setWebViewClient(new BlogClient());
		rablog.getSettings().setDisplayZoomControls(true);
		rablog.getSettings().setJavaScriptEnabled(true);
		rablog.loadUrl(url);
		
	}
		
	private class BlogClient extends WebViewClient
	{

		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url)
		{
			view.loadUrl(url);
			return true;
		}
			
			
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.ra_menu,menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		switch (item.getItemId()){
			
			case R.id.ra_item:
				
				return true;
				
			case R.id.ra_item_a:
				
				return true;
				
			case R.id.ra_item_b:
				
				return true;
				
			case R.id.ra_item_c:
				
				return true;
				
			case R.id.ra_item_d:
				finishAndRemoveTask();
				Toast.makeText(this,R.string.ra_toast_exit,Toast.LENGTH_SHORT).show();
				return true;
				
		}
		return true;
	}
	
	
    
}
