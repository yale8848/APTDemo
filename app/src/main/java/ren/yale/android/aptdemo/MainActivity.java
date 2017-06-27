package ren.yale.android.aptdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import ren.yale.android.aptdemoviewfinder.ViewFinder;
import ren.yale.android.aptdemoviewfinderanno.BindView;
import ren.yale.android.aptdemoviewfinderanno.OnClick;


public class MainActivity extends AppCompatActivity {


    @BindView(R.id.tv_text)
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewFinder.inject(this);
    }

    @OnClick( {R.id.button})
    public void onSomethingClick() {



    }
}
