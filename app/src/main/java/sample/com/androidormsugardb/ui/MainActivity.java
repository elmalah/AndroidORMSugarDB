package sample.com.androidormsugardb.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import sample.com.androidormsugardb.R;
import sample.com.androidormsugardb.models.SaveUserModel;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.text)
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ButterKnife.bind(this);
        SaveUserModel userModel = SaveUserModel.findById(SaveUserModel.class, 1l);
        text.setText(userModel.getUsername()+"");

//        List<SaveUserModel> books = SaveUserModel.listAll(SaveUserModel.class);
//        SaveUserModel.deleteAll(SaveUserModel.class);
    }
}
