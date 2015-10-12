package com.test.scroll;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

public class MyScrollView extends ScrollView
{

	private ScrollListener listener = null;
	public MyScrollView(Context context)
	{
		super(context);
	}

	public MyScrollView(Context context, AttributeSet attrs)
	{
		super(context, attrs);
	}

	public MyScrollView(Context context, AttributeSet attrs, int defStyle)
	{
		super(context, attrs, defStyle);
	}
	
	public void setScrollListener(ScrollListener listener)
	{
		this.listener = listener;
	}
	
	@Override
	protected void onScrollChanged(int l, int t, int oldl, int oldt)
	{
		super.onScrollChanged(l, t, oldl, oldt);
		if(listener != null)
		{
			listener.ScrollChanged(getScrollX(), getScrollY());
		}
	}
	
	
	

}
