package com.example.autocompletetextview_test;
/**
 * 
 * �Զ�����ı������д
 * �����������Ϣ��ʾ�Ը���Ϣ��ͷ���ı���Ϣ�б�������˵����ṩѡ��
 * 
 * */
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {

	private AutoCompleteTextView textView = null;
	private Button search = null;
	private static final String[] content = new String[]{"����","�������޹�˾","����������Ƽ�"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		textView = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
		search = (Button)findViewById(R.id.button1);
		//���봴��������
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,content);
		textView.setAdapter(adapter);
		
		search.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, textView.getText().toString(), Toast.LENGTH_SHORT).show();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
