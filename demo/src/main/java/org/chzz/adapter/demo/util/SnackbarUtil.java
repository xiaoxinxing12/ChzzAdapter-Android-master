package org.chzz.adapter.demo.util;

import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * 作者:copy 邮件:2499551993@qq.com
 * 创建时间:15/6/25 17:55
 * 描述:
 */
public class SnackbarUtil {

    private SnackbarUtil() {
    }

    public static void show(View view, CharSequence text) {
        Snackbar snackbar = Snackbar.make(view, text, Snackbar.LENGTH_SHORT);
        snackbar.getView().setBackgroundColor(Color.parseColor("#E984FA"));
        if (text.length() > 10) {
            snackbar.setDuration(Snackbar.LENGTH_LONG);
        }
        snackbar.show();
    }
}