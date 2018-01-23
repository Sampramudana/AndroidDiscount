package com.pramudana.sam.androiddiscount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etSum, etPrice;
    Button btnCount;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSum = (EditText) findViewById(R.id.etSum);
        etPrice = (EditText) findViewById(R.id.etPrice);
        txtResult = (TextView) findViewById(R.id.txtResult);
        btnCount = (Button) findViewById(R.id.btnCount);

        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String sSum = etSum.getText().toString();
                String sPrice = etPrice.getText().toString();

                int iSum = Integer.parseInt(sSum);
                int iPrice = Integer.parseInt(sPrice);

                int jumlah = iPrice * iSum;
                int diskon = jumlah / 2;

                if (iSum >= 10){
                    txtResult.setText("Harga Total : " + jumlah + "\nHarga Diskon : " + diskon);
                    Toast.makeText(getApplicationContext(), "Selamat anda mendapatkan Discount", Toast.LENGTH_LONG).show();
                }else if (iSum <= 10){
                    txtResult.setText("Harga Total : " + jumlah);
                    Toast.makeText(getApplicationContext(), "Sayang Sekali, anda belum mendapatkan Discount", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
