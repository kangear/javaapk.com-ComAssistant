package android_serialport_api;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.bjw.ComAssistant.R;

/**
 * serialport api和jni取自http://code.google.com/p/android-serialport-api/
 * 
 * @author benjaminwan 串口助手，支持4串口同时读写 程序载入时自动搜索串口设备 n,8,1，没得选
 */
public class ComAssistantActivity extends Activity {
	EditText editTextRecDisp;
	Button ButtonSendCOMA;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sb);
		setControls();
	}

	// ----------------------------------------------------
	private void setControls() {
		
		editTextRecDisp = (EditText) findViewById(R.id.editTextRecDisp);
		ButtonSendCOMA = (Button) findViewById(R.id.ButtonSendCOMA);
		ButtonSendCOMA.setOnClickListener(new ButtonClickEvent());
	
	}
	// ----------------------------------------------------清除按钮、发送按钮
	class ButtonClickEvent implements View.OnClickListener {
		public void onClick(View v) {
			if (v == ButtonSendCOMA) {
				// sendPortData(ComA, "0208107f10000377");
//				ClockService cs = new ClockService(editTextRecDisp);
//				startService(new Intent(ComAssistantActivity.this, ClockService.class));
			}
		}
	}
}