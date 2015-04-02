package gl.chartview.shaders;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;

public class ChartSurfaceView extends GLSurfaceView
{
	public ChartRenderer mRenderer = null;

	public ChartSurfaceView(Context context) {
		super(context);

		// Create an OpenGL ES 2.0 context.
		setEGLContextClientVersion(2);

		// Set the Renderer for drawing on the GLSurfaceView
		mRenderer = new ChartRenderer(context);
		setRenderer(mRenderer);
	}

	@Override 
	public boolean onTouchEvent(MotionEvent e) {
		// MotionEvent reports input details from the touch screen
		// and other input controls. In this case, you are only
		// interested in events where the touch position changed.

		switch (e.getAction()) {
			case MotionEvent.ACTION_UP:
				mRenderer.showText = !mRenderer.showText;
				break;
		}

		return true;
	} 
}