package thanh.ha.gifted.activities.mainActivity;

import android.content.Context;
import android.content.SharedPreferences;

import thanh.ha.gifted.constants.Constants;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by HaVan on 5/22/2017.
 */

public class MainPresenter {
    private Context context;
    private SharedPreferences sharedPreferences;

    public MainPresenter(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(Constants.CONFIG, MODE_PRIVATE);
    }

}
