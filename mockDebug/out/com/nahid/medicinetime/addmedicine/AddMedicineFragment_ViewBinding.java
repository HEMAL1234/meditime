// Generated code from Butter Knife. Do not modify!
package com.nahid.medicinetime.addmedicine;

import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatSpinner;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.nahid.medicinetime.R;
import com.nahid.medicinetime.views.DayViewCheckBox;
import com.nahid.medicinetime.views.RobotoBoldTextView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AddMedicineFragment_ViewBinding implements Unbinder {
  private AddMedicineFragment target;

  private View view7f0900b9;

  private View view7f0900a8;

  private View view7f0900a6;

  private View view7f0900aa;

  private View view7f0900ab;

  private View view7f0900a9;

  private View view7f0900a5;

  private View view7f0900a7;

  private View view7f0901dc;

  private View view7f09018d;

  @UiThread
  public AddMedicineFragment_ViewBinding(final AddMedicineFragment target, View source) {
    this.target = target;

    View view;
    target.editMedName = Utils.findRequiredViewAsType(source, R.id.edit_med_name, "field 'editMedName'", EditText.class);
    view = Utils.findRequiredView(source, R.id.every_day, "field 'everyDay' and method 'onCheckboxClicked'");
    target.everyDay = Utils.castView(view, R.id.every_day, "field 'everyDay'", AppCompatCheckBox.class);
    view7f0900b9 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCheckboxClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.dv_sunday, "field 'dvSunday' and method 'onCheckboxClicked'");
    target.dvSunday = Utils.castView(view, R.id.dv_sunday, "field 'dvSunday'", DayViewCheckBox.class);
    view7f0900a8 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCheckboxClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.dv_monday, "field 'dvMonday' and method 'onCheckboxClicked'");
    target.dvMonday = Utils.castView(view, R.id.dv_monday, "field 'dvMonday'", DayViewCheckBox.class);
    view7f0900a6 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCheckboxClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.dv_tuesday, "field 'dvTuesday' and method 'onCheckboxClicked'");
    target.dvTuesday = Utils.castView(view, R.id.dv_tuesday, "field 'dvTuesday'", DayViewCheckBox.class);
    view7f0900aa = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCheckboxClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.dv_wednesday, "field 'dvWednesday' and method 'onCheckboxClicked'");
    target.dvWednesday = Utils.castView(view, R.id.dv_wednesday, "field 'dvWednesday'", DayViewCheckBox.class);
    view7f0900ab = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCheckboxClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.dv_thursday, "field 'dvThursday' and method 'onCheckboxClicked'");
    target.dvThursday = Utils.castView(view, R.id.dv_thursday, "field 'dvThursday'", DayViewCheckBox.class);
    view7f0900a9 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCheckboxClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.dv_friday, "field 'dvFriday' and method 'onCheckboxClicked'");
    target.dvFriday = Utils.castView(view, R.id.dv_friday, "field 'dvFriday'", DayViewCheckBox.class);
    view7f0900a5 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCheckboxClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.dv_saturday, "field 'dvSaturday' and method 'onCheckboxClicked'");
    target.dvSaturday = Utils.castView(view, R.id.dv_saturday, "field 'dvSaturday'", DayViewCheckBox.class);
    view7f0900a7 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCheckboxClicked(p0);
      }
    });
    target.checkboxLayout = Utils.findRequiredViewAsType(source, R.id.checkbox_layout, "field 'checkboxLayout'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.tv_medicine_time, "field 'tvMedicineTime' and method 'onMedicineTimeClick'");
    target.tvMedicineTime = Utils.castView(view, R.id.tv_medicine_time, "field 'tvMedicineTime'", RobotoBoldTextView.class);
    view7f0901dc = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onMedicineTimeClick();
      }
    });
    target.tvDoseQuantity = Utils.findRequiredViewAsType(source, R.id.tv_dose_quantity, "field 'tvDoseQuantity'", EditText.class);
    view = Utils.findRequiredView(source, R.id.spinner_dose_units, "field 'spinnerDoseUnits' and method 'onSpinnerItemSelected'");
    target.spinnerDoseUnits = Utils.castView(view, R.id.spinner_dose_units, "field 'spinnerDoseUnits'", AppCompatSpinner.class);
    view7f09018d = view;
    ((AdapterView<?>) view).setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
      @Override
      public void onItemSelected(AdapterView<?> p0, View p1, int p2, long p3) {
        target.onSpinnerItemSelected(p2);
      }

      @Override
      public void onNothingSelected(AdapterView<?> p0) {
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    AddMedicineFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.editMedName = null;
    target.everyDay = null;
    target.dvSunday = null;
    target.dvMonday = null;
    target.dvTuesday = null;
    target.dvWednesday = null;
    target.dvThursday = null;
    target.dvFriday = null;
    target.dvSaturday = null;
    target.checkboxLayout = null;
    target.tvMedicineTime = null;
    target.tvDoseQuantity = null;
    target.spinnerDoseUnits = null;

    view7f0900b9.setOnClickListener(null);
    view7f0900b9 = null;
    view7f0900a8.setOnClickListener(null);
    view7f0900a8 = null;
    view7f0900a6.setOnClickListener(null);
    view7f0900a6 = null;
    view7f0900aa.setOnClickListener(null);
    view7f0900aa = null;
    view7f0900ab.setOnClickListener(null);
    view7f0900ab = null;
    view7f0900a9.setOnClickListener(null);
    view7f0900a9 = null;
    view7f0900a5.setOnClickListener(null);
    view7f0900a5 = null;
    view7f0900a7.setOnClickListener(null);
    view7f0900a7 = null;
    view7f0901dc.setOnClickListener(null);
    view7f0901dc = null;
    ((AdapterView<?>) view7f09018d).setOnItemSelectedListener(null);
    view7f09018d = null;
  }
}
