package android_serialport_api;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.bjw.ComAssistant.R;

/**
 * serialport api��jniȡ��http://code.google.com/p/android-serialport-api/
 * 
 * @author benjaminwan �������֣�֧��4����ͬʱ��д ��������ʱ�Զ����������豸 n,8,1��û��ѡ
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
	// ----------------------------------------------------�����ť�����Ͱ�ť
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