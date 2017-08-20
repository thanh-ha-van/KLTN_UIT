package ha.thanh.kltn_uit.fragments.intro;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import ha.thanh.kltn_uit.R;


public class IntroFragment2 extends IntroFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_intro_2, container, false);
        ButterKnife.bind(this, view);
        return view;
    }


    @Override
    public void animationViewPage() {

    }

    @Override
    public void disableAnimationViewPage() {

    }

}
