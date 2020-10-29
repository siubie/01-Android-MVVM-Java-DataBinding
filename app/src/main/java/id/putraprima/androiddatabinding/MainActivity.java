package id.putraprima.androiddatabinding;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.service.autofill.TextValueSanitizer;
import android.widget.TextView;

import id.putraprima.androiddatabinding.models.Mahasiswa;

public class MainActivity extends AppCompatActivity {

    private Mahasiswa mahasiswa;
    private TextView txtNama,txtNim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setMahasiswa();
    }

    public void setMahasiswa(){
        txtNama = findViewById(R.id.txtNama);
        txtNim = findViewById(R.id.txtNim);
        txtNama.setText("Putra Prima Arhandi");
        txtNim.setText("0410630078");
    }

}