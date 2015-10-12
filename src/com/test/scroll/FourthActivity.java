package com.test.scroll;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FourthActivity extends Activity implements ScrollListener
{
	
	private TextView front;
	private MyScrollView myScroll;
	private ImageView header;
	private int headerHight;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fourth);
		
		front = (TextView)findViewById(R.id.front);
		header = (ImageView)findViewById(R.id.head);
		
		myScroll = (MyScrollView)findViewById(R.id.myscroll);
		myScroll.setScrollListener(this);
	}
	
	@Override
	public void onWindowFocusChanged(boolean hasFocus)
	{
		super.onWindowFocusChanged(hasFocus);
		headerHight = header.getHeight();
		
	}

	@Override
	public void ScrollChanged(int x, int y)
	{
		if(y >= headerHight)
		{
			front.setVisibility(View.VISIBLE);
		}
		else
		{
			front.setVisibility(View.GONE);
		}
		
	}
}
