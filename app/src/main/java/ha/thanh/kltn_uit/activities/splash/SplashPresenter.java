package ha.thanh.kltn_uit.activities.splash;

import android.content.Context;

class SplashPresenter implements SplashInterface.RequiredPresenterOps {
    private SplashInterface.RequiredViewOps mView;
    private SplashModel mModel;


    SplashPresenter(Context context, SplashInterface.RequiredViewOps mView) {
        this.mView = mView;
        mModel = new SplashModel(context, this);
    }

    boolean isFirstRun() {
        return true;
    }

}
