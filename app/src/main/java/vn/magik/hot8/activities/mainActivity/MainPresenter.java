package vn.magik.hot8.activities.mainActivity;

import android.content.Context;
import android.content.SharedPreferences;

import vn.magik.hot8.constants.Constants;
import vn.magik.hot8.constants.Globals;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by HaVan on 5/22/2017.
 */

public class MainPresenter {
    private Context context;
    private SharedPreferences sharedPreferences;

    public MainPresenter(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(Constants.FILE_CONFIG, MODE_PRIVATE);
    }

}
