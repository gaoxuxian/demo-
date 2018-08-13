package xx.demo.gles;

import android.view.ViewGroup;
import android.widget.FrameLayout;

import gles.Gles7View;
import xx.demo.activity.BaseActivity;

public class GlesActivity7 extends BaseActivity
{
    private Gles7View mItemView;

    @Override
    public void createChildren(FrameLayout parent, FrameLayout.LayoutParams params)
    {
        mItemView = new Gles7View(parent.getContext());
        params = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        parent.addView(mItemView, params);
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        mItemView.onResume();
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        mItemView.onPause();
    }
}
