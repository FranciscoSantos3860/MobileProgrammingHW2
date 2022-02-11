package francisco.santos.n01423860;


import androidx.appcompat.app.AppCompatActivity;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    int i=0;
    int image[]={R.drawable.image1,R.drawable.image2,R.drawable.image3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton btnOpen = findViewById(R.id.btnImg1);

        btnOpen.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {

                btnOpen.setImageResource(image[i]);
                i++;
                if (i == 3)
                    i = 0;

            }
        });

        Button open;
        AlertDialog.Builder builder;

        open = (Button) findViewById(R.id.open);
        builder = new AlertDialog.Builder(this);
        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                builder.setMessage("Do you want to close this application, click yes ?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.setTitle("Alert Dialog to close option");
                alert.show();
            }
        });

    }



}