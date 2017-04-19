package com.example.gz_100_bufferknife;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

/**
 * 
 * @author: Loren
 * @create: 2016-6-22下午2:26:25
 * @desc: 
 * 注意使用注解时对象不能是private 形式的
 * 1.首先要对eclipse 进行配置才能使用：http://www.cnblogs.com/MonkeyAC/articles/4242312.html
 * 2.onCreate 中注册，onDestory中取消注册。
 * 3.最后注解使用即可。
 * 
 * http://sunlogin.oray.com/share?shareid=20684059
 */
public class MainActivity extends Activity {

	private static final String TAG = MainActivity.class.getSimpleName();
	
	@Bind(R.id.btn1)
	Button btn1;
	
	@Bind(R.id.btn2)
	Button btn2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ButterKnife.bind(this);//注册butterknife
		
	}
	/**
	 * @param v
	 * 
	 * 
	 */
	
	@OnClick({R.id.btn1,R.id.btn2})
	void onBtn1Click(View v){//单机事件多个id监听形式
		switch (v.getId()) {
		case R.id.btn1:
			btn1.setText("btn1 is on click!");
			break;
			
		case R.id.btn2:
			btn2.setText("btn2 is on click!");	
			break;
		}
	}
	
	@OnLongClick(R.id.btn1)
	 boolean onBtn1LongClick(){//长按事件，还有很多事件待研究
		btn1.setText("btn is on long click!");
		return true;
	}
	
	
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		ButterKnife.unbind(this);//取消butterknife
	}
}
