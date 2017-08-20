package ha.thanh.kltn_uit.activities.splash;

import android.content.Context;
import android.content.SharedPreferences;

class SplashModel {

    private SharedPreferences sPref;
    private Context context;
    private SplashInterface.RequiredPresenterOps mPresenter;

    SplashModel(Context context, SplashInterface.RequiredPresenterOps mPresenter) {
        this.context = context;
        loadAllConfig();
    }

    private void loadAllConfig() {
        // some config
    }
}
