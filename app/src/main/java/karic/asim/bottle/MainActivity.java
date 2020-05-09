package karic.asim.bottle;



import android.os.Bundle;
import android.view.View;

import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ImageView img_bottle=(ImageView)findViewById(R.id.image_bottle);


        img_bottle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random=new Random();
                int intRot=random.nextInt(1000);



                float rotation=intRot+1200.0f;


                img_bottle.animate().rotationBy(rotation).setDuration(2000);





            }
        });

    }
}
