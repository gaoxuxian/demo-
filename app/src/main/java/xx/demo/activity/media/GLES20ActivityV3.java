package xx.demo.activity.media;

import android.view.ViewGroup;
import android.widget.FrameLayout;

import xx.demo.activity.BaseActivity;
import xx.demo.camera.CameraGLView;

public class GLES20ActivityV3 extends BaseActivity
{
    private CameraGLView mCameraView;

    @Override
    public void createChildren(FrameLayout parent, FrameLayout.LayoutParams params)
    {
        mCameraView = new CameraGLView(parent.getContext());
        params = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        parent.addView(mCameraView, params);
    }

    @Override
    protected void onPause()
    {
        mCameraView.onStop();
        super.onPause();
    }

    @Override
    protected void onDestroy()
    {
        mCameraView.onStop();
        super.onDestroy();
    }
}
