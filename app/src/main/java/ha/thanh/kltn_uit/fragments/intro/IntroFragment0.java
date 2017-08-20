package ha.thanh.kltn_uit.fragments.intro;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.OnClick;
import ha.thanh.kltn_uit.R;


public class IntroFragment0 extends IntroFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_intro_0, container, false);
        ButterKnife.bind(this, view);
        initView();
        return view;
    }

    @Override
    public void animationViewPage() {

    }

    @Override
    public void disableAnimationViewPage() {

    }

    public void setOnClickNext(OnClickNext onClickNext) {
    }

    private void initView() {
    }

    @OnClick(R.id.tv_next)
    void OnclickButton() {
    }

    public interface OnClickNext {
        void onNextPage();
    }
}
