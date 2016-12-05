package com.canvas.androidlongs.androidcanvasapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.canvas.androidlongs.androidcanvasapplication.base.BaseActivity;
import com.canvas.androidlongs.androidcanvasapplication.c2d.Common2DMainActivity;
import com.canvas.androidlongs.androidcanvasapplication.o3d.Common3DMainActivity;

public class HomeActivity extends BaseActivity {
    private Button mCanvs2dButton;
    private Button mCanvs3dButton;

    // Used to load the 'native-lib' library on application startup.
//    static {
//        System.loadLibrary("native-lib");
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initViewFunction();
        onClickFunction();

    }


    private void initViewFunction() {
        mCanvs2dButton = (Button) findViewById(R.id.bt_2d_main);
        mCanvs3dButton = (Button) findViewById(R.id.bt_3d_main);
    }

    private void onClickFunction() {
        mCanvs2dButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeActivity.this.startActivity(new Intent(HomeActivity.this, Common2DMainActivity.class));
            }
        });
        mCanvs3dButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeActivity.this.startActivity(new Intent(HomeActivity.this, Common3DMainActivity.class));
            }
        });
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    // public native String stringFromJNI();
}
