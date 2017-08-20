package ha.thanh.kltn_uit.activities.changeconfig;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ha.thanh.kltn_uit.R;

public class ChangeConfigActivity extends AppCompatActivity implements ChangeConfigInterface.ViewOpt {

    private ChangeConfigPresenter mPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_config);
        mPresenter = new ChangeConfigPresenter(this, this);
    }

    @Override
    public void updateView(int someParameter) {

    }
}
