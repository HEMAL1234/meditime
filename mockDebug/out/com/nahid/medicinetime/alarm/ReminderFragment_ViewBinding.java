// Generated code from Butter Knife. Do not modify!
package com.nahid.medicinetime.alarm;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.nahid.medicinetime.R;
import com.nahid.medicinetime.views.RobotoBoldTextView;
import com.nahid.medicinetime.views.RobotoRegularTextView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ReminderFragment_ViewBinding implements Unbinder {
  private ReminderFragment target;

  private View view7f0900ec;

  private View view7f0900ee;

  @UiThread
  public ReminderFragment_ViewBinding(final ReminderFragment target, View source) {
    this.target = target;

    View view;
    target.tvMedTime = Utils.findRequiredViewAsType(source, R.id.tv_med_time, "field 'tvMedTime'", RobotoBoldTextView.class);
    target.tvMedicineName = Utils.findRequiredViewAsType(source, R.id.tv_medicine_name, "field 'tvMedicineName'", RobotoBoldTextView.class);
    target.tvDoseDetails = Utils.findRequiredViewAsType(source, R.id.tv_dose_details, "field 'tvDoseDetails'", RobotoRegularTextView.class);
    view = Utils.findRequiredView(source, R.id.iv_ignore_med, "field 'ivIgnoreMed' and method 'onMedIgnoreClick'");
    target.ivIgnoreMed = Utils.castView(view, R.id.iv_ignore_med, "field 'ivIgnoreMed'", ImageView.class);
    view7f0900ec = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onMedIgnoreClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_take_med, "field 'ivTakeMed' and method 'onMedTakeClick'");
    target.ivTakeMed = Utils.castView(view, R.id.iv_take_med, "field 'ivTakeMed'", ImageView.class);
    view7f0900ee = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onMedTakeClick();
      }
    });
    target.linearLayout = Utils.findRequiredViewAsType(source, R.id.linearLayout, "field 'linearLayout'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ReminderFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvMedTime = null;
    target.tvMedicineName = null;
    target.tvDoseDetails = null;
    target.ivIgnoreMed = null;
    target.ivTakeMed = null;
    target.linearLayout = null;

    view7f0900ec.setOnClickListener(null);
    view7f0900ec = null;
    view7f0900ee.setOnClickListener(null);
    view7f0900ee = null;
  }
}
