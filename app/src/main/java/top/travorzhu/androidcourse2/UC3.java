package top.travorzhu.androidcourse2;

import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class UC3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc3);

        Button button=findViewById(R.id.button10);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        final ImageView imageView[]={findViewById(R.id.imageView),findViewById(R.id.imageView2),findViewById(R.id.imageView3),findViewById(R.id.imageView4),findViewById(R.id.imageView5)};

        final int[] i = {0};
        new CountDownTimer(1000,1000) {

            @Override
            public void onTick(long millisUntilFinished) {}

            @Override
            public void onFinish() {
                for (int j=0;j<5;j++){
                    if (j==i[0])
                        imageView[j].setVisibility(View.VISIBLE);
                    else
                        imageView[j].setVisibility(View.INVISIBLE);
                }
                i[0]++;
                if(i[0] == 5) i[0] =0;
                start();
            }
        }.start();
    }






}
