package ha.thanh.kltn_uit.activities.changeconfig;

import android.content.Context;

/**
 * Created by HaVan on 8/20/2017.
 */

public class ChangeConfigPresenter implements ChangeConfigInterface.PresenterOpt {

    private ChangeConfigModel model;
    private ChangeConfigInterface.ViewOpt mView;

    ChangeConfigPresenter(Context context, ChangeConfigInterface.ViewOpt viewOpt) {
        this.mView = viewOpt;
        this.model = new ChangeConfigModel(context, this);
    }

    @Override
    public void doSomething() {

    }
}
