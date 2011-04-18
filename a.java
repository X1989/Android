package h.Hello2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;
import android.widget.CompoundButton.OnCheckedChangeListener;
public class Hello2 extends Activity implements RadioGroup.OnCheckedChangeListener {
	RadioGroup group1;
	RadioButton Rock,Scissors,Paper;
	TextView view;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        group1=(RadioGroup)findViewById(R.id.group1);
        group1.setOnCheckedChangeListener(this);
        view=(TextView)findViewById(R.id.result);
    }

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		// TODO Auto-generated method stub
		if (group==group1){
			if (checkedId==R.id.radio1){
				view.setText("Rock");
			}
			else if (checkedId==R.id.radio2){
				view.setText("Scissors");
			}
			else{
				view.setText("Paper");
			}
		}
			
	}
}