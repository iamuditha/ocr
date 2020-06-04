// Generated code from Butter Knife. Do not modify!
package com.example.readText;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view2131165273;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    target.firstImage = Utils.findRequiredViewAsType(source, R.id.ocr_image, "field 'firstImage'", ImageView.class);
    target.ocrText = Utils.findRequiredViewAsType(source, R.id.ocr_text, "field 'ocrText'", TextView.class);
    view = Utils.findRequiredView(source, R.id.scan_button, "method 'onClickScanButton'");
    view2131165273 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickScanButton();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.firstImage = null;
    target.ocrText = null;

    view2131165273.setOnClickListener(null);
    view2131165273 = null;
  }
}
