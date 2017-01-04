package com.github.megatronking.svg.sample.drawables;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_sample_08 extends SVGRenderer {

    public ic_sample_08(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(48.0f);
        mHeight = dip2px(48.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(19.35f, 10.04f);
        mPath.cubicTo(18.67f, 6.59f, 15.64f, 4.0f, 12.0f, 4.0f);
        mPath.cubicTo(9.11f, 4.0f, 6.6f, 5.64f, 5.35f, 8.04f);
        mPath.cubicTo(2.34f, 8.36f, 0.0f, 10.91f, 0.0f, 14.0f);
        mPath.rCubicTo(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        mPath.rLineTo(13.0f, 0f);
        mPath.rCubicTo(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        mPath.rCubicTo(0.0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f);
        mPath.close();
        mPath.moveTo(19.35f, 10.04f);
        mPath.moveTo(14.0f, 13.0f);
        mPath.rLineTo(0f, 4.0f);
        mPath.rLineTo(-4.0f, 0f);
        mPath.rLineTo(0f, -4.0f);
        mPath.lineTo(7.0f, 13.0f);
        mPath.rLineTo(5.0f, -5.0f);
        mPath.rLineTo(5.0f, 5.0f);
        mPath.rLineTo(-3.0f, 0f);
        mPath.close();
        mPath.moveTo(14.0f, 13.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}