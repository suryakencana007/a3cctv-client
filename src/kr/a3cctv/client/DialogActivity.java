package kr.a3cctv.client;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;

public class DialogActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	}

	@Override
	protected void onStart() {
		super.onStart();
		new AlertDialog.Builder(this)
		.setMessage(R.string.gcm_receive)
		.setPositiveButton("OK", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				startActivity(new Intent(getApplicationContext(), WebViewActivity.class));
				finish();
			}
		})
		.setNegativeButton("NO", null)
		.show();
		
	}
	
}