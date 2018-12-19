package com.qindadai.myperformance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = Router.ROUTERMAIN)
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        TextView demo1 = (TextView) findViewById(R.id.demo1);
        TextView demo2 = (TextView) findViewById(R.id.demo2);
        tv.setText(stringFromJNI());

        tv.setOnClickListener(this);
        demo1.setOnClickListener(this);
        demo2.setOnClickListener(this);
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sample_text:
                break;
            case R.id.demo1:
                ARouter.getInstance().build(Router.ROUTERDEMO1).navigation();
                break;
            case R.id.demo2:
                break;
            default:
                break;
        }
    }
}
