package com.lanchuang.wgc.liuxin1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener
{

	private Button button1 , button2 , button3 , button4;

	@Override
	protected void onCreate(Bundle savedInstanceState )
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button1 = (Button) findViewById(R.id.button2);
		button1.setOnClickListener(this);

		button2 = (Button) findViewById(R.id.Button02);
		button2.setOnClickListener(this);

		button3 = (Button) findViewById(R.id.button1);
		button3.setOnClickListener(this);

		button4 = (Button) findViewById(R.id.Button01);
		button4.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu )
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main ,menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item )
	{
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if(id == R.id.action_settings)
		{
			Toast.makeText(this ,"六一快乐" ,Toast.LENGTH_LONG).show();
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v )
	{
		switch(v.getId())
		{
			case R.id.Button01:
				ImageView imageView = new ImageView(this);
				imageView.setImageResource(R.drawable.a3);
				Toast toast = new Toast(this);
				toast.setDuration(Toast.LENGTH_LONG);
				toast.setGravity(Gravity.CENTER_HORIZONTAL ,0 ,0);
				toast.setView(imageView);
				toast.show();
				break;

			case R.id.Button02:
				ImageView imageView1 = new ImageView(this);
				imageView1.setImageResource(R.drawable.a2);
				Toast toast1 = new Toast(this);
				toast1.setDuration(Toast.LENGTH_LONG);
				toast1.setGravity(Gravity.CENTER_HORIZONTAL ,0 ,0);
				toast1.setView(imageView1);
				toast1.show();
				break;

			case R.id.button1:
				ImageView imageView2 = new ImageView(this);
				imageView2.setImageResource(R.drawable.a1);
				Toast toast2 = new Toast(this);
				toast2.setDuration(Toast.LENGTH_LONG);
				toast2.setGravity(Gravity.CENTER_HORIZONTAL ,0 ,0);
				toast2.setView(imageView2);
				toast2.show();
				break;

			case R.id.button2:
				int len = 10;
				for(int i = 0 ; i < len ; i ++ )
				{
					Toast.makeText(this ,"六一快乐" ,Toast.LENGTH_SHORT).show();
				}
				break;
			default:
				break;
		}
	}
}
