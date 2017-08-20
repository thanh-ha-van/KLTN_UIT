package ha.thanh.kltn_uit.activities.splash;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;
import ha.thanh.kltn_uit.R;

public class SplashActivity extends AppCompatActivity implements SplashInterface.RequiredViewOps {
    private SplashPresenter mPresenter;
    private boolean isFirstRun = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);
        mPresenter = new SplashPresenter(SplashActivity.this, this);
        isFirstRun = mPresenter.isFirstRun();
    }

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            if (!isFirstRun) {
            } else {
            }
        }
    };

    @Override
    protected void onResume() {
        super.onResume();
        mPresenter.checkInAppServer();
    }
}
