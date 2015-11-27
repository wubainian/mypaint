package com.gl.paint;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class ActivityNeedView extends Activity{
	private View view;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) { 
		super.onCreate(savedInstanceState);
		//TODO
		setContentView(view);
	}
}
