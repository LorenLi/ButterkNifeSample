// Generated code from Butter Knife. Do not modify!
package com.example.gz_100_bufferknife;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.example.gz_100_bufferknife.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230721, "field 'btn2' and method 'onBtn1Click'");
    target.btn2 = finder.castView(view, 2131230721, "field 'btn2'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onBtn1Click(p0);
        }
      });
    view = finder.findRequiredView(source, 2131230720, "field 'btn1', method 'onBtn1Click', and method 'onBtn1LongClick'");
    target.btn1 = finder.castView(view, 2131230720, "field 'btn1'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onBtn1Click(p0);
        }
      });
    view.setOnLongClickListener(
      new android.view.View.OnLongClickListener() {
        @Override public boolean onLongClick(
          android.view.View p0
        ) {
          return target.onBtn1LongClick();
        }
      });
  }

  @Override public void unbind(T target) {
    target.btn2 = null;
    target.btn1 = null;
  }
}
